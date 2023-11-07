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
	
	public static void deleteByID(int a,String table,String key) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement("DELETE FROM "+ table +" WHERE "+key+"="+a);
		ps.executeUpdate();
		ps.close();
	}
public static List<P_C_A> selectTablePrionersEmployment() throws SQLException{
		
		ps=ConnectToDB.getConn().prepareStatement("SELECT PrisonerEmployment.employer_name FROM Wardens\r\n"
				+ "INNER JOIN WorkShiftsByWarden ON Wardens.shift_number = WorkShiftsByWarden.shift_number\r\n"
				+ "INNER JOIN Areas ON WorkShiftsByWarden.area_id = Areas.area_id\r\n"
				+ "INNER JOIN CellsByPrisoner ON Areas.area_id = CellsByPrisoner.area_id\r\n"
				+ "INNER JOIN Prisoners ON CellsByPrisoner.cell_id = Prisoners.cell_id\r\n"
				+ "INNER JOIN PrisonerEmployment ON Prisoners.emId = PrisonerEmployment.employment_id");
		rs=ps.executeQuery();
		List<P_C_A> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new P_C_A(rs.getInt("warden_id"),rs.getString("employer_name")));
		}
		return list;
		
	}
	public static void UpdateEmployer(String employmentname, int id) throws SQLException{
		ps = ConnectToDB.getConn().prepareStatement("UPDATE PrisonerEmployment SET employer_name= " + employmentname + "WHERE prisoner_id= " + id);
		ps.executeUpdate();
		ConnectToDB.getConn().close();	
	}

}	

