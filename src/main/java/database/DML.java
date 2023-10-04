package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Account;
import entity.Admin;
import entity.HealthByPrisoner;
import entity.Prisoners;
import entity.RelativesByPrisoner;
import entity.Wardens;

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
	public static List<Wardens> selectTableWardensbyID(int a) throws SQLException{
		ps=ConnectToDB.getConn().prepareStatement("select * from Wardens where warden_id="+a);
		rs=ps.executeQuery();
		List<Wardens> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new Wardens(rs.getInt("warden_id"),rs.getString("first_name"),rs.getString("last_name"),(rs.getDate("date_of_birth")).toLocalDate(),rs.getString("gender"),rs.getString("phone_number"),rs.getString("email"),rs.getString("address"),rs.getString("position"),rs.getDate("start_date").toLocalDate(),rs.getInt("day_off"),rs.getBoolean("is_Working"),rs.getInt("salary"),rs.getInt("areas_id")));
		}
		return  list;
	}
	public static List<Wardens> selectTableWardens() throws SQLException{
		ps=ConnectToDB.getConn().prepareStatement("select * from Wardens");
		rs=ps.executeQuery();
		List<Wardens> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new Wardens(rs.getInt("warden_id"),rs.getString("first_name"),rs.getString("last_name"),(rs.getDate("date_of_birth")).toLocalDate(),rs.getString("gender"),rs.getString("phone_number"),rs.getString("email"),rs.getString("address"),rs.getString("position"),rs.getDate("start_date").toLocalDate(),rs.getInt("day_off"),rs.getBoolean("is_Working"),rs.getInt("salary"),rs.getInt("areas_id")));
		}
		return  list;
	}
	public static void deleteByID(int a,String table,String key) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement("DELETE FROM "+ table +" WHERE "+key+"="+a);
		ps.executeUpdate();
		ps.close();
	}
}

