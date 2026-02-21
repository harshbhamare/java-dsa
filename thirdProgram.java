//  Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class thirdProgram{

    public static int checkGreaterNum(int num1, int num2){
        if(num1 > num2){
            return num1;
        } else{
            return num2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        int result = checkGreaterNum(num1, num2);
        System.out.println("Greater Number is " + result);
        sc.close();
    }
}