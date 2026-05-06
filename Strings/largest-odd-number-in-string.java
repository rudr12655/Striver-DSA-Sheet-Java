# Largest Odd Number in a String

## Problem

Given a string `num` representing a large integer, return the largest-valued odd integer that is a non-empty substring of `num`.

If no odd integer exists, return an empty string `""`.

In this problem, we can remove digits from the end of the string to get the answer.

## Example

```text
Input: num = "52"
Output: "5"

  Input: num = "4206"
Output: ""

  Intuition

A number is odd if its last digit is odd.

Odd digits are:

1, 3, 5, 7, 9

So instead of checking every possible substring, we only need to find the rightmost odd digit.

Why rightmost?

Because we need the largest odd number possible.
The longer the prefix, the larger the number will be.

So we start from the end of the string and move towards the beginning.

CODE::::::::::::::::::::::::::::::::::::::

  class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);

            if ((ch - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}
