import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class FindMaxAndMinElementsInList{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of elements you need to keep in List : ");
		int size = sc.nextInt();

		if(size <= 0){
			System.out.println("\n"+size+" -> Size must greater than zero!!");
			sc.close();
			return;
		}

		List<Integer> list = new ArrayList<Integer>();

		System.out.println("\nEnter the elements into list : ");
		takeInput(list,size,sc);

		System.out.println("\nResulted List : \n"+list);

		int max = findMaximumInList(list);
		int min = findMinimumInList(list);

		System.out.println("\nMaximum Element : "+max);
		System.out.println("\nMinimum Element : "+min);

		sc.close();
	}
	public static void takeInput(List<Integer> list, int size , Scanner sc){

		for (int i = 0 ; i < size ; ++i) {
			 
			 int value = sc.nextInt();
			 list.add(value);
		}
	}
	public static int findMaximumInList(List<Integer> list){

		int max = list.get(0);

		for (int i = 1 ; i < list.size() ; ++i) {
			
			 if(max > list.get(i)){
			 	max = list.get(i);
			 }
		}
		return max;
	}
	public static int findMinimumInList(List<Integer> list){

		int min = list.get(0);

		for (int i = 1 ; i < list.size() ; ++i) {
			
			 if(min < list.get(i)){
			 	min = list.get(i);
			 }
		}
		return min;
	}
}