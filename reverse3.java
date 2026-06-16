import java.util.Scanner;

public class reverse3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        StringBuilder sbl = new StringBuilder();
        sbl.append(n);
        sbl.reverse();
        System.out.println( "Reversed number : " + sbl);
        sc.close();




    }


}
