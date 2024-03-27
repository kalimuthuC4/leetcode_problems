import java.util.Collections;

class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += k * 2) {
            // Reverse the chunk of size k
            int end = Math.min(i + k, s.length());
            String chunk = s.substring(i, end);
            String reversedChunk = reverseString(chunk);
            sb.append(reversedChunk);
            
            // Append the next chunk of size k as it is
            int nextStart = Math.min(i + k, s.length());
            int nextEnd = Math.min(nextStart + k, s.length());
            sb.append(s, nextStart, nextEnd);
        }
        return sb.toString();
    }
    
    private String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
