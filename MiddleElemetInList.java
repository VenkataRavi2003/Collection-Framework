import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class MiddleElemetInList{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the size of element you need to keep in list >");
		int size=sc.nextInt();
		if(size<=0){
			System.out.println("\nInvalid Size..!");
			return;
		}
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<size;++i){
			int value=sc.nextInt();
			list.add(value);
		}
		System.out.println("Resulted List > "+list);
		int middleElementIndex=list.size()/2;
		System.out.println("\nMiddle Element In List > "+list.get(middleElementIndex));
		sc.close();
	}
}
