package JDBC_DATABASE_PRGM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class JdbcDatabasePrgm {
	@Test
	public void updatedatebase() throws SQLException {
		boolean flag=false;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the  name :");
		String name = sc.next();
		

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	/*	Driver driver=new Driver();
		DriverManager.registerDriver(driver);*/
		    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss","root","root");
		Statement statement = conn.createStatement();
String query="select * from amar";
ResultSet result = statement.executeQuery(query);

while (result.next()) {
	if(result.getString(1).equals(name)) ;
	System.out.println("YES");
	flag=true;
	break;
}

boolean flag1;

if(flag1=false) {
	System.out.println("NO");
	String query2="insert into amar values('"+ name +"')";
	int values = statement.executeUpdate(query2);
	System.out.println(values);
	
}
		
	conn.close();	
		
	}

}
