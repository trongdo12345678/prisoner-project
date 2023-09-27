package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.HealthByPrisoner;
import entity.Prisoners;
import entity.RelativesByPrisoner;

public class DML {

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
}

