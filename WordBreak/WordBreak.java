public class WordBreak {
    public boolean wordBreak(String s, Set<String> wordDict) {
        List<Integer> mark = new ArrayList<>();
        mark.add(0);
        for(int i=1; i<=s.length(); i++) {
            for(int j=mark.size()-1; j>=0; j--) {
                if(wordDict.contains(s.substring(mark.get(j), i))) {
                    if(i==s.length()) {
                        return true;
                    }
                    mark.add(i);
                    break;
                }
            }
        }
        return false;
    }
}