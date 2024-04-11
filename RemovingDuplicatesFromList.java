import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class RemovingDuplicatesFromList{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of elements you need to keep in List = ");
		int size =sc.nextInt();

		if(size < 0){
			System.out.println("\n"+size+" -> Size Can't Be Negative !!");
			sc.close();
			return;
		}

		List<Integer> list = new ArrayList<Integer> ();

		System.out.println("\nEnter the elements : ");
		takeInput(sc,list,size);

		System.out.println("\nBefore Removing Duplicates : "+list);

		Set<Integer> set = new HashSet<Integer>(list);

		list.clear(); //clear the list
		list.addAll(set); // Add elements from set (which automatically removes duplicates)

		System.out.println("\nAfter Removing Duplicates  : "+list);

	}
	public static void takeInput(Scanner sc, List<Integer> list, int size){

		for(int i=0;i<size;++i){

			int value=sc.nextInt();
			list.add(value);

		}
	}
}
