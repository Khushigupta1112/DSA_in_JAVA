public class Recursion9 {
    static int palindromeNo(int n, int rev ){
        //Base Case
        if(n == 0){
            return rev;

        }

        int digit = n%10;
        rev = rev *10 + digit;

        return palindromeNo(n/10 , rev);
        
         
    }

    static boolean isPalindrome(int n){
        int original = n;
        int reversed = palindromeNo(n,0);
        return original == reversed;

    }

    public static void main(String[] args){
        int n = 121;
        if(isPalindrome(n)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }

    }

}
