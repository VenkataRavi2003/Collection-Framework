import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class StoringNamesInHashMap{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter no.of students details you want to store in Map : ");

		int size = sc.nextInt();

		if(size <= 0){
			System.out.println("\n"+size+" -> Size Must Greater Than Zero !!");
			sc.close();
			return;
		}

		Map<Integer,String> students = new HashMap<Integer,String>();

		System.out.println("\nEnter the details : ");
		takeInput(sc,size,students);

		System.out.println("\n"+students);

		sc.close();

	}
	public static void takeInput(Scanner sc ,  int size , Map<Integer,String> students){

		for (int i = 0; i < size ; ++i) {

			 System.out.print("\nEnter ID : ");
			 int id =  sc.nextInt();

			 System.out.print("\nEnter Name : ");
			 String name = sc.next();

			 students.put(id,name);
		}
	}
}