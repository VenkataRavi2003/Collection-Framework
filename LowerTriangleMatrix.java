import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
public class LowerTriangleMatrix{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter no.of rows : ");
			int rows = sc.nextInt();

			System.out.print("\nEnter no.of columns : ");
			int cols = sc.nextInt();

			List<List<Integer>> list = new ArrayList<>();
			System.out.println("\nEnter the elements : ");
			takeInput(list,rows,cols,sc);

			System.out.println("\n:: Resulted Matrix :: ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			printListInMatrixForm(list,rows,cols);

			System.out.println("\n:: Lower Triangle Matrix :: ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			int lowerTriangleSum = findLowerTriangleSumAndPrintMatrix(list,rows,cols);
			System.out.println("\nLower Triangle Sum = "+lowerTriangleSum);

		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(List<List<Integer>> list,int rows,int cols,Scanner sc){

		for (int i = 0 ; i < rows ; ++i) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0 ; j < cols ; ++j) {
				int element = getValidInput(sc);
				row.add(element);
			}
			list.add(row);
		}
	}
	public static void printListInMatrixForm(List<List<Integer>>list,int rows,int cols){
		for (int i = 0 ; i < rows ; ++i) {
			for (int j = 0 ; j < cols ; ++j) {
				System.out.print(list.get(i).get(j)+"\t");
			}
			System.out.println();
		}
	}
	public static int findLowerTriangleSumAndPrintMatrix(List<List<Integer>> list,int rows,int cols){
		int lowerTriangleSum = 0;
		
		for (int i = 0 ; i < rows ; ++i) {
			for (int j = 0 ; j < cols ; ++j) {
				if(j == 0 || i == j || i == rows - 1){
					lowerTriangleSum += list.get(i).get(j);
					System.out.print(list.get(i).get(j)+"\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		return lowerTriangleSum;
	}
	public static int getValidInput(Scanner sc){
		while (true) {
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid Input Please Enter Valid Input!!");
				sc.next();
			}
		}
	}
}