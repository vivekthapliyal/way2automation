package com.demoqa.util;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;


public class Db_connection {
		public static void main(String[] args) {
			Connection con=null;
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","cws");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("Select * from test");
				while(((ResultSet) rs).next())  {
					System.out.println( rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
					//con.close();  
				}
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
			}
			
		}
}
