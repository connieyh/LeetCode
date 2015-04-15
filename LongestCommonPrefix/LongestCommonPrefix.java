public class LongestCommonPrefix{
    public String longestCommonPrefix(List<String> strs) {
        if(strs.size()==0) {
            return "";
        }
        String common = strs.get(0);
        for(int i=1; i<strs.size(); i++) {
            String s = strs.get(i);
            if(s.equals("")){
                return "";
            }
            for(int j=0; j<Math.min(common.length(), s.length()); j++) {
                if(common.charAt(j) != s.charAt(j)) {
                    common = common.substring(0, j);
                    break;
                }else if(j == s.length()-1) {
                    common = common.substring(0, j+1);
                }
            }
        }
        return common;
    }
}