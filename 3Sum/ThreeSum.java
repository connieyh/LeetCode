public class ThreeSum {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(num);
        int start = 0;
        int mid = start+1;
        int end = num.length-1;
        while(start < end) {
            while( mid < end) {
                if(num[start] + num[mid] + num[end] == 0) {
                    result.add(new ArrayList<Integer>());
                    result.get(result.size()-1).add(num[start]);
                    result.get(result.size()-1).add(num[mid]);
                    result.get(result.size()-1).add(num[end]);
                    while(mid < end && num[mid] == num[mid+1]) {
                        mid++;
                    }
                    mid++;
                    while(mid < end && num[end] == num[end-1]) {
                        end--;
                    }
                    end--;
                }else if(num[start] + num[mid] + num[end] < 0) {
                    mid++;
                }else {
                    end--;
                }
            }
            while(start < num.length-1 && num[start] == num[start+1]) {
                start++;
            }
            start++;
            mid = start+1;
            end = num.length-1;
        }
        return result;
    }
}