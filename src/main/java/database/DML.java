package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Account;
import entity.Admin;
import entity.All1;
import entity.HealthByPrisoner;
import entity.P_C_A;
import entity.Prisoners;
import entity.RelativesByPrisoner;
import entity.Wardens;
import entity.WorkShiftsByWarden;

public class DML {

	private static PreparedStatement ps=null;
	private static ResultSet rs=null;
	
	public static void insertRelative(RelativesByPrisoner rb) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement(
				"INSERT INTO RelativesByPrisoner (prisoner_id,relative_name,contact_info,relationship) "
				+ "values(?,?,?,?)");
		ps.setInt(1,rb.getId());
		ps.setString(2,rb.getRelativeName());
		ps.setString(3,rb.getContactInfo());
		ps.setString(4,rb.getRelationship() ); 
		
		ps.executeUpdate();
		ConnectToDB.getConn().close();	
	}
	public static void insertHealth(HealthByPrisoner hp) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement(
				"INSERT INTO HealthByPrisoner (prisoner_id,medical_history,current_conditions,allergies) "
				+ "values(?,?,?,?)");
		ps.setInt(1,hp.getId());
		ps.setString(2,hp.getMedicalHistory());
		ps.setString(3,hp.getCurrentConditions());
		ps.setString(4,hp.getAllergies() ); 
		
		ps.executeUpdate();
		ConnectToDB.getConn().close();	
	}
	public static void insertAccount(Account ac) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement(
				"INSERT INTO Account (warden_id,username,password,active) "
				+ "values(?,?,?,?)");
		ps.setInt(1,ac.getWarden_id());
		ps.setString(2,ac.getUsername());
		ps.setString(3,ac.getPassword() ); 
		ps.setInt(4, 0);
		
		ps.executeUpdate();
		ConnectToDB.getConn().close();	
	}
	public static void alterActive(Account ac) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement(
				"UPDATE  Account SET active="+ac.getActive()+" WHERE account_id="
				+ ac.getAccount_id());	
		ps.executeUpdate();
		ConnectToDB.getConn().close();	
	}
	public static List<Account> selectTableAccount() throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement("select * from Account");
		rs=ps.executeQuery();
		List<Account> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new Account(rs.getInt("account_id"),rs.getInt("warden_id"),rs.getString("username"),rs.getString("password"),rs.getInt("active")));
		}
		return  list;
	}
	public static void UpdateAccount(Account ac) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement("UPDATE Account "
				+ "SET warden_id ="+ac.getWarden_id() 
				+ ", password ="+ ac.getPassword()
				+ " WHERE account_id="+ac.getAccount_id()+";");
		rs=ps.executeQuery();
	}
	public static List<Admin> selectTableAdmin() throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement("select * from Admin");
		rs=ps.executeQuery();
		List<Admin> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new Admin(rs.getString("username"),rs.getString("password"),rs.getString("email"),rs.getInt("key")));
		}
		return  list;
	}
	public static List<All1> selectTableWardens() throws SQLException{
		ps=ConnectToDB.getConn().prepareStatement("SELECT\r\n"
				+ "Wardens.*,\r\n"
				+ "WorkShiftsByWarden.*,\r\n"
				+ "Areas.* \r\n"
				+ "FROM\r\n"
				+ "Wardens\r\n"
				+ "INNER JOIN WorkShiftsByWarden\r\n"
				+ "ON\r\n"
				+ "Wardens.shift_number =WorkShiftsByWarden.shift_number\r\n"
				+ "INNER JOIN\r\n"
				+ "Areas\r\n"
				+ "ON\r\n"
				+ "WorkShiftsByWarden.area_id =Areas.area_id\r\n");
		rs=ps.executeQuery();
		List<All1> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new All1(rs.getInt("warden_id"),rs.getString("first_name"),rs.getString("last_name"),(rs.getDate("date_of_birth")).toLocalDate(),rs.getString("gender"),rs.getString("phone_number"),rs.getString("email"),rs.getString("address"),rs.getString("position"),rs.getDate("start_date").toLocalDate(),rs.getInt("day_off"),rs.getBoolean("is_Working"),rs.getInt("salary"),rs.getInt("shift_number"),
								rs.getString("shift_type"),rs.getDate("shift_date").toLocalDate(),rs.getTime("start_time"),rs.getTime("end_time"),rs.getInt("area_id"),rs.getString("area_name"),rs.getString("description"),rs.getString("areas_location_description")));
		}
		return list;
	}
	public static List<P_C_A> selectTablePrioners() throws SQLException{
		
		ps=ConnectToDB.getConn().prepareStatement("SELECT\r\n"
				+ "Prisoners.*,\r\n"
				+ "CellsByPrisoner.*,\r\n"
				+ "Areas.*\r\n"
				+ "FROM\r\n"
				+ "Prisoners\r\n"
				+ "INNER JOIN CellsByPrisoner\r\n"
				+ "ON\r\n"
				+ "Prisoners.cell_id=CellsByPrisoner.cell_id\r\n"
				+ "INNER JOIN\r\n"
				+ "Areas\r\n"
				+ "ON\r\n"
				+ "CellsByPrisoner.area_id =Areas.area_id");
		rs=ps.executeQuery();
		List<P_C_A> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new P_C_A(rs.getInt("prisoner_id"),rs.getString("first_name"),rs.getString("last_name"),(rs.getDate("date_of_birth")).toLocalDate(),rs.getString("nationality"),rs.getString("gender"),rs.getDate("date_of_entry").toLocalDate(),rs.getDate("release_date").toLocalDate(),rs.getInt("cell_id"),rs.getString("conviction"),rs.getString("punishment"),rs.getString("religion"),rs.getString("image"),
					rs.getInt("cell_number"),rs.getString("status"),rs.getString("status"),rs.getString("size"),rs.getInt("Floor_N"),rs.getInt("area_id"),rs.getString("area_name"),rs.getString("description"),rs.getString("areas_location_description")));
		}
		return list;
		
	}
	
	public static void deleteByID(int a,String table,String key) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement("DELETE FROM "+ table +" WHERE "+key+"="+a);
		ps.executeUpdate();
		ps.close();
	}

}	

