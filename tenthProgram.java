// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
// (BONUS)

import java.util.Scanner;

public class tenthProgram {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for(int i=0; i <= n; i++){
            System.out.println(a + "");

            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
    
}
