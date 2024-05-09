import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TransposeOf2DList{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter no.of rows : ");
		int rows =  sc.nextInt();

		System.out.print("\nEnter no.of columns : ");
		int columns = sc.nextInt();

		if(rows <= 0 || columns <= 0){
			System.out.println("\nRows & Columns must be greater than zero!!");
			sc.close();
			return;
		}

		List<List<Integer>> list = new ArrayList();

		System.out.println("\nEnter the elements into list : ");
		takeInput(list,rows,columns,sc);

		System.out.println("\n:: Before Transposing ::");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		printListInMatrixForm(list);

		List<List<Integer>> transposedList = transposeList(list,rows,columns);

		System.out.println("\n:: After Transposing ::");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		printListInMatrixForm(transposedList);

		sc.close();

	}
	public static void takeInput(List<List<Integer>> list , int rows , int columns,Scanner sc){

		for (int i = 0; i < rows ; ++i) {

			List<Integer> row = new ArrayList();

			for (int j = 0; j< columns ;++j ) {

				int element = getIntInput(sc);
				row.add(element);
				
			}
			list.add(row);
		}
	}
	public static int getIntInput(Scanner sc){
		while (true) {
			
			try{

				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid Input!! Enter An Integer As Input..");
				sc.next();
			}
		}
	}
	public static void printListInMatrixForm(List<List<Integer>> list){

		for (List<Integer> row : list) {
			
			for (int item  : row ) {
				System.out.print(item+" ");
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> transposeList(List<List<Integer>> list,int rows,int columns){

		List<List<Integer>> tlist = new ArrayList();

		for (int i = 0 ; i < columns ;++i) {
			
			List<Integer> column = new ArrayList();
			for (int j = 0; j < rows ; ++j) {
				
				column.add(list.get(j).get(i));
			}
			tlist.add(column);
		}
		return tlist;
	}
}