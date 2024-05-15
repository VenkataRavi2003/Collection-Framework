import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class MoveZerosToEndOfTheList{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the size of elements you need to keep in List : ");
		int size = sc.nextInt();

		if(size <= 0){
			System.out.println("\n"+size+" -> Size must be greater than zero!");
			sc.close();
			return;
		}

		List<Integer> list = new ArrayList<>();
		System.out.println("\nEnter the elements : ");
		takeInput(list,size,sc);

		System.out.println("\nBefore Moving Zeros To End : \n"+list);

		moveZerosToEnd(list);

		System.out.println("\nAfter Moving Zeros To End : \n"+list);

		sc.close();
	}
	public static void takeInput(List<Integer> list,int size,Scanner sc){
		for (int i = 0 ; i < size ; ++i) {
			int element = sc.nextInt();
			list.add(element);
		}
	}
	public static void moveZerosToEnd(List<Integer> list){

		int nonZeroIndex = 0;

		for (int i = 0 ; i < list.size() ; ++i) {
			
			if(list.get(i) != 0){
				list.set(nonZeroIndex++,list.get(i));
			}
		}

		while (nonZeroIndex < list.size()) {
			
			list.set(nonZeroIndex++,0);
		}
	}
}