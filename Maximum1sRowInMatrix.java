import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
public class Maximum1sRowInMatrix{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter no.of rows & columns for the matrix : ");
			int rows,columns;
			while (true) {
				rows = sc.nextInt();
				columns = sc.nextInt();

				if(rows > 0 && columns > 0) break;
				System.out.println("\nRows & Columns must be greater than zero!!");
			}

			List<List<Integer>> matrix = new ArrayList<>();
			System.out.println("\nEnter the elements into matrix : ");
			takeInput(matrix,sc,rows,columns);

			System.out.println("\n:: Resulted Matrix :: ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
			printMatrix(matrix);

			int max1sRow = findMax1sRow(matrix,rows,columns);

			if(max1sRow != -1){
				System.out.println("\nMaximum 1s present in : "+max1sRow+" row.");
			}else {
				System.out.println("\nNo row has maximum 1s!!");
			}

		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(List<List<Integer>> matrix,Scanner sc,int rows,int columns){
		for (int i=0;i<rows; ++i) {
			List<Integer> row = new ArrayList<>();
			for (int j=0;j<columns ; ++j) {
				row.add(getValidInput(sc));
			}
			matrix.add(row);
		}
	}
	public static int getValidInput(Scanner sc){
		while (true) {
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid Input!!Please enter valid integer as input.");
				sc.next();
			}
		}
	}
	public static void printMatrix(List<List<Integer>>matrix){
		for(List<Integer> row : matrix){
			for(Integer item:row){
				System.out.print(item+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static int findMax1sRow(List<List<Integer>> matrix,int rows,int columns){
		int max1sRow = -1;
		int max = 0;
		for (int i=0;i<rows;++i) {
			  int count = 0;
			for (int j=0;j<columns; ++j) {
				if(matrix.get(i).get(j).equals(1)){
					++count;
				}
			}
			if(count > max){
				max = count;
				max1sRow = i;
			}
		}
		return max1sRow;
	}
}