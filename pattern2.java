import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        System.out.println("how many rows u wanna print : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
        }
  System.out.println();     
}
}}