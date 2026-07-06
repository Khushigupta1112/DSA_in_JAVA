import java.util.Scanner;
public class grades {
    public static void main(String[] args) {
        System.out.println("Enter the marks of students: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>90 && n<=100){
            System.out.println("GRADE A ");
        }
        else if(n>=80 && n<=89){
            System.out.println("GRADE B ");
        }
        else if (n>=70 && n<=79){
            System.out.println(" GRADE C ");
        }
        else if (n>=60 && n<=69){
            System.out.println(" GRADE D ");
        }
            else if (n>=50 && n<=59){
                System.out.println(" GRADE F ");
            }
            else if(n>=1 && n<=49 ){ System.out.println("fail");
        }
        else{
            System.out.println("Invalid Marks");
        }
        


    
}
}