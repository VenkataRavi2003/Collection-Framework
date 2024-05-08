import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class PrintingListElementsInMatrixFormat{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter no.of rows : ");
        int rows = sc.nextInt();

        System.out.print("\nEnter no.of columns : ");
        int columns = sc.nextInt();

        if(rows <= 0 || columns <= 0){
            System.out.println("\nrows & columns must greater than zero!!");
            sc.close();
            return;
        }

        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        takeInput(al , rows, columns , sc);

        System.out.println("\nResulted Matrix :: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        printArrayListInMatrixForm(al);

        sc.close();

    }
    public static void takeInput(ArrayList<ArrayList<Integer>> al , int rows , int columns , Scanner sc){

        System.out.println("\nEnter the elements into ArrayList : ");

        for (int i = 0 ; i < rows ; ++i) {

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0 ; j < columns ; ++j ) {
    
                 int element = getIntInput(sc);

                 row.add(element);
            }

            al.add(row);
        }
    }
    public static void printArrayListInMatrixForm(ArrayList<ArrayList<Integer>> al){

        for(ArrayList<Integer> row : al){

            for(int item : row){
                System.out.print(item+" ");
            }

            System.out.println();
        }
    }
    public static int getIntInput(Scanner sc){

        while(true){

            try{
                return sc.nextInt();
            }catch(InputMismatchException ime){
                System.out.println("\nInvalid Input! Plz Enter Integer Value As Input.");
                sc.next(); // clear the Invalid Input
            }
        }
    }
}