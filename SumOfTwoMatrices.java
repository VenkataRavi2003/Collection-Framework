import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class SumOfTwoMatrices{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter no.of rows & columns : ");
		int rows = sc.nextInt() , columns = sc.nextInt();

		if(rows <= 0 || columns <= 0){
			System.out.println("\nRows & Columns must be greater than zero!!");
			sc.close();
			return;
		}

		List<List<Integer>> list1 = new ArrayList<>();//1st matrix
		List<List<Integer>> list2 = new ArrayList<>();//2nd matrix
		

		System.out.println("\nEnter 1st matrix elements : ");
		takeInput(list1,rows,columns,sc);

		System.out.println("\nEnter 2nd matrix elements : ");
		takeInput(list2,rows,columns,sc);

		System.out.println("\n1st Matrix");
		System.out.println("~~~~~~~~~~~~~");
		printListAsMatrixForm(list1);

		System.out.println("\n2nd Matrix");
		System.out.println("~~~~~~~~~~~~~");
		printListAsMatrixForm(list2);

		List<List<Integer>> result = addTwoMatrixes(list1,list2);

		System.out.println("\nAdditon Of Two Matrices");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		printListAsMatrixForm(result);	

	}
	public static void takeInput(List<List<Integer>> list , int rows,int columns,Scanner sc){

		for (int i = 0 ; i < rows ; ++i) {
			List<Integer> row =  new ArrayList<>();

			for (int j = 0 ; j < columns ; ++j) {
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
			}catch(InputMismatchException ie){
				System.out.println("\nInvalid Input , Plz Enter An Integer As Input.");
				sc.next();// to clear the input buffer.
			}catch (Exception e) {
				System.out.println("\n"+e.getMessage());
			}
		}
	}
	public static void printListAsMatrixForm(List<List<Integer>> list){

		for (List<Integer> row : list) {
			for (int item : row) {
				System.out.print(item+"\t");
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> addTwoMatrixes(List<List<Integer>> list1 , List<List<Integer>> list2){

		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0 ; i < list1.size() ; ++i) {
			
			List<Integer> row = new ArrayList<>();

			for (int j = 0 ; j < list1.get(i).size() ; ++j ) {

				int sum = list1.get(i).get(j) + list2.get(i).get(j);

				row.add(sum);
			}
			result.add(row);
		}

		return result;
	}
}