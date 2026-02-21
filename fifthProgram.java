// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;

public class fifthProgram{
     public static boolean voteCalc(int age){
        if(age <= 0 || age > 120){
            System.out.println("Invalid Age");
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        if(voteCalc(age)){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible");
        };

        sc.close();
    }
    
}