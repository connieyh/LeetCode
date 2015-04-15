public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int pre = 0;
        int rear = s.length()-1;
        while(pre < rear) {
            char a = Character.toUpperCase(s.charAt(pre));
            char b = Character.toUpperCase(s.charAt(rear));
            if(Character.isLetterOrDigit(a) && Character.isLetterOrDigit(b)) {
                if(a != b) {
                    return false;
                }
                pre++;
                rear--;
            }else if(!Character.isLetterOrDigit(a)){
                pre++;
            }else if(!Character.isLetterOrDigit(b)){
                rear--;
            }
        }
        return true;
    }
}