import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
class MyComparator implements Comparator<Integer> {

	public int compare(Integer i1,Integer i2){

		// if(i1 > i2){
		// 	return -1;
		// }else if(i2 < i1){
		// 	return +1;
		// }else{
		// 	return 0;
		// }

		return (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0;
	}
}
public class CustomizedSortingList{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the size of elements you need to keep in List : ");
			int size = sc.nextInt();

			if(size <= 0){
				System.out.println("\n"+size+" -> size must be greter than zero!!");
				return;
			}

			List<Integer> list = new ArrayList<>();

			System.out.println("\nEnter the elements into list : ");
			takeInput(list,size,sc);

			System.out.println("\nBefore Sorting :: \n"+list);

			Collections.sort(list,new MyComparator());

			System.out.println("\nAfter Sorting  :: \n"+list);
		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(List<Integer> list,int size , Scanner sc){

		for (int i = 0 ; i < size ; ++i) {
			
			int element = getValidInput(sc);
			list.add(element);
		}
	}
	public static int getValidInput(Scanner sc){

		while (true) {
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid input! please enter valid integer as input.");
				sc.next();
			}
		}
	}
}