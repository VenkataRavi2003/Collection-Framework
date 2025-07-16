package general;

import java.util.Scanner;

public class SecondHighestNumberInArray {
    public static void main(String[] args) {

        int size;
        System.out.println("\nEnter the size of array : ");
        try(Scanner sc = new Scanner(System.in)){
            while(true){
                size = getValidInput(sc);
                if(size > 0){
                    break;
                }else{
                    System.out.println(size+" -> array size must be > 0");
                }
            }
            int []arr = new int[size];
            System.out.println("Enter values into array : ");
            takeInput(arr,sc);
            System.out.println("Resulted Array : ");
            printArray(arr);
            int smax = findSecondHighest(arr);
            if(smax == Integer.MIN_VALUE){
                System.out.println("No second max found (array may have all identical elements)");
            }else{
                System.out.println("Second Maxium : "+smax);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    public static void takeInput(int []arr,Scanner sc){
        int i=0;
        do{
            arr[i] = getValidInput(sc);
            i++;
        }while (i < arr.length);
    }
    public static int getValidInput(Scanner sc){
       while(true){
           try{
               return sc.nextInt();
           } catch (NumberFormatException e) {
               System.out.println("Invalid input!Pls enter valid integer as input : ");
               sc.next();
           }
       }
    }
    public static void printArray(int []arr){
        for(int item : arr)
            System.out.print(item+" ");
    }
    public static int findSecondHighest(int []arr){
       int max = Integer.MIN_VALUE,smax = Integer.MIN_VALUE;
       for(int item : arr){
           if(max < item){
               smax = max;
               max = item;
           } else if (smax < item  && max > item) {
               smax = item;
           }
       }
        return smax;
    }
}
