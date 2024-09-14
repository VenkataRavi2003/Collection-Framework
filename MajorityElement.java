import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
public class MajorityElement{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int size;
			
			while(true){
				System.out.print("\nEnter the size of elements you need to keep in list : ");
				size = sc.nextInt();
				if(size > 0)break;
				System.out.println("\n"+size+" -> size must be greater than zero!!");
			}

			List<Integer> list = new ArrayList<Integer>();
			System.out.println("\nEnter the elements : ");
			takeInput(list,size,sc);

			System.out.println("\nResulted List : \n"+list);

			int majorityElement = findMajorityElement(list);

			if(majorityElement != -1){
				System.out.println("\nMajority Element = "+majorityElement);
			}else {
				System.out.println("\nNo Majority Element Found!!");
			}

		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(List<Integer> list,int size,Scanner sc){
		for (int i = 0; i < size ; ++i) {
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
	public static int findMajorityElement(List<Integer> list){
		int majorityElement = -1;
		int count = 0;
		for(Integer item : list){
			if(count == 0){
				majorityElement = item;
				count = 1;
			}else if(item == majorityElement){
				++count;
			}else{
				--count;
			}
		}
		count = 0;
		for (Integer item: list) {
			
			if(majorityElement == item){
				++count;
			}
		}
		return count > list.size() / 2 ? majorityElement : -1;
	}
}