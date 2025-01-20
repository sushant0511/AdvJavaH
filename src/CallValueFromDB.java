import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CallValueFromDB {

	public static void main(String[] args) {
		List<User> users=new ArrayList<>();
		
		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajavasech", "root", "root");
		System.out.println("Connction Success");
		Statement statement=connection.createStatement();
		
		System.out.println("Enter your id to update");
		Scanner scanner=new Scanner(System.in);
		//int id=scanner.nextInt();
		ResultSet set1=statement.executeQuery("SELECT * FROM ajavasech.user");
		while(set1.next())
		{
			User user=new User();
			user.setId(set1.getInt(1));
			user.setName(set1.getString(2));
			user.setAddress(set1.getString(3));
			user.setSalary(set1.getFloat(4));
			users.add(user);
		}
		System.out.println(users);
		float msal=0.0f;
		String n=null;
		for(User u:users)
		{
			if(msal<u.getSalary())
			{
				
				msal=u.getSalary();
				n=u.getName();
			}
			//System.out.println(set1.getString(2)+"  "+set1.getString(3)+"  "+set1.getFloat(4));
		}
		System.out.println(msal+" hold by "+n);
		System.out.println("Exit");
		
		
		
		
		
		
			//System.out.println(u.getId()+" "+u.getName());
		
		
		
		
		
		
		
		
//		while(set1.next())
//		{
//			System.out.println(set1.getString(2)+"  "+set1.getString(3));
//		}
		
		
		//System.out.println("Enter new address");
		
//		String add=scanner.next();
//		String query="UPDATE user SET  `address` = '"+add+"' WHERE (`id` = '"+id+"')";
//		int i=0;
//		
		
//		i=statement.executeUpdate(query);
//		if(i!=0)
//		System.out.println("Data updated successfully");
//		else
//			System.out.println("Data not inserted ");
		
		
//		System.out.println("Enter you name");
//		Scanner scanner=new Scanner(System.in);
//		String n=scanner.next();
//		String query="INSERT INTO `ajavasech`.`user` (`name`) VALUES ('"+n+"')";
//		int i=0;
//		
//		
//		i=statement.executeUpdate(query);
//		if(i!=0)
//		System.out.println("Data inserted successfully");
//		else
//			System.out.println("Data not inserted ");
//		
		
		
		
		
		
		
//		ResultSet  set =statement.executeQuery("select * from user");
//		while(set.next())
//		{
//			System.out.println(set.getInt(1)+" "+set.getString(2));
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
