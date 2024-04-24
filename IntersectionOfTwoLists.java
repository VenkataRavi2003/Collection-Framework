import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class IntersectionOfTwoLists{
	public static void main(String[] args) {
		// Creating  scanner object to take the user input
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the size of elements you need to keep in LIST 1 && LIST 2 : ");
		int size1 = sc.nextInt(), size2 = sc.nextInt();

		if(size1 <= 0 || size2 <= 0){
			System.out.println("\nLists sizes must greater than zero !!");
			sc.close(); // closing the Scanner 
			return; //exiting the program
		}

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		System.out.println("\nEnter the elements in LIST 1 : ");

		// Takes input values from the user and populates the list1.
		takeInput(sc , size1 , list1);

		System.out.println("\nEnter the elements in LIST 2 : ");

		// Takes input values from the user and populates the list2.
		takeInput(sc , size2 , list2);

		System.out.println("\nResulted List 1 :: "+list1);
		System.out.println("\nResulted List 2 :: "+list2);

		List<Integer> intersectList = findIntersection(list1 , list2); 

		System.out.println("\nIntersection Of Two Lists :: "+intersectList);

		sc.close(); // Closing the Scanner
	}
	public static void takeInput(Scanner sc , int size , List<Integer> list){

		for (int i = 0 ; i < size ; ++i) {

			 int value = sc.nextInt();
			 list.add(value);
		}
	}
	public static List<Integer> findIntersection(List<Integer> list1 , List<Integer> list2){

		List<Integer> res = new ArrayList<Integer>();

		for (Integer item : list1 ) {

		     if(list2.contains(item)){

		     	 res.add(item);
		     }			
		}

		return res;
	}
}