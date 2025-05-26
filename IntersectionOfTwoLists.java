import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class IntersectionOfTwoLists{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("\nEnter the size of elements you need to keep in List1 & List2 : ");
			int size1, size2;
			while(true) {
				size1 = getValidInput(sc);
				size2 = getValidInput(sc);
				if(size1 > 0 && size2 > 0) {
					break;
				}
				System.out.println("\nSizes must be greater than zero! Try again : ");
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
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void takeInput(Scanner sc , int size , List<Integer> list){

		for (int i = 0 ; i < size ; ++i) {

			 list.add(getValidInput(sc));
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
	public static int getValidInput(Scanner sc) {
		while(true) {
			try {
				return sc.nextInt();
			}catch(InputMismatchException ime) {
				System.out.println("\nInvalid Input!Please enter valid integer as input.Try again : ");
				sc.next();
			}
		}
	}
}
