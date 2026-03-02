// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;

public class stringHWOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        // cleared string buffer here
        sc.nextLine();

        String sentences[] = new String[size];

        for (int i = 0; i < size; i++) {
            sentences[i] = sc.nextLine();
        }

        StringBuilder mergedString = new StringBuilder();

        for (int i = 0; i < sentences.length; i++) {
            mergedString.append(sentences[i]);
        }

        System.out.println("Merged String: " + mergedString);
        System.out.println("Total Length: " + mergedString.length());

        sc.close();
    }
}





// approach without string builder

// import java.util.*;


// public class Strings {
//    public static void main(String args[]) {
//      Scanner sc = new Scanner (System.in);
//      int size = sc.nextInt();
//      String array[] = new String[size];
//      int totLength = 0;


//      for(int i=0; i<size; i++) {
//        array[i] = sc.next();
//        totLength += array[i].length();
//      }


//      System.out.println(totLength);
//    }
// }
