public class Recursion1 {
    static void printNumbers(int n){
        if(n == 0){
            return;

        }

        // Recursive call
        printNumbers(n-1);

        // Print the number after the recursive call
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }
}
