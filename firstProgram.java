// Enter 3 numbers from the user & make a function to print their average.


import java.util.*;

public class firstProgram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Third number : ");
        int num3 = sc.nextInt();

        int avg = (num1+num2+num3)/3 ; 

        System.out.println("Average of given three number is : " + avg);

        sc.close();
    }
}