class Solution {
    public String removeTrailingZeros(String num) {
        int remove = 0;

        for(int i = num.length() - 1; i > 0;i--){
            if(num.charAt(i) == '0'){
                remove++;
            }else {
                break;
            }
        }
        String result = num.substring(0,num.length() - remove);
        return result;
    }
}