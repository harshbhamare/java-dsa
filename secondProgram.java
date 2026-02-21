// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class secondProgram{

    public static int sumOfOdd(int n){
        int sum = 0;

        for(int i=1; i<=n ; i++){
            if(i%2 != 0){
                sum = sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to get sum : ");
        int num = sc.nextInt();

        int result = sumOfOdd(num);
        System.out.println("addition : " + result);
        sc.close();
    }
}