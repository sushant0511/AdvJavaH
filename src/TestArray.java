import java.util.ArrayList;
import java.util.List;

public class TestArray {

	public static void main(String[] args) {
		float sal[]=new float[3];
		String name[]=new String[3];
		sal[0]=1234;sal[1]=234;
		sal[2]=2345;
		name[0]="ABC";name[2]="EFG";name[2]="HIJ";
		List<UserData> list=new ArrayList<>();
		UserData data=null;
		for(int i=0;i<3;i++)
		{
		data=new UserData();
		data.setName(name[i]);
		data.setSal(sal[i]);
		list.add(data);
		}
		
		for(UserData u:list)
		{
			System.out.println(u.getName()+" "+u.getSal());
		}
		
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
			
		
//		List<String> list=new ArrayList<>();
//		list.add(name[0]);
//		list.add(name[1]);
//		list.add(name[2]);
//		System.out.println(list);
//			
//		System.out.println(sal); // Output??
//		List<Float> list1=new ArrayList<>();
//		list1.add(sal[0]);
//		list1.add(sal[1]);
//		list1.add(sal[2]);
//		list1.add(2344.0f);
//		
//		System.out.println(list1);
		
	}
}












