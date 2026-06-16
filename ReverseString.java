import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

    //using concatanation
    Scanner sc = new Scanner(System.in);
    String num = sc.next();
    String reverse = " ";
    for(int i = num.length() - 1; i>=0;i--){
        reverse = reverse + num.charAt(i);
    }
    System.out.println("Reversed number  : " + reverse);

    }
}
