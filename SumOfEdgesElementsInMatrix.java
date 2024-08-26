import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
public class SumOfEdgesElementsInMatrix{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter no.of rows : ");
			int rows = sc.nextInt();

			System.out.print("\nEnter no.of columns : ");
			int cols = sc.nextInt();

			if(rows <= 0 || cols <= 0){
				System.out.println("\nError :: rows and colums must be greater than zero!!");
				return;
			}

			List<List<Integer>> list = new ArrayList<>();

			System.out.println("\nEnter the elements into matrix : ");
			takeInput(list,rows,cols,sc);

			System.out.println("\n:: Resulted Matrix :: ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			printListInMatrixForm(list);

			System.out.println("\n:: Edges Of Matrix :: ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			int edgesSum = findEdgesSumOfMatrix(list,rows,cols);

			System.out.println("\nEdges Sum : "+edgesSum);

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
	public static int getValidInput(Scanner sc){

		while (true) {
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid input! please enter valid integer as input.");
				sc.next();
			}
		}
	}
	public static void printListInMatrixForm(List<List<Integer>> list){

		for (List<Integer> row : list) {
			for (Integer item : row) {
				System.out.print(item+"\t");
			}
			System.out.println();
		}
	}
	public static int findEdgesSumOfMatrix(List<List<Integer>> list,int rows , int cols){

		int sum = 0;

		for (int i = 0 ; i < rows ; ++i) {

			for (int j = 0 ; j < cols ; ++j) {
				
				if(i == 0 || j == 0 || i == rows - 1 || j == cols - 1){
					System.out.print(list.get(i).get(j)+"\t");
					sum += list.get(i).get(j);
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		return sum;
	}
}