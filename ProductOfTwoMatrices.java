import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
interface IOne{

	public static void takeInput(List<List<Integer>> matrix,int rows,int cols,Scanner sc){
		for (int i = 0 ; i < rows ; ++i) {
			List<Integer> row = new ArrayList<Integer>();
			for (int j = 0 ; j < cols; ++j) {
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
				System.out.println("\nInvalid Input!Please Enter Valid Integer As Input. Try Again : ");
				sc.next();
			}
		}
	}

	public static void printMatrix(List<List<Integer>> matrix){

		for (List<Integer> row : matrix) {
			
			for (Integer item : row) {
				
				System.out.print(item+"\t");
			}

			System.out.println();
		}
	}

	public abstract List<List<Integer>> findProductOfTwoMatrices(List<List<Integer>> matrix1,List<List<Integer>> matrix2,int rows,int cols);
}

public class ProductOfTwoMatrices{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter no.of rows & columns : ");
			int rows,cols;

			while (true) {
				rows = IOne.getValidInput(sc);
				cols = IOne.getValidInput(sc);

				if(rows > 0 && cols > 0){
					break;
				}
				System.out.println("\nRows & Columns must be greater than zero!! Try Again : ");

			}

			List<List<Integer>> matrix1 = new ArrayList<>();
			List<List<Integer>> matrix2 = new ArrayList<>();

			System.out.println("\nEnter the elements into matrix 1 : ");

			IOne.takeInput(matrix1,rows,cols,sc);

			System.out.println("\nEnter the elements into matrix 2 : ");
			IOne.takeInput(matrix2,rows,cols,sc);

			System.out.println("\n::Matrix 1 ::");
			System.out.println("~~~~~~~~~~~~~~~~~");
			IOne.printMatrix(matrix1);

			System.out.println("\n::Matrix 2 ::");
			System.out.println("~~~~~~~~~~~~~~~~~");
			IOne.printMatrix(matrix2);

			IOne i1 = (m1,m2,r,c) -> {
				                        List<List<Integer>> res = new ArrayList<>();

				                        for (int i = 0 ; i < r ; ++i) {

				                        	List<Integer> row = new ArrayList<>();

				                        	for (int j = 0 ; j < c ; ++j) {
				                        		
				                        		row.add(0);

				                        	}

				                        	res.add(row);
				                        }


				                        for (int i = 0 ; i < r ; ++i) {
				                        	
				                        	for (int j = 0 ; j < c ; ++j) {
				                        		
				                        		for (int k = 0 ; k < r ; ++k) {
				                        			
				                        			int value = res.get(i).get(j) + (m1.get(i).get(k) * m2.get(k).get(j));

				                        			res.get(i).set(j,value);
				                        		}

				                        	}
				                        }

				                        return res;

			                         };

			List<List<Integer>> res = i1.findProductOfTwoMatrices(matrix1,matrix2,rows,cols);
			System.out.println("\n:: Product Of Two Matrices ::");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			IOne.printMatrix(res);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}