// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class fourthProgram {
    public static double findCircumference(int num){
        // formula : 2*pi*r
        final double pi = 3.14159;
        double calc =  2*pi*num;

        return calc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter radius : ");
        int radius = sc.nextInt();

        double circumference = findCircumference(radius);
        System.out.println("circumference of radius " + radius + " is " + circumference);

        sc.close();
        
    }
}
