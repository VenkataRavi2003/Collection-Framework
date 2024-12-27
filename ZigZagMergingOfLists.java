import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class ZigZagMergingOfLists{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter the sizes of LIST1 & LIST2 : ");
			int size1 , size2;
			while (true) {
				size1 = getValidInput(sc);
				size2 = getValidInput(sc);
				if(size1 > 0 && size2 > 0)break;
				System.out.println("\nLists Sizes Must be greater than zero!!");
			}

			List<Integer> list1 = new ArrayList<Integer>();
			List<Integer> list2 = new ArrayList<Integer>();

			System.out.println("\nEnter the elements into LIST 1 : ");
			takeInput(list1,size1,sc);

			System.out.println("\nEnter the elements into LIST 2 : ");
			takeInput(list2,size2,sc);

			System.out.println("\nLIST 1 : "+list1);
			System.out.println("\nLIST 2 : "+list2);

			List<Integer> zigZagList = zigZagMergeLists(list1,list2);
			System.out.println("\nAfter ZigZag Merging : "+zigZagList);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void takeInput(List<Integer>list,int size ,Scanner sc){
		for (int i = 0 ; i < size ; ++i) {
			list.add(getValidInput(sc));
		}
	}
	public static int getValidInput(Scanner sc){
		while (true) {
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid Input Please Enter Valid Integer As Input. Try Again : ");
				sc.next();
			}
		}
	}
	public static List<Integer> zigZagMergeLists(List<Integer> list1,List<Integer> list2){

		List<Integer> zigZagList = new ArrayList<Integer>();

		int maxSize = (list1.size() > list2.size()) ? list1.size() : list2.size();

		for (int i = 0 ; i < maxSize ; ++i) {

			if(i < list1.size()){
				zigZagList.add(list1.get(i));
			}

			if(i < list2.size()){
				zigZagList.add(list2.get(i));
			}
		}

		return zigZagList;
 	}
}
