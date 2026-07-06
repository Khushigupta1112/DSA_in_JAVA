import java.util.*;
public class TwoDarray {
    public static void main(String[] args) {
        System.out.println("write r and c :");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        //input
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
               System.out.print(arr[i][j] + "  ");

            }
            System.out.println();
        
        }


    }
}
