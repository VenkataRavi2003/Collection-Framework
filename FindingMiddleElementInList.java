import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class FindingMiddleElementInList{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the size of elements you need to keep in the List : ");
		int size = sc.nextInt();

		if(size <= 0){
			System.out.println("\n"+size+" : Size must greater than zero !!");
			sc.close();
			return;
		}

		List<Integer> list =  new ArrayList<Integer>();

		System.out.println("\nEnter the elements into List : ");
			
	    // Takes input values from the user and populates the list.
		takeInput(sc , size , list); 

		System.out.println("\nResulted List :: "+list);

		int middleElement =  findMiddleElememt(list); // for finding middle element in list

		System.out.println("\nMiddle Element = "+middleElement);

		sc.close();


	}
	public static void takeInput(Scanner sc , int size , List<Integer> list){

		for (int i = 0 ; i < size ; ++i ) {

			  int value = sc.nextInt();

			  list.add(value);
		}
	}

	public static int findMiddleElememt(List<Integer> list){

		int middleIndex =  list.size()/2; // gives middle element index

		return list.get(middleIndex); // through that index we can easily get the middle element
	}

}