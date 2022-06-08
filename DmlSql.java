import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

public class DmlSql {

	public static void main(String[] args) throws SQLException {
		
		//Create a Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales","root","Patna@2022");
		
		//Create a querry/Statement
		Statement stmt = con.createStatement();
		
		String s ="INSERT INTO T1 VALUES(?,?,?)";
		String z = "SELECT * FROM T1";
		
		
		
		
		System.out.println(stmt.execute(s));
		System.out.println("Successfully Inserted");
		stmt.close();
		
		

	}

}
