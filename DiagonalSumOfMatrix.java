import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class DiagonalSumOfMatrix{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter no.of rows : ");
		int rows = sc.nextInt();

		System.out.print("\nEnter no.of columns : ");
		int columns = sc.nextInt();

		List<List<Integer>> list = new ArrayList<>();

		System.out.println("\nEnter the elements : ");
		takeInput(list,rows,columns,sc);

		System.out.println("\nResulted Matrix");
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		printListInMatrixForm(list);

		System.out.println("\nDiagonal Of Matrix");
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		int diagonalSum = findDiagonalSumAndPrintDiagonalOfMatrix(list,rows,columns);

		System.out.println("\nDiagonal Sum : "+diagonalSum);

		sc.close();

	}
	public static void takeInput(List<List<Integer>> list,int rows,int columns,Scanner sc){

		for (int i = 0 ;  i < rows; ++i) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0 ; j < columns ; ++j) {
				
				int element = sc.nextInt();
				row.add(element);
			}
			list.add(row);
		}
	}
	public static void printListInMatrixForm(List<List<Integer>> list){

		for (List<Integer> row : list) {
			
			for (int item : row) {
				System.out.print(item+"\t");
			}
			System.out.println();
		}
	}
	public static int findDiagonalSumAndPrintDiagonalOfMatrix(List<List<Integer>> list,int rows,int columns){

		int diagonalSum = 0;

		for (int i = 0 ; i < rows; ++i) {
			
			for (int j = 0 ; j < columns; ++j) {
				
				if(i == j){
					diagonalSum += list.get(i).get(j);
					System.out.print(list.get(i).get(j)+"\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		return diagonalSum;
	}
}
