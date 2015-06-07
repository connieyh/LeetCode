public class RomanToInteger {
    public int romanToInt(String s) {
        int sum = convert(s.charAt(0));
        for(int i=1; i<s.length(); i++) {
            if(convert(s.charAt(i)) > convert(s.charAt(i-1))) {
                sum -= 2*convert(s.charAt(i-1));
            }
            sum += convert(s.charAt(i));
        }
        return sum;
    }
    public int convert(char letter) {
        switch(letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                break;
        }
        return 0;
    }
}