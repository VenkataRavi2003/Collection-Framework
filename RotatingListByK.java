import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
interface IOne{
	List<Integer> rotateListByK(List<Integer> list,int k);
}
public class RotatingListByK{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter the size of elements you need to keep in LIST : ");
			int size;
			while (true) {
				size = getValidInput(sc);
				if(size > 0)break;
				System.out.println("\n"+size+" -> size must be greater than zero!Try Again : ");
			}

			List<Integer> list = new ArrayList<Integer>();

			System.out.println("\nEnter the elements into LIST : ");
			takeInput(list,sc,size);

			System.out.println("\nBefore Rotating : "+list);

			System.out.print("\nEnter K : ");
			int kth = getValidInput(sc);

			IOne i1 = (l,k) -> {
                                 List<Integer> rotatedList = new ArrayList<Integer>(l);
                                 int n = l.size();
                                 k = k % n;

                                 for (int i = 0 ; i < n ; ++i) {
                                 	
                                 	rotatedList.set((i + k) % n , l.get(i));
                                 }

                                 return rotatedList;
			                   };

			List<Integer> res = i1.rotateListByK(list,kth);

			System.out.println("\nAfter Rotating : "+res);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void takeInput(List<Integer> list,Scanner sc,int size){
		for (int i = 0 ; i < size ; ++i) {
			list.add(getValidInput(sc));
		}
	}
	public static int getValidInput(Scanner sc){
		while (true) {
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid Input!Please Enter valid integer as input!Try again : ");
				sc.next();
			}
		}
	}
}