import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class DuplicatesInList{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of elements you need to keep in List : ");
		int size = sc.nextInt();

		if(size <= 0){
			System.out.println("\n"+size+" -> Size must greater than zero !!");
			sc.close();
			return;
		}

		List<Integer> list = new ArrayList<Integer>();

		System.out.println("\nEnter the elements into list : ");
		takeInput(sc,size,list);

		System.out.println("\nReulted List :: "+list);

		findDuplicates(list);

		sc.close();
	}
	public static void takeInput(Scanner sc , int size, List<Integer> list){

		for (int i = 0; i < size ; ++i ) {

			 int value = sc.nextInt();
			 list.add(value);
		}
	}
	public static void findDuplicates(List<Integer> list){

		System.out.println("\nDuplicate Elements Are : ");

		for ( int i = 0; i < list.size() ; ++i ) {
			 
			 int x = list.get(i);

			 if(list.get(i) == 0) continue;

			 int count = 0;

			 for ( int j = 0 ; j < list.size() ; ++j) {

			 	  if(x == list.get(j)){

			 	  	  ++count;

			 	  	list.set(j,0);
			 	  }

			 }

			 if(count > 1)
			 	System.out.println(x);
		}
	}
}