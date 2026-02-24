// Find the maximum & minimum number in an array of integers. 

import java.util.Scanner;

public class hwTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array : ");
        int size = sc.nextInt();

        int numbers[] = new int[size];
        for (int i=0; i<size ; i++){
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0 ; i<numbers.length ; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Maximum value is : " + max);
        System.out.println("Minimum value is : " + min);


        sc.close();
    }
    
}
