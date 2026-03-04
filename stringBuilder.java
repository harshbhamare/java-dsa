public class stringBuilder {
    public static void main(String[] args) {
        // declaration 
        StringBuilder sb = new StringBuilder("Harsh Bhamare");
        System.out.println(sb);

        // finding character at specified index
        System.out.println(sb.charAt(4));

        // set char at specific location
        sb.setCharAt(4, 'z');
        System.out.println(sb);

        // inserting character at specific index
        sb.insert(0, 'A');
        System.out.println(sb);

        // deleting character at specific index
        sb.delete(0,3);
        System.out.println(sb);

        // append character
        sb.append(" You can do this!");
        System.out.println(sb);

        // getting length of string
        System.out.println(sb.length());

        // reversing the string
        StringBuilder stat = new StringBuilder("This string is going to be reversed!");
        
        for(int i=0 ; i<=stat.length()/2 ; i++){
            int front = i;
            int back = stat.length()-i-1;

            char frontChar = stat.charAt(front);
            char backChar = stat.charAt(back);

            stat.setCharAt(front, backChar);
            stat.setCharAt(back, frontChar);
        }

        System.out.println(stat);

    }
}