import java.util.Scanner;

public class reverse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enetr the number: ");
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        StringBuffer rev = sb.reverse();
//        System.out.println(sb);
        System.out.println(rev);

    }
}

