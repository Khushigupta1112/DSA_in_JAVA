/*package whatever //do not write package name here */

import java.util.Scanner;

public class function{
    public static int calpdt(int a , int b ){
        int c = a*b ;
        return c ;

    }
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = calpdt(a,b);
        System.out.println(c);


    }
}
