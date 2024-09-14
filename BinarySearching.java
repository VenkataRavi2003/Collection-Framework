import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
public class BinarySearching{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			int size;
			while (true) {
				System.out.print("\nEnter the size of elements you want to keep in LIST : ");
				size = getValidInput(sc);
				if(size > 0)break;
				System.out.println("\n"+size+" -> size must be greater than zero!!");
			}
			List<Integer> list = new ArrayList<>();
			System.out.println("\nEnter the elements into LIST : ");
			takeInput(list,size,sc);

			selectionSort(list);

			System.out.println("\nResulted LIST After Sorting : \n"+list);

			System.out.print("\nEnter the target element : ");
			int target = getValidInput(sc);

			int index = binarySearch(list,target);

			if(index != -1){
				System.out.println("\n"+target+" -> Element Found At : "+index+" Index.");
			}else {
				System.out.println("\n"+target+" -> Not Found!!");
			}

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
				System.out.println("\nInvalid input!! please enter valid integer as input.");
				sc.next();
			}
		}
	}
	public static void selectionSort(List<Integer> list){

		for (int i = 0 ; i < list.size() - 1 ; ++i) {
			
			int min = i;

			for (int j = i + 1; j < list.size() ; ++j) {
				
				if(list.get(j) < list.get(min)){
					min = j;
				}
			}

			int temp = list.get(min);
			list.set(min,list.get(i));
			list.set(i,temp);
		}
	}
	public static int binarySearch(List<Integer> list,int target){

		int start = 0 , end = list.size() - 1 , mid = -1;

		while (start <= end) {
			
			mid = (start + end) / 2;

			if(list.get(mid).equals(target)){
				return mid;
			}else if(list.get(mid) < target){
				start = mid + 1;
			}else{
				end = mid - 1;
			}
		}
		return -1;
	}
}