// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.*;

public class eighthProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x : ");
        int x = sc.nextInt();

        System.out.println("Enter n : ");
        int n = sc.nextInt();
        
        double result = Math.pow(x, n);
        System.out.println(x + " to the power " + n + " is " + result);
        sc.close();

    }

}
