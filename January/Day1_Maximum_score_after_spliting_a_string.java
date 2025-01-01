class Solution {
    public int maxScore(String s) {
        int res =0;
        for(int i = 1;i<s.length();i++){
            int left =0;
            int right = 0;
            for(int j =0;j<i;j++){
                if(s.charAt(j) == '0'){
                    left++;
                }
            }
            for(int j =i;j<s.length();j++){
                if(s.charAt(j) == '1'){
                    right++;
                }
            }
            res = Math.max(res,left+right);
        }
        return res;
        
    }
}
