package general;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersCountInList {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("\nEnter the size of elements you need to keep in LIST : ");
            int size;
            while(true){
                size = getValidInput(sc);
                if(size > 0){
                    break;
                }else{
                    System.out.println(size+" : size must be greater than zero!");
                }
            }
            List<Integer> list = new ArrayList<>();
            System.out.println("\nEnter the elements into list : ");
            takeInput(sc,list,size);

            System.out.println("\nResulted List : "+list);

            int primesCount = getPrimesCountFromList(list);

            System.out.println("\nPrimes Count : "+primesCount);

        }
    }
    public static void takeInput(Scanner sc,List<Integer> list,int size){
        for(int i=0;i<size;++i){
            list.add(getValidInput(sc));
        }
    }
    public static int getValidInput(Scanner sc){
      while(true){
          try{
              return sc.nextInt();
          }catch(InputMismatchException ime){
              System.out.println("\nInvalid input!pls enter valid integer as input : ");
              sc.next();
          }
      }
    }
    public static int getPrimesCountFromList(List<Integer> list){
        int primesCount = 0;
        for(int item : list){
            if(isPrime(item)){
                ++primesCount;
            }
        }
        return primesCount;
    }
    public static boolean isPrime(int num){
        if(num < 2) return false;

        for(int i = 2 ; i < num / 2 ;++i){
            if(num % i == 0) return false;
        }
        return true;
    }
}
