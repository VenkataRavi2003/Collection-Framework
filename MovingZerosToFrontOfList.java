import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class MovingZerosToFrontOfList{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the size of elements you need to keep in List : ");
		int size = sc.nextInt();

		if(size <= 0){
			System.out.println("\n"+size+" -> Size must be greater than zero!!");
			sc.close();
			return;
		}

		List<Integer> list = new ArrayList<>();

		System.out.println("\nEnter the elements into List : ");
		takeInput(list,size,sc);

		System.out.println("\nBefore Moving Zeros To Front Of List : \n"+list);

		moveZerosToFront(list);

		System.out.println("\nAfter Moving Zeros To Front Of List : \n"+list);

		sc.close();

	}
	public  static void takeInput(List<Integer> list,int size,Scanner sc){
		for (int i = 0; i < size ; ++i) {
			int element = sc.nextInt();
			list.add(element);
		}
	}
	public static void moveZerosToFront(List<Integer> list){

		int index = list.size()-1;

		for (int i = list.size() - 1; i >= 0; --i) {

		    if (list.get(i) != 0) {
		    		
		    		list.set(index--,list.get(i));
		    	}	
		}
		while (index >= 0) {
			list.set(index--,0);
		}
	}
}