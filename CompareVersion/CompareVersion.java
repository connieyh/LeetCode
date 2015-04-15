public class CompareVersion {
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int a = 0;
        int b = 0;
        while( a < v1.length || b < v2.length) {
            if(a < v1.length && b < v2.length) {
                int x = Integer.parseInt(v1[a]);
                int y = Integer.parseInt(v2[b]);
                if( x < y) {
                    return -1;
                }else if( x > y) {
                    return 1;
                }
            } else if(a < v1.length && b > v2.length-1 && Integer.parseInt(v1[a])>0) {
                return 1;
            } else if(a > v1.length-1 && b < v2.length && Integer.parseInt(v2[b])>0) {
                return -1;
            } 
            a++;
            b++;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(compareVersion("1.0", "1"));
    } 

}