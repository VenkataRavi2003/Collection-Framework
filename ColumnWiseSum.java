import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
public class ColumnWiseSum{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter no.of rows & columns : ");
			int rows,cols;
			while (true) {
				rows = getValidInput(sc);
				cols = getValidInput(sc);
				if(rows > 0 && cols > 0){
					break;
				}
				System.out.println("\nRows & Columns must be greater than zero!!");
			}

			List<List<Integer>> list = new ArrayList<>();

			System.out.println("\nEnter the elements : ");
			takeInput(list,rows,cols,sc);

			System.out.println("\n:: Resulted Matrix ::");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
			printMatrix(list);

			findColumnWiseSum(list,rows,cols);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void takeInput(List<List<Integer>> list,int rows,int cols,Scanner sc){
		for (int i = 0 ; i < rows ; ++i) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0 ; j < cols ; ++j) {
				row.add(getValidInput(sc));
			}
			list.add(row);
		}
	}
	public static int getValidInput(Scanner sc){
		while (true) {
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid Input!Please Enter valid integer as input.");
				sc.next();
			}
		}
	}
	public static void printMatrix(List<List<Integer>> list){
		for (List<Integer> row: list) {
			for (Integer item : row) {
				System.out.print(item+"\t");
			}
			System.out.println();
		}
	}
	public static void findColumnWiseSum(List<List<Integer>> list,int rows,int cols){

		for (int j = 0 ; j < cols ; ++j) {
			
			int colSum = 0;

			for (int i = 0 ; i < rows ; ++i) {
				
				colSum += list.get(i).get(j);
			}
			System.out.println("\n"+j+" th column sum : "+colSum);
		}
	}
}