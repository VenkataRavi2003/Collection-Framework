import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
public class SelectionSort{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int size;
			while (true) {
				System.out.print("\nEnter the size of elements you need to keep in List : ");
				size = sc.nextInt();
				if(size > 0){
					break;
				}
				System.out.println("\n"+size+" -> size must be greater than zero!!");
			}

			List<Integer> list = new ArrayList<>();

			System.out.println("\nEnter the elements : ");
			takeInput(list,size,sc);

			System.out.println("\nBefore Sorting List : ");
			printList(list);

			selectionSort(list);

			System.out.println("\nAfter Sorting List  : ");
			printList(list);

		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(List<Integer> list,int size,Scanner sc){

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
				System.out.println("\nEnter valid integer as input!");
				sc.next();
			}
		}
	}
	public static void printList(List<Integer> list){

		ListIterator<Integer> litr = list.listIterator();

		while(litr.hasNext()){
			System.out.print(litr.next()+"\t");
		}
	}
	public static void selectionSort(List<Integer> list){

		for (int i = 0 ; i < list.size() - 1 ; ++i) {
			
			int min = i;

			for (int j = i + 1;  j < list.size(); ++j) {
				
				if(list.get(j) < list.get(min)){

					min = j;
				}
			}

			int temp = list.get(min);
			list.set(min,list.get(i));
			list.set(i,temp);
		}
	}
}