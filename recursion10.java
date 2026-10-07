public class recursion10 {
    // binary to decimal conversion
    static void DecimalToBinary(int n) {
        if (n == 0) {
            System.out.print("0");
            return;
        }
        if (n > 1) {
            DecimalToBinary(n / 2);
        }
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        DecimalToBinary(101);
    }
}
