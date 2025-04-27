import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int i = 0; // Start pointer

        for (int j = 0; j < n; j++) { // End pointer moves with for loop
            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            maxLength = Math.max(maxLength, j - i + 1);
        }

        return maxLength;
    }
}
