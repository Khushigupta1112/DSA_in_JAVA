import java.util.*;
public class pattern8 {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("how many rows you want in this pattern ? ");
            int rows = sc.nextInt();
            System.out.println("here's your pattern....!!!");
            for(int i =1; i<=rows; i++){
                for(int j =1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();

            }
            sc.close();

        }
    }
}
