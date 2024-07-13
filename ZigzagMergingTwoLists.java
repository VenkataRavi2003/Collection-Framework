import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ZigzagMergingTwoLists {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.print("\nEnter the size of elements you need to keep in LIST 1 : ");
			int size1 = sc.nextInt();
			
			System.out.print("\nEnter the size of elements you need to keep in LIST 2 : ");
			int size2 = sc.nextInt();
			
			List<Integer> list1 = new ArrayList<Integer>();
			List<Integer> list2 = new ArrayList<Integer>();
			
			System.out.println("\nEnter the elements into LIST 1 : ");
			takeInput(list1,size1,sc);
			
			System.out.println("\nEnter the elements into LIST 2 : ");
			takeInput(list2,size2,sc);
			
			System.out.println("\nLIST 1 : "+list1);
			System.out.println("\nLIST 2 : "+list2);
			
			List<Integer> zigZagMergedList = zigZagMergeTwoLists(list1,list2);
			System.out.println("\nZigZag Merged LIST : "+zigZagMergedList);
			
		}catch(Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(List<Integer>list,int size,Scanner sc)throws Exception {
		
		for(int i = 0 ; i < size ; ++i) {
			int element = getValidInput(sc);
			list.add(element);
		}
	}
	public static int getValidInput(Scanner sc) {
		while (true) {
			try {
				return sc.nextInt();
			}catch(InputMismatchException ie) {
				System.out.println("\nInvalid Input!! Plz enter valid integer as input.");
				sc.next();
			}catch(Exception e) {
				System.out.println("\nException Occured :: "+e.getMessage());
			}
		}
	}
	public static List<Integer> zigZagMergeTwoLists(List<Integer>list1,List<Integer>list2){
		List<Integer> zigZagMergedList = new ArrayList<Integer>();
		
		int maxSize = (list1.size() > list2.size()) ? list1.size() : list2.size();
		
		for (int i = 0; i < maxSize ; i++) {
			
			if(i < list1.size()) {
				zigZagMergedList.add(list1.get(i));
			}
			
			if(i < list2.size()) {
				zigZagMergedList.add(list2.get(i));
			}
		}
		return zigZagMergedList;
	}
}
