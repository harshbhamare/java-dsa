// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

import java.util.*;

public class stringHWTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String input = sc.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            // System.out.println(input.charAt(i));
            if (input.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += input.charAt(i);
            }
        }
        System.out.println("Converted String: " + result);
        sc.close();
    }
}

// new learning
// double quote -> String
// single quote -> char