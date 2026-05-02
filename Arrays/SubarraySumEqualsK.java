/*
Problem: Subarray Sum Equals K

Intuition:
We need to count all continuous subarrays whose sum is equal to k.
The simplest way is to try every possible starting point and then keep extending the subarray one by one.

Approach:
1. Start from every index i.
2. For each i, take sum = 0.
3. Move j from i to end of array.
4. Keep adding nums[j] into sum.
5. Whenever sum becomes equal to k, increase count.

Time Complexity: O(n^2)
Because we are using two loops to check all possible subarrays.

Space Complexity: O(1)
Because we are not using any extra data structure.
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
