package lms;
import java.sql.Connection;
import java.sql.DriverManager;

public class Provider {
	static Connection con=null;
	public static Connection getOracleConnection(){
		if(con==null){
			try{
				Class.forName("oracle.jdbc.OracleDriver");
				con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shiva");
					}
			catch(Exception e){
				
			}
		}
		return con;
	}

}
