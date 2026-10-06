public class palindrome {
    static int reverseNumber(int n, int rev){
        if(n == 0){
            return rev ;

        }
        int lastDigit = n%10;
        rev = rev*10 + lastDigit;
        return reverseNumber(n/10 , rev);

    }
    static boolean isPalindrome(int n){
        int original = n;
        int reverse = reverseNumber(n, 0);
        return original == reverse;
    }
    public static void main(String[] args){
        int number = 1997;
        if(isPalindrome(number)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }

}