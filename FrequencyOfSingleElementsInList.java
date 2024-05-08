import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class FrequencyOfSingleElementsInList{
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

		System.out.print("\nEnter the element to find frequency of it : ");
		int targetElement = sc.nextInt();

		int frequency = findFrequencyOfElement(list,targetElement);

		System.out.println("\n"+targetElement+" -> Frequency Is : "+frequency);

		sc.close();
	}
	public static void takeInput(List<Integer> list, int size , Scanner sc){

		for (int i = 0;i < size ; ++i) {
			int value = sc.nextInt();
			list.add(value);
		}
	}
	public static int findFrequencyOfElement(List<Integer> list , int targetElement){

		int frequency = 0;

		for (int item : list) {
			
			if(targetElement == item){
				++frequency;
			}
		}

		return frequency;
	}
}