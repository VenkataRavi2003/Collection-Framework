import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class DiagonalsSum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter no.of rows : ");
		int rows = sc.nextInt();

		System.out.print("\nEnter no.of columns : ");
		int columns = sc.nextInt();

		List<List<Integer>> list = new ArrayList<>();

		System.out.println("\nEnter elements : ");
		takeInput(list,sc,rows,columns);

		System.out.println("\nResulted Matrix :");
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		printListInMatrixForm(list);


		System.out.println("\nLeft & Right Diagonals :: ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int diagonalsSum = findDiagonalsSumAndPrintDiagonals(list,rows,columns);
		System.out.println("\nDiagonals Sum  : "+diagonalsSum);

		sc.close();
	}
	public static void takeInput(List<List<Integer>> list,Scanner sc,int rows,int columns){

		for (int i = 0 ; i < rows ; ++i) {
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
	public static int findDiagonalsSumAndPrintDiagonals(List<List<Integer>> list,int rows,int columns){

		int diagonalsSum = 0;

		for (int i = 0 ; i < rows ; ++i) {
			for (int j = 0 ; j < columns ; ++j) {
				
				if(i == j || i + j == list.size()-1){
					diagonalsSum += list.get(i).get(j);
					System.out.print(list.get(i).get(j)+"\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		return diagonalsSum;

	}

}