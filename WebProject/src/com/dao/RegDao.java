package com.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.connections.DBconnection;
import com.models.RegModel;

public class RegDao 
{
	private Statement stmt = null;
	DBconnection instance = DBconnection.getInstance();
	
	public void add(RegModel model) 
	{
		try {
			stmt=instance.getConnection().createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sql = "insert into reg(ID, First Nmae, Last Name, "
				+ "Address)values('"+model.getLastName()+"','"+model.getLastName()+"')";      
		
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getAll() throws SQLException
	{
		try 
		{
			stmt=instance.getConnection().createStatement();

		String sql="Select * from registration";
		ResultSet rs;
		rs = stmt.executeQuery(sql);


		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}
		
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
