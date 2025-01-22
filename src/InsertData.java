import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		
		try
		{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/1ajava", "root", "root");
		System.out.println("Connections success");
		Statement statement=connection.createStatement();
		String query ="insert into user(`name`,`salary`) values('Test','1234')";
		statement.executeUpdate(query);
		System.out.println("Data Inserted Successfully");
		
		
		
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
}







