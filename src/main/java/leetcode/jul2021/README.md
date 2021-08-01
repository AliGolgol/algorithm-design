### [Gray Code](./GrayCode.java)
An n-bit gray code sequence is a sequence of 2n integers where:

- Every integer is in the inclusive range [0, 2n - 1],
- The first integer is 0,
- An integer appears no more than once in the sequence,
- The binary representation of every pair of adjacent integers differs by exactly one bit, and
- The binary representation of the first and last integers differs by exactly one bit.
  Given an integer n, return any valid n-bit gray code sequence.
#### Example 1:
````
Input: n = 2
Output: [0,1,3,2]
Explanation:
The binary representation of [0,1,3,2] is [00,01,11,10].
- 00 and 01 differ by one bit
- 01 and 11 differ by one bit
- 11 and 10 differ by one bit
- 10 and 00 differ by one bit
[0,2,3,1] is also a valid gray code sequence, whose binary representation is [00,10,11,01].
- 00 and 10 differ by one bit
- 10 and 11 differ by one bit
- 11 and 01 differ by one bit
- 01 and 00 differ by one bit
````
#### Example 2:
````
Input: n = 1
Output: [0,1]
````
#### Constraints:
- 1 <= n <= 16
---
### [Find K Closest Elements](./FindKClosestElements.java)
Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:

- |a - x| < |b - x|, or
- |a - x| == |b - x| and a < b
#### Example 1:
````
Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]
````
#### Example 2:
````
Input: arr = [1,2,3,4,5], k = 4, x = -1
Output: [1,2,3,4]
````
#### Constraints:
- 1 <= k <= arr.length
- 1 <= arr.length <= 10^4
- arr is sorted in ascending order.
- -10^4 <= arr[i], x <= 10^4
---
### [Max Sum of Rectangle No Larger Than K](./MaxSumRectangleNoLargerThanK.java)
Given an m x n matrix matrix and an integer k, return the max sum of a rectangle in the matrix such that its sum is no larger than k.

It is guaranteed that there will be a rectangle with a sum no larger than k.
#### Example 1:
````
Input: matrix = [[1,0,1],[0,-2,3]], k = 2
Output: 2
Explanation: Because the sum of the blue rectangle [[0, 1], [-2, 3]] is 2, and 2 is the max number no larger than k (k = 2).
````
#### Example 2:
````
Input: matrix = [[2,2,-1]], k = 3
Output: 3
````
#### Constraints:
- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 100
- -100 <= matrix[i][j] <= 100
- -10^5 <= k <= 10^5

**Follow up**: What if the number of rows is much larger than the number of columns?

---
### [Count Vowels Permutation](./CountVowelsPermutation.java)
Given an integer n, your task is to count how many strings of length n can be formed under the following rules:

- Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')
- Each vowel 'a' may only be followed by an 'e'.
- Each vowel 'e' may only be followed by an 'a' or an 'i'.
- Each vowel 'i' may not be followed by another 'i'.
- Each vowel 'o' may only be followed by an 'i' or a 'u'.
- Each vowel 'u' may only be followed by an 'a'.
  Since the answer may be too large, return it modulo 10^9 + 7.
#### Example 1:
````
Input: n = 1
Output: 5
Explanation: All possible strings are: "a", "e", "i" , "o" and "u".
````
#### Example 2:
````
Input: n = 2
Output: 10
Explanation: All possible strings are: "ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" and "ua".
````
#### Example 3:
````
Input: n = 5
Output: 68
````
#### Constraints:
- 1 <= n <= 2 * 10^4
---
### [Reshape the Matrix](./ReshapeMatrix.java)
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the row number and column number of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
#### Example 1:
````
Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]
````
#### Example 2:
````
Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]
````
#### Constraints:
- m == mat.length
- n == mat[i].length
- 1 <= m, n <= 100
- -1000 <= mat[i][j] <= 1000
- 1 <= r, c <= 300
---
### [Reduce Array Size to The Half](./ReduceArraySizeTheHalf.java)
Given an array arr.  You can choose a set of integers and remove all the occurrences of these integers in the array.

Return the minimum size of the set so that at least half of the integers of the array are removed.
#### Example 1:
````
Input: arr = [3,3,3,3,5,5,5,2,2,7]
Output: 2
Explanation: Choosing {3,7} will make the new array [5,5,5,2,2] which has size 5 (i.e equal to half of the size of the old array).
Possible sets of size 2 are {3,5},{3,2},{5,2}.
Choosing set {2,7} is not possible as it will make the new array [3,3,3,3,5,5,5] which has size greater than half of the size of the old array.
````
#### Example 2:
````
Input: arr = [7,7,7,7,7,7]
Output: 1
Explanation: The only possible set you can choose is {7}. This will make the new array empty.
````
#### Example 3:
````
Input: arr = [1,9]
Output: 1
````
#### Example 4:
````
Input: arr = [1000,1000,3,7]
Output: 1
````
#### Example 5:
````
Input: arr = [1,2,3,4,5,6,7,8,9,10]
Output: 5
````
#### Constraints:
- 1 <= arr.length <= 10^5
- arr.length is even.
- 1 <= arr[i] <= 10^5
---
### [Kth Smallest Element in a Sorted Matrix](./KthSmallestElementSortedMatrix.java)
Given an n x n matrix where each of the rows and columns are sorted in ascending order, return the kth smallest element in the matrix.

Note that it is the kth smallest element in the sorted order, not the kth distinct element.
#### Example 1:
````
Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
Output: 13
Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13    
````
#### Example 2:
````
Input: matrix = [[-5]], k = 1
Output: -5
````
#### Constraints:
- n == matrix.length
- n == matrix[i].length
- 1 <= n <= 300
- -10^9 <= matrix[i][j] <= 10^9
- All the rows and columns of matrix are guaranteed to be sorted in non-decreasing order.
- 1 <= k <= n2
---
### [Maximum Length of Repeated Subarray](./MaximumLengthRepeatedSubarray.java)
Given two integer arrays nums1 and nums2, return the maximum length of a subarray that appears in both arrays.
#### Example 1:
````
Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
Output: 3
Explanation: The repeated subarray with maximum length is [3,2,1].   
````
#### Example 2:
````
Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
Output: 5
````
#### Constraints:
- 1 <= nums1.length, nums2.length <= 1000
- 0 <= nums1[i], nums2[i] <= 100
---
### [Longest Increasing Subsequence](./LongestIncreasingSubsequence.java)
Given an integer array nums, return the length of the longest strictly increasing subsequence.

A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
#### Example 1:
````
Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.   
````
#### Example 2:
````
Input: nums = [0,1,0,3,2,3]
Output: 4
````
#### Example 3:
````
Input: nums = [7,7,7,7,7,7,7]
Output: 1
````
#### Constraints:
- 1 <= nums.length <= 2500
- -10^4 <= nums[i] <= 10^4

**Follow up**: Can you come up with an algorithm that runs in O(n log(n)) time complexity?

---
### [Decode Ways II](./DecodeWaysII.java)
A message containing letters from A-Z can be encoded into numbers using the following mapping:
````
'A' -> "1"
'B' -> "2"
...
'Z' -> "26"
````
To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:

- "AAJF" with the grouping (1 1 10 6)
- "KJF" with the grouping (11 10 6)
  Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".

In addition to the mapping above, an encoded message may contain the '*' character, which can represent any digit from '1' to '9' ('0' is excluded). For example, the encoded message "1*" may represent any of the encoded messages "11", "12", "13", "14", "15", "16", "17", "18", or "19". Decoding "1*" is equivalent to decoding any of the encoded messages it can represent.

Given a string s containing digits and the '*' character, return the number of ways to decode it.

Since the answer may be very large, return it modulo 10^9 + 7.
#### Example 1:
````
Input: s = "*"
Output: 9
Explanation: The encoded message can represent any of the encoded messages "1", "2", "3", "4", "5", "6", "7", "8", or "9".
Each of these can be decoded to the strings "A", "B", "C", "D", "E", "F", "G", "H", and "I" respectively.
Hence, there are a total of 9 ways to decode "*".  
````
#### Example 2:
````
Input: s = "1*"
Output: 18
Explanation: The encoded message can represent any of the encoded messages "11", "12", "13", "14", "15", "16", "17", "18", or "19".
Each of these encoded messages have 2 ways to be decoded (e.g. "11" can be decoded to "AA" or "K").
Hence, there are a total of 9 * 2 = 18 ways to decode "1*".
````
#### Example 3:
````
Input: s = "2*"
Output: 15
Explanation: The encoded message can represent any of the encoded messages "21", "22", "23", "24", "25", "26", "27", "28", or "29".
"21", "22", "23", "24", "25", and "26" have 2 ways of being decoded, but "27", "28", and "29" only have 1 way.
Hence, there are a total of (6 * 2) + (3 * 1) = 12 + 3 = 15 ways to decode "2*".
````
#### Constraints:
- 1 <= s.length <= 105
- s[i] is a digit or '*'.
---
### [Find Median from Data Stream](./FindMedianfromDataStream.java)
The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value and the median is the mean of the two middle values.

- For example, for arr = [2,3,4], the median is 3.
- For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
  Implement the MedianFinder class:

- MedianFinder() initializes the MedianFinder object.
- void addNum(int num) adds the integer num from the data stream to the data structure.
- double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.

#### Example 1:
````
Input
["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"]
[[], [1], [2], [], [3], []]
Output
[null, null, null, 1.5, null, 2.0]

Explanation
MedianFinder medianFinder = new MedianFinder();
medianFinder.addNum(1);    // arr = [1]
medianFinder.addNum(2);    // arr = [1, 2]
medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
medianFinder.addNum(3);    // arr[1, 2, 3]
medianFinder.findMedian(); // return 2.0 
````
#### Constraints:
- -10^5 <= num <= 10^5
- There will be at least one element in the data structure before calling findMedian.
- At most 5 * 10^4 calls will be made to addNum and findMedian.

Follow up:

- If all integer numbers from the stream are in the range [0, 100], how would you optimize your solution?
- If 99% of all integer numbers from the stream are in the range [0, 100], how would you optimize your solution?


---
### [Find Peak Element](./FindPeakElement.java)
A peak element is an element that is strictly greater than its neighbors.

Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞.

You must write an algorithm that runs in O(log n) time.
#### Example 1:
````
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
````
#### Example 2:
````
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
````
#### Constraints:
- 1 <= nums.length <= 1000
- -2^31 <= nums[i] <= 2^31 - 1
- nums[i] != nums[i + 1] for all valid i.
---
### [Custom Sort String](./CustomSortString.java)
order and str are strings composed of lowercase letters. In order, no letter occurs more than once.

order was sorted in some custom order previously. We want to permute the characters of str so that they match the order that order was sorted. More specifically, if x occurs before y in order, then x should occur before y in the returned string.

Return any permutation of str (as a string) that satisfies this property.
#### Example 1:
````
Example:
Input: 
order = "cba"
str = "abcd"
Output: "cbad"
Explanation: 
"a", "b", "c" appear in order, so the order of "a", "b", "c" should be "c", "b", and "a". 
Since "d" does not appear in order, it can be at any position in the returned string. "dcba", "cdba", "cbda" are also valid outputs.
````
#### Constraints:
- order has length at most 26, and no character is repeated in order.
- str has length at most 200.
- order and str consist of lowercase letters only.
---
### [Valid Triangle Number](./ValidTriangleNumber.java)
Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.
#### Example 1:
````
Input: nums = [2,2,3,4]
Output: 3
Explanation: Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3
````
#### Example 2:
````
Input: nums = [4,2,3,4]
Output: 4
````
#### Constraints:
- 1 <= nums.length <= 1000
---
### [4Sum](./FourSum.java)
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
- 0 <= a, b, c, d < n
- a, b, c, and d are distinct.
- nums[a] + nums[b] + nums[c] + nums[d] == target
  You may return the answer in any order.
#### Example 1:
````
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
````
#### Example 2:
````
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
````
#### Constraints:
- 1 <= nums.length <= 10001 <= nums.length <= 200
- -10^9 <= nums[i] <= 10^9
- -10^9 <= target <= 10^9
---
### [Three Equal Parts](./ThreeEqualParts.java)
You are given an array arr which consists of only zeros and ones, divide the array into three non-empty parts such that all of these parts represent the same binary value.

If it is possible, return any [i, j] with i + 1 < j, such that:

- arr[0], arr[1], ..., arr[i] is the first part,
- arr[i + 1], arr[i + 2], ..., arr[j - 1] is the second part, and
- arr[j], arr[j + 1], ..., arr[arr.length - 1] is the third part.
- All three parts have equal binary values.
  If it is not possible, return [-1, -1].

Note that the entire part is used when considering what binary value it represents. For example, [1,1,0] represents 6 in decimal, not 3. Also, leading zeros are allowed, so [0,1,1] and [1,1] represent the same value.


#### Example 1:
````
Input: arr = [1,0,1,0,1]
Output: [0,3]
````
#### Example 2:
````
Input: arr = [1,1,0,1,1]
Output: [-1,-1]
````
#### Example 3:
````
Input: arr = [1,1,0,0,1]
Output: [0,2]
````
#### Constraints:
- 3 <= arr.length <= 3 * 10^4
- arr[i] is 0 or 1
---
### [Reverse Nodes in k-Group](./ReverseNodeskGroup.java)
Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.
#### Example 1:
````
Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
````
#### Example 2:
````
Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]
````
#### Example 3:
````
Input: head = [1,2,3,4,5], k = 1
Output: [1,2,3,4,5]
````
#### Example 4:
````
Input: head = [1], k = 1
Output: [1]
````
#### Constraints:
- The number of nodes in the list is in the range sz.
- 1 <= sz <= 5000
- 0 <= Node.val <= 1000
- 1 <= k <= sz

**Follow-up**: Can you solve the problem in O(1) extra memory space?

---
### [Shuffle an Array](./ShuffleArray.java)
Given an integer array nums, design an algorithm to randomly shuffle the array. All permutations of the array should be equally likely as a result of the shuffling.

Implement the Solution class:

- Solution(int[] nums) Initializes the object with the integer array nums.
- int[] reset() Resets the array to its original configuration and returns it.
- int[] shuffle() Returns a random shuffling of the array.

#### Example 1:
````
Input
["Solution", "shuffle", "reset", "shuffle"]
[[[1, 2, 3]], [], [], []]
Output
[null, [3, 1, 2], [1, 2, 3], [1, 3, 2]]

Explanation
Solution solution = new Solution([1, 2, 3]);
solution.shuffle();    // Shuffle the array [1,2,3] and return its result.
                       // Any permutation of [1,2,3] must be equally likely to be returned.
                       // Example: return [3, 1, 2]
solution.reset();      // Resets the array back to its original configuration [1,2,3]. Return [1, 2, 3]
solution.shuffle();
````
#### Constraints:
- 1 <= nums.length <= 200
- -10^6 <= nums[i] <= 10^6
- All the elements of nums are unique.
- At most 5 * 104 calls in total will be made to reset and shuffle.
---
### [Push Dominoes](./PushDominoes.java)
There are n dominoes in a line, and we place each domino vertically upright. In the beginning, we simultaneously push some of the dominoes either to the left or to the right.

After each second, each domino that is falling to the left pushes the adjacent domino on the left. Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.

When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.

For the purposes of this question, we will consider that a falling domino expends no additional force to a falling or already fallen domino.

You are given a string dominoes representing the initial state where:

- dominoes[i] = 'L', if the ith domino has been pushed to the left,
- dominoes[i] = 'R', if the ith domino has been pushed to the right, and
- dominoes[i] = '.', if the ith domino has not been pushed.
  Return a string representing the final state.

#### Example 1:
````
Input: dominoes = "RR.L"
Output: "RR.L"
Explanation: The first domino expends no additional force on the second domino.
````
#### Example 2:
````
Input: dominoes = ".L.R...LR..L.."
Output: "LL.RR.LLRRLL.."
````
#### Constraints:
- n == dominoes.length
- 1 <= n <= 10^5
- dominoes[i] is either 'L', 'R', or '.'.
---
### [Partition Array into Disjoint Intervals](./PartitionArrayDisjointIntervals.java)
Given an array nums, partition it into two (contiguous) subarrays left and right so that:

- Every element in left is less than or equal to every element in right.
- left and right are non-empty.
- left has the smallest possible size.
  Return the length of left after such a partitioning.  It is guaranteed that such a partitioning exists.
#### Example 1:
````
Input: nums = [5,0,3,8,6]
Output: 3
Explanation: left = [5,0,3], right = [8,6]
````
#### Example 2:
````
Input: nums = [1,1,1,0,6,12]
Output: 4
Explanation: left = [1,1,1,0], right = [6,12]
````
#### Constraints:
- 2 <= nums.length <= 30000
- 0 <= nums[i] <= 10^6
- It is guaranteed there is at least one way to partition nums as described.
---
### [Binary Tree Pruning](./BinaryTreePruning.java)
Given the root of a binary tree, return the same tree where every subtree (of the given tree) not containing a 1 has been removed.

A subtree of a node node is node plus every node that is a descendant of node.
#### Example 1:
````
Input: root = [1,null,0,0,1]
Output: [1,null,0,null,1]
Explanation: 
Only the red nodes satisfy the property "every subtree not containing a 1".
The diagram on the right represents the answer.
````
#### Example 2:
````
Input: root = [1,0,1,0,0,0,1]
Output: [1,null,1,null,1]
````
#### Example 3:
````
Input: root = [1,1,0,1,1,0,1,0]
Output: [1,1,0,1,1,null,1]
````
#### Constraints:
- The number of nodes in the tree is in the range [1, 200].
- Node.val is either 0 or 1.
---
### [Convert Sorted Array to Binary Search Tree](./ConvertSortedArrayBinarySearchTree.java)
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
#### Example 1:
````
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:
````
#### Example 2:
````
Input: nums = [1,3]
Output: [3,1]
Explanation: [1,3] and [3,1] are both a height-balanced BSTs.
````
#### Constraints:
- 1 <= nums.length <= 104
- -104 <= nums[i] <= 104
- nums is sorted in a strictly increasing order.
---
### [3Sum Closest](./ThreeSumClosest.java)
Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
#### Example 1:
````
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
````
#### Constraints:
- 3 <= nums.length <= 10^3
- -10^3 <= nums[i] <= 10^3
- -10^4 <= target <= 10^4
---
### [01 Matrix](./ZeroOneMatrix.java)
Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.

The distance between two adjacent cells is 1.
#### Example 1:
````
Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
Output: [[0,0,0],[0,1,0],[0,0,0]]
````
#### Example 2:
````
Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
Output: [[0,0,0],[0,1,0],[1,2,1]]
````
#### Constraints:
- m == mat.length
- n == mat[i].length
- 1 <= m, n <= 104
- 1 <= m * n <= 104
- mat[i][j] is either 0 or 1.
- There is at least one 0 in mat.
---