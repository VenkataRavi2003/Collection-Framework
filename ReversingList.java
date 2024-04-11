import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ReversingList{
	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);

		 System.out.print("\nEnter the size of elements you need to store in List = ");
		 int size =sc.nextInt();

		 if(size < 0){

		 	System.out.println("\n"+size+" -> Size Can't Be Negative !!");
		 	sc.close();
		 	return;
		 }

		 List <Integer> list = new ArrayList<Integer>();

		 System.out.println("\nEnter the elements : ");
		 takeInput(sc,list,size);

		 System.out.println("\nBefore Reversing List : "+list);

		 reverseList(list); /*Instead of using the user-defined reverseList method, you can also use
                             Collections.reverse(list) to reverse the elements of the list.
                             This method is available in the Java Collections framework.*/

		 System.out.println("\nAfter Reversing List  : "+list);

		 sc.close();
	}
	public static void takeInput(Scanner sc, List<Integer> list , int size){

		for(int i = 0 ;i < size; ++i){

			int value = sc.nextInt();
			list.add(value);
		}
	}
	public static void reverseList(List<Integer> list){

		int start = 0, end = list.size()-1;

		while(start < end){
			int temp = list.get(start);
			list.set(start,list.get(end));
			list.set(end,temp);
			++start;
			--end;
		}
	}
}