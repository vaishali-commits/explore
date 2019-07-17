package connection;
import java.sql.*;
public class ConnectionProvider {
private static Connection conn=null;
private ConnectionProvider(){}
public static Connection getConn(){
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return conn;
}
}
