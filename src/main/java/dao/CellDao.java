package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.ConnectToDB;
import entity.Areas;
import entity.CellsByPrisoner;

public class CellDao {

	private static PreparedStatement ps=null;
	private static ResultSet rs=null;
	
	public static void insertCell(Areas pr) throws SQLException {	
		ps=ConnectToDB.getConn().prepareStatement(
				"INSERT INTO Areas (area_name,description,areas_location_description) "
				+ "values(?,?,?)");
		ps.setString(1,pr.getAreaName());
		ps.setString(2,pr.getDescription());
		ps.setString(3,pr.getAreasLocationDescription());
		ps.executeUpdate();
		ConnectToDB.getConn().close();	
	}
	
	public static List<CellsByPrisoner> selectTableCell() throws SQLException{
		ps=ConnectToDB.getConn().prepareStatement("select * from CellsByPrisoner");
		rs=ps.executeQuery();
		List<CellsByPrisoner> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new CellsByPrisoner(rs.getInt("cell_id"),rs.getInt("cell_number"),rs.getString("status"),rs.getString("size"),rs.getInt("area_id"),rs.getInt("Floor_N")));
		}
		return list;
	}
}
