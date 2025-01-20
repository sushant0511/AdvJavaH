import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestCode {

	public static void main(String[] args) {
		
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajavasech", "root", "root");
			System.out.println("Connction Success");
			Statement statement=connection.createStatement();
			
			//System.out.println("Enter your id to update");
			Scanner scanner=new Scanner(System.in);
			//int id=scanner.nextInt();
			ResultSet set1=statement.executeQuery("SELECT * FROM ajavasech.user ");
			float msal=0.0f;
			String n=null;
			while(set1.next())
			{
				if(msal<set1.getFloat(4))
				{
					
					msal=set1.getFloat(4);
					n=set1.getString(2);
				}
				//System.out.println(set1.getString(2)+"  "+set1.getString(3)+"  "+set1.getFloat(4));
			}
			System.out.println(msal+" hold by "+n);
			System.out.println("Exit");
			}
			catch (Exception e) {
				// TODO: handle exception
			}
	}
}
