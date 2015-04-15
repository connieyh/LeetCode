public class ReverseInteger {
    public int reverse(int x) {
        int tmp = x;
        int com = 0;
        if(x < 0) {
            x = 0 - x;
        }
        while(x > 0) {
            if(Integer.MAX_VALUE/10 < com) {
                return 0;
            }
            com *= 10;
            com += x%10;
            x /= 10;
        }
        return tmp < 0 ? 0-com : com;
    }
}