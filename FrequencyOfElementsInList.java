import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class FrequencyOfElementsInList{
	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("\nEnter the size of elements you need to keep in List : ");
		 int size = sc.nextInt();

		 if(size < 0){
		 	System.out.println("\n"+size+" -> Size Can't Be Negative !!");
		 	sc.close();
		 	return;
		 }

		 List<Integer>list = new ArrayList<Integer>();

		 System.out.println("\nEnter the elements : ");
		 takeInput(sc, list, size);

		 System.out.println("\nResulted List :: "+list);

		 findFrequencies(list);

		 sc.close();
	}
	public static void takeInput(Scanner sc,  List<Integer> list, int size){

		for (int i = 0; i < size ; ++i ) {

		     int value = sc.nextInt();
		     list.add(value);	
		}
	}
	public static void findFrequencies(List<Integer> list){

		for (int i = 0; i < list.size() ; ++i ) {

			int x = list.get(i);
			if(list.get(i) == -1){
				continue;
			}
			int count = 0;
			for (int j = 0; j < list.size() ; ++j ) {

				 if(x == list.get(j)){

				 	count++;
				 	list.set(j,-1);
				 }

			}

			System.out.println("\n"+x+" -> Frequency Is : "+count);
		}
	}
}