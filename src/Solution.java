import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;

        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            // If the character is already in the set, move the left pointer
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set
            set.add(s.charAt(right));

            // Update the maximum length of substring
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcdabcbb";
        System.out.println("Length of longest substring: " + solution.lengthOfLongestSubstring(s));
    }
}
