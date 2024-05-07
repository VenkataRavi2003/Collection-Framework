import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class SecondHighestElementInList{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the size of elements you want to keep in List : ");
			int size = sc.nextInt();

			if(size <= 0){
				System.out.println("\n"+size+" -> Size must greater than zero!!");
				return;
			}

			List<Integer> list = new ArrayList<Integer>();

			System.out.println("\nEnter the elements into List : ");
			takeInput(list,size,sc);

			System.out.println("\nResulted List : "+list);

			int smax = findSecondMaximum(list);

			System.out.println("\n2nd maximum : "+smax);

		}catch(Exception e){
			System.out.println("\n"+e.getMessage());
		}
	}
	public static void takeInput(List<Integer> list, int size , Scanner sc){

		for (int i = 0 ; i < size ;++i) {
			  int value = sc.nextInt();
			  list.add(value);
		}
	}
	public static int findSecondMaximum(List<Integer> list){

		int max = list.get(0) , smax = list.get(0);

		for (int i = 0 ; i < list.size() ; ++i) {
			
			if(max < list.get(i)){
				max = list.get(i);
			}
		}

		for (int i = 0 ; i <list.size() ; ++i) {
			
			 if(max == list.get(i))continue;
			 else if(smax < list.get(i) && smax != max)smax = list.get(i);
		}
		return smax;
	}
}