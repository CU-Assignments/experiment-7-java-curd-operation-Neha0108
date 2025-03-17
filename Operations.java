package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Operations {
	
	public static void AddUser(User user) throws SQLException {
		
			String query = "Insert into studentdata (StudentID,StudentName,StudentCgpa,StudentYear) VALUES (?,?,?,?)";
			
			try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nehu","root","neha74191"))
			
			{
				PreparedStatement pstm = con.prepareStatement(query);
				pstm.setInt(1, user.getStudentID());
	            pstm.setString(2, user.getStudentName());
	            pstm.setFloat(3, user.getStudentCgpa());
	            pstm.setInt(4, user.getStudentYear()); 
	            pstm.execute();	
	            con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
	}

	public static void DeleteUser(int studentID) throws SQLException {
		
		String query = "DELETE from studentdata where StudentId = ?";
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nehu","root","neha74191"))
		{
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, studentID);
			pstm.execute();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void ViewUser(int studentID) throws SQLException {
		
		String query = "Select* from studentdata where StudentID = ?";
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nehu","root","neha74191"))
		{
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(query);
			while(rs.next())
			{
				System.out.println("StudentID: " + rs.getInt(1));
				System.out.println("StudentName: " + rs.getString(2));
				System.out.println("StudentCgpa: " + rs.getFloat(3));
				System.out.println("StudentYear: " + rs.getInt(4));
			}
			con.close();
			System.out.println(" User viewd successfully ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void ViewAllUsers() throws SQLException {
		
		String query = "Select* from studentdata";
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nehu","root","neha74191"))
		{
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(query);
			while(rs.next())
			{
				System.out.println("StudentID: " + rs.getInt(1));
				System.out.println("StudentName: " + rs.getString(2));
				System.out.println("StudentCgpa: " + rs.getFloat(3));
				System.out.println("StudentYear: " + rs.getInt(4));
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void UpdateUser(int studentID, User user) {
		
		String query = "Update studentdata Set StudentName = ? , StudentCgpa = ?, StudentYear = ? where StudentID = ? ";
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nehu","root","neha74191"))
		{
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, studentID);
            pstm.setString(2, user.getStudentName());
            pstm.setFloat(3, user.getStudentCgpa());
            pstm.setInt(4, user.getStudentYear()); 
            pstm.execute();	
            con.close();		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
