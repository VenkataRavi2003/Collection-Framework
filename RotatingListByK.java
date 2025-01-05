import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
public class RotatingListByK{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter the size of elements you need to keep in LIST : ");
			int size;
			while (true) {
				size = getValidInput(sc);
				if(size > 0)break;
				System.out.println("\n"+size+"-> size must be greater than zero! Try Again : ");
			}
			List<Integer> list = new ArrayList<Integer>();
			System.out.println("\nEnter the elements into LIST : ");
			takeInput(list,sc,size);

			System.out.println("\nBefore Rotating : "+list);

			System.out.println("\nEnter K : ");

			int k = getValidInput(sc);
			List<Integer> rotatedList = rotateListByK(list,k);

			System.out.println("\nAfter Rotating "+rotatedList);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void takeInput(List<Integer> list,Scanner sc, int size){
		for (int i = 0 ; i < size ; ++i) {
			list.add(getValidInput(sc));
		}
	}
	public static int getValidInput(Scanner sc){
		while (true) {
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid Input!Please enter valid integer as input : ");
				sc.next();
			}
		}
	}
	public static List<Integer> rotateListByK(List<Integer> list,int k){
		int n = list.size();

		List<Integer> rotatedList = new ArrayList<>(list);

		for (int i = 0 ; i < n ; ++i) {
			rotatedList.set((i + k) % n , list.get(i));
		}
		return rotatedList;
	}
}