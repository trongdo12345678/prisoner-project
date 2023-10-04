package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.ConnectToDB;
import entity.Prisoners;
import entity.Wardens;

public class PrisonersDao {
	private static PreparedStatement ps=null;
	private static ResultSet rs=null;
	
	public static void insertPrisoner(Prisoners pr) throws SQLException {	
		ps=ConnectToDB.getConn().prepareStatement(
				"INSERT INTO Prisoners (prisoner_id,first_name,last_name,date_of_birth,nationality,gender,date_of_entry,release_date,cell_id,conviction,punishment,religion,image) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setInt(1,pr.getId());
		ps.setString(2,pr.getFirstName());
		ps.setString(3,pr.getLastName());
		ps.setDate(4, java.sql.Date.valueOf(pr.getDateOfBirth())); 
		ps.setString(5,pr.getNationality());
		ps.setString(6,pr.getIsMale());
		ps.setDate(7, java.sql.Date.valueOf(pr.getDateOfEntry())); 
		ps.setDate(8, java.sql.Date.valueOf(pr.getReleaseDate())); 
		ps.setInt(9,pr.getCellId());
		ps.setString(10,pr.getConviction());
		ps.setString(11,pr.getPunishment());
		ps.setString(12,pr.getReligion());
		ps.setString(13,pr.getImage());
		
		ps.executeUpdate();
		ConnectToDB.getConn().close();	
	}
	
	public static List<Prisoners> selectTablePrisoners() throws SQLException{
		ps=ConnectToDB.getConn().prepareStatement("select * from Prisoners");
		rs=ps.executeQuery();
		List<Prisoners> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new Prisoners(rs.getInt("prisoner_id"),rs.getString("first_name"),rs.getString("last_name"),(rs.getDate("date_of_birth")).toLocalDate(),rs.getString("nationality"),rs.getString("gender"),rs.getDate("date_of_entry").toLocalDate(),rs.getDate("release_date").toLocalDate(),rs.getInt("cell_id"),rs.getString("conviction"),rs.getString("punishment"),rs.getString("religion"),rs.getString("image")));
		}
		return  list;
	}
}
