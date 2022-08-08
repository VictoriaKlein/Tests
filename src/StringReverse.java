import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String inputString = sc.nextLine();
        reverseString(inputString);

    }
    public static void reverseString (String inputString){
        String reversedString = null;

        long cur1 = System.currentTimeMillis();
        for (int i=0; i<=1000; i++){
            reversedString = new StringBuilder(inputString).reverse().toString();}
        double timeRes1 = (double)((System.currentTimeMillis() - cur1))/1000;
        long cur2 = System.currentTimeMillis();
        for (int i=0; i<=10000; i++){
            reversedString = new StringBuilder(inputString).reverse().toString();}
        double timeRes2 = (double)((System.currentTimeMillis() - cur2))/1000;
        long cur3 = System.currentTimeMillis();
        for (int i=0; i<=100000; i++){
            reversedString = new StringBuilder(inputString).reverse().toString();}
        double timeRes3 = (double)((System.currentTimeMillis() - cur3))/1000;
//        for (int i = 0; i < inputString.length(); i++) {
//            reversedString = inputString.charAt(i) + reversedString;
//        }
        ;
//        char [] array = inputString.toCharArray();
//        for (int i = array.length - 1; i >= 0; i--) {
//            reversedString+=array[i];
//        }
        System.out.println(inputString + " " + reversedString + " " + timeRes1 + " " + timeRes2 + " " + timeRes3);
    }
}
