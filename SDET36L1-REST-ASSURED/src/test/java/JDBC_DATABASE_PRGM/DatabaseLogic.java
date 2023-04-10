package JDBC_DATABASE_PRGM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DatabaseLogic {

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);
	        int N = Integer.parseInt(br.readLine().trim());
	        String[] S = new String[N];
	        for(int i=0; i<N; i++) {
	            S[i] = br.readLine();
	        }
	        String[] out_= solve(N, S);
	        for(int i=0;i<N;i++) {
	            System.out.println(out_[i]);
	        }
	        wr.close();
	        br.close();
	    }
	    static String[] solve(int N, String[] S) throws SQLException{
	        String []out =new String [N];
	        for(int i=0;i<N; i++) {
	        	Driver driver=new Driver();
	    		DriverManager.registerDriver(driver);
	    		    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss","root","root");
	    		Statement statement = connection.createStatement();
	    		ResultSet result = statement.executeQuery("select * from amar");
	    		int count=0;
	    		while(result.next()) {
	    			if(result.getString("empName").equals(S[i])) {
	    				count ++;
	    				break;	
	    			}
	    		}
	    		if(count==1) {
	    			out[i]="yes";
	    		}
	    		else {
	    			out[i]="no";
	    		}
	    		connection.close();
	        }
	        return out;      
	}

}
