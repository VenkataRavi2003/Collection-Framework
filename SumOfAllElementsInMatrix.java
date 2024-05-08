import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
public class SumOfAllElementsInMatrix{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter no.of rows : ");
		int rows = sc.nextInt();

		System.out.print("\nEnter no.of columns : ");
		int columns = sc.nextInt();

		if(rows <= 0 || columns <= 0){
			System.out.println("\nRows and columns must be greater than zero."+);
			sc.close();
			return;
		}

		List<List<Integer>> list = new ArrayList<>();

		System.out.println("\nEnter the elements into List : ");
		takeInput(list,rows,columns,sc);

		System.out.println("\n:: Resulted Matrix ::");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

		printListInMatrixForm(list);

		int sum = findSumOfAllElements(list);

		System.out.println("\nsum : "+sum);

		sc.close();
	}
	public static void takeInput(List<List<Integer>> list, int rows , int columns , Scanner sc){

		for (int i = 0 ; i < rows ; ++i) {
			
			List<Integer> row = new ArrayList<>();

			for (int j = 0 ; j < columns; ++j) {
				
				int element = getIntInput(sc);
				row.add(element);
			}
			list.add(row);
		}
	}
	public static void printListInMatrixForm(List<List<Integer>> list){

		for(List<Integer> row : list){

			for (int item : row) {
				
				System.out.print(item+" ");
			}
			System.out.println();
		}
	}
	public static int findSumOfAllElements(List<List<Integer>> list){

		int sum = 0;

		for (List<Integer> row : list) {
			
			for (int item : row) {
				
				sum += item;
			}
		}

		return sum;
	}
	public static int getIntInput(Scanner sc){

		while (true) {
			
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid input ! plz enter an integer as input..");
				sc.next();
			}catch (Exception e) {
				System.out.println("\n"+e.getMessage());
				sc.next();
			}
		}
	}
}