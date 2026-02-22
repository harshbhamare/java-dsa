// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

public class ninethProgram {

    public static int findGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args){
        System.out.println(findGCD(134, 148)); // 6
    }
}