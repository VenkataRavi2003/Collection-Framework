import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class CheckTheListIsSortedOrNot{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the size of elements you need to keep in List : ");
		int size = sc.nextInt();

		if(size <= 0){
			System.out.println("\n"+size+" ->  Size muste > zero !!");
			sc.close();
			return;
		}

		List<Integer>list = new ArrayList<Integer>();

		System.out.println("\nEnter the elements into LIST : ");
		takeInput(list,size,sc);

		System.out.println("\nResulted List : \n"+list);

		if(isSortedInAscendingOrder(list)){
			System.out.println("\nList elements are sorted.");
		}else{
			System.out.println("\nList elements Not sorted !!");
		}

		sc.close();
	}
	public static void takeInput(List<Integer> list, int size , Scanner sc){

		for (int i = 0;i < size ; ++i) {
			int value = sc.nextInt();
			list.add(value);
		}
	}
	public static boolean isSortedInAscendingOrder(List<Integer> list){

		for (int i = 1 ; i < list.size() ; ++i) {
			
			 if(list.get(i) < list.get(i - 1)){  

			 	return false;
			 }
		}
		return true;
	}

}