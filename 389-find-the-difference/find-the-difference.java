class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26]; // Assuming only lowercase English alphabets are present
        
        // Count occurrences of each character in string s
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        // Subtract occurrences of each character in string t
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }
        
        // Find the differing character
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return (char) (i + 'a');
            }
        }
        
        return ' '; // Handle the case when input strings are empty or have equal characters
    }
}
