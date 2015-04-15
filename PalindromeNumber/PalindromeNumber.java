public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int tmp = x;
        int com = 0;
        while(x>0) {
            com *= 10;
            com += x%10;
            x /= 10;
        }
        return tmp == com;
    }
}