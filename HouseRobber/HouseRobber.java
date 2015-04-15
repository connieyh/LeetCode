public class HouseRobber {
    public int rob(int[] num) {
        if(num.length==0 || num.length==1){
            return num.length == 0 ? 0 : num[0];
        }
        int[] dp = new int[num.length];
        for(int i=0; i<dp.length; i++) {
            if(i==0 || i==1) {
                dp[i] = num[i];
            }else if(i==2) {
                dp[i] = num[i] + num[i-2];
            }else{
                dp[i] = Math.max(dp[i-2], dp[i-3]) + num[i];
            }
        }
        return Math.max(dp[num.length-1], dp[num.length-2]);
    }
}