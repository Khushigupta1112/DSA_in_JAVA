import java.util.Scanner;

public class average {
    public static int printAverage(int a , int b , int c){
        int avg = (a+b+c)/3 ;
         return avg;
    }
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = printAverage(a,b,c);
        System.out.println(avg);

    }
}
