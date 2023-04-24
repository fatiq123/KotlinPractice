
//You are given a 0-indexed array nums of size n consisting of non-negative integers.
//
//You need to apply n - 1 operations to this array where, in the ith operation (0-indexed), you will apply the following on the ith element of nums:
//
//If nums[i] == nums[i + 1], then multiply nums[i] by 2 and set nums[i + 1] to 0. Otherwise, you skip this operation.
//After performing all the operations, shift all the 0's to the end of the array.
//
//For example, the array [1,0,2,0,0,1] after shifting all its 0's to the end, is [1,2,1,0,0,0].
//Return the resulting array.
//
//Note that the operations are applied sequentially, not all at once.

class Solution {
    fun applyOperations(nums: IntArray): IntArray {
        val n = nums.size
        for (i in 0 until n-1) {
            if (nums[i] == nums[i+1]) {
                nums[i] *= 2
                nums[i+1] = 0
            }
        }
        var i = 0
        var j = 0
        while (i < n) {
            if (nums[i] != 0) {
                nums[j++] = nums[i]
            }
            i++
        }
        while (j < n) {
            nums[j++] = 0
        }
        return nums
    }

}








//You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:
//
//The length of the subarray is k, and
//All the elements of the subarray are distinct.
//Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.
//
//A subarray is a contiguous non-empty sequence of elements within an array.
fun maxSubarraySum(nums: IntArray, k: Int): Int {
    var i = 0
    var j = 0
    var sum = 0
    var maxSum = 0
    val seen = mutableSetOf<Int>()

    while (j < nums.size) {
        if (seen.contains(nums[j])) {
            // Move the window to the right and remove the leftmost element from the set
            seen.remove(nums[i])
            sum -= nums[i]
            i++
        } else {
            // Add the current element to the set and the sum
            seen.add(nums[j])
            sum += nums[j]
            j++
            // If the window is of size k and all its elements are distinct, update the maxSum
            if (j-i == k && seen.size == k) {
                maxSum = maxOf(maxSum, sum)
            }
        }
    }

    return maxSum
}
