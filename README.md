### [19. Remove Nth Node From End of List](./src/main/java/leetcode/RemoveNthFromEnd.java)
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return the number of distinct solutions to the n-queens puzzle.

#### Example1:
````
Input: n = 4
Output: 2
Explanation: There are two distinct solutions to the 4-queens puzzle as shown.
````

#### Example2:
````
Input: n = 1
Output: 1
````

#### Constraints:

- 1 <= n <= 9
---

### [52. N-Queens II](./src/main/java/leetcode/NQueensII.java)
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return the number of distinct solutions to the n-queens puzzle.

#### Example1:
````
Input: n = 4
Output: 2
Explanation: There are two distinct solutions to the 4-queens puzzle as shown.
````

#### Example2:
````
Input: n = 1
Output: 1
````

#### Constraints:

- 1 <= n <= 9
---

### [164. Maximum Gap](./src/main/java/leetcode/MaximumGap.java)
Given an integer array nums, return the maximum difference between two successive elements in its sorted form. If the array contains less than two elements, return 0.

You must write an algorithm that runs in linear time and uses linear extra space.

#### Example1:
````
Input: nums = [3,6,9,1]
Output: 3
Explanation: The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3.
````

#### Example2:
````
Input: nums = [10]
Output: 0
Explanation: The array contains less than 2 elements, therefore return 0.
````

#### Constraints:

- 1 <= nums.length <= 10^4
- 0 <= nums[i] <= 10^9
---

### [695. Max Area of Island](./src/main/java/leetcode/MaxAreaOfIsland.java)
You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

The area of an island is the number of cells with a value 1 in the island.

Return the maximum area of an island in grid. If there is no island, return 0.

#### Example1:
````
Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
Output: 6
Explanation: The answer is not 11, because the island must be connected 4-directionally.
````

#### Example2:
````
Input: grid = [[0,0,0,0,0,0,0,0]]
Output: 0
````

#### Constraints:

- m == grid.length
- n == grid[i].length
- 1 <= m, n <= 50
- grid[i][j] is either 0 or 1.
---

### [923. 3Sum With Multiplicity](./src/main/java/leetcode/ThreeSumWithMultiplicity.java)
Given an integer array arr, and an integer target, return the number of tuples i, j, k such that i < j < k and arr[i] + arr[j] + arr[k] == target.

As the answer can be very large, return it modulo 10^9 + 7.

#### Example1:
````
Input: arr = [1,1,2,2,3,3,4,4,5,5], target = 8
Output: 20
Explanation: 
Enumerating by the values (arr[i], arr[j], arr[k]):
(1, 2, 5) occurs 8 times;
(1, 3, 4) occurs 8 times;
(2, 2, 4) occurs 2 times;
(2, 3, 3) occurs 2 times.
````

#### Example2:
````
Input: arr = [1,1,2,2,2,2], target = 5
Output: 12
Explanation: 
arr[i] = 1, arr[j] = arr[k] = 2 occurs 12 times:
We choose one 1 from [1,1] in 2 ways,
and two 2s from [2,2,2,2] in 6 ways.
````

#### Constraints:

- 3 <= arr.length <= 3000
- 0 <= arr[i] <= 100
- 0 <= target <= 300
---
### [1695. Maximum Erasure Value](./src/main/java/leetcode/MaximumUniqueSubarray.java)
You are given an array of positive integers nums and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.

Return the maximum score you can get by erasing exactly one subarray.

An array b is called to be a subarray of a if it forms a contiguous subsequence of a, that is, if it is equal to a[l],a[l+1],...,a[r] for some (l,r).

#### Example1:
````
Input: nums = [4,2,4,5,6]
Output: 17
Explanation: The optimal subarray here is [2,4,5,6].
````

#### Example2:
````
Input: nums = [5,2,1,2,5,2,1,2,5]
Output: 8
Explanation: The optimal subarray here is [5,2,1] or [1,2,5].
````

#### Constraints:

- 1 <= nums.length <= 10^5
- 1 <= nums[i] <= 10^4

---

