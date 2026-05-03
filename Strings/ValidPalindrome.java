/*
Problem: Valid Palindrome
Topic: Strings, Two Pointers

Intuition:
We need to check whether the given string is a palindrome after ignoring spaces,
symbols, and cases. Instead of creating a new cleaned string, we can use two
pointers: one from the start and one from the end.

If a character is not a letter or digit, we skip it. When both characters are valid,
we convert them to lowercase and compare them.

Approach:
1. Take two pointers:
   - left at the start of the string
   - right at the end of the string

2. Run a loop while left < right.

3. If the character at left is not a letter or digit, move left forward.

4. If the character at right is not a letter or digit, move right backward.

5. When both characters are valid, convert both to lowercase and compare.

6. If they are not equal, return false.

7. If they are equal, move both pointers inward.

8. If the loop finishes without mismatch, return true.

Time Complexity:
O(n), because each character is visited at most once.

Space Complexity:
O(1), because we are not using any extra data structure.
*/

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char ch1 = Character.toLowerCase(s.charAt(left));
            char ch2 = Character.toLowerCase(s.charAt(right));

            if (ch1 != ch2) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
