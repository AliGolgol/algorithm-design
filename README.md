### [Remove Nth Node From End of List](./src/main/java/leetcode/jun2021/RemoveNthFromEnd.java)
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
### [N-Queens II](./src/main/java/leetcode/jun2021/NQueensII.java)
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
### [Interleaving String](./src/main/java/leetcode/jun2021/InterleavingString.java)
TGiven strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.

An interleaving of two strings s and t is a configuration where they are divided into non-empty substrings such that:

- s = s1 + s2 + ... + sn
- t = t1 + t2 + ... + tm
- |n - m| <= 1
The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
Note: a + b is the concatenation of strings a and b.

#### Example1:
````
Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
Output: true
````

#### Example2:
````
Input: s1 = "", s2 = "", s3 = ""
Output: true
````

#### Constraints:

- 0 <= s1.length, s2.length <= 100
- 0 <= s3.length <= 200
- s1, s2, and s3 consist of lowercase English letters.

Follow up: Could you solve it using only O(s2.length) additional memory space?

---
### [Maximum Gap](./src/main/java/leetcode/jun2021/MaximumGap.java)
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
### [Max Area of Island](./src/main/java/leetcode/jun2021/MaxAreaOfIsland.java)
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
### [3Sum With Multiplicity](./src/main/java/leetcode/jun2021/ThreeSumWithMultiplicity.java)
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
### [Maximum Erasure Value](./src/main/java/leetcode/jun2021/MaximumUniqueSubarray.java)
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
### [Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts](./src/main/java/leetcode/jun2021/MaximumUniqueSubarray.java)
Given a rectangular cake with height h and width w, and two arrays of integers horizontalCuts and verticalCuts where horizontalCuts[i] is the distance from the top of the rectangular cake to the ith horizontal cut and similarly, verticalCuts[j] is the distance from the left of the rectangular cake to the jth vertical cut.

Return the maximum area of a piece of cake after you cut at each horizontal and vertical position provided in the arrays horizontalCuts and verticalCuts. Since the answer can be a huge number, return this modulo 10^9 + 7.

#### Example1:
````
Input: h = 5, w = 4, horizontalCuts = [1,2,4], verticalCuts = [1,3]
Output: 4 
Explanation: The figure above represents the given rectangular cake. Red lines are the horizontal and vertical cuts. After you cut the cake, the green piece of cake has the maximum area.
````

#### Example2:
````
Input: h = 5, w = 4, horizontalCuts = [3,1], verticalCuts = [1]
Output: 6
Explanation: The figure above represents the given rectangular cake. Red lines are the horizontal and vertical cuts. After you cut the cake, the green and yellow pieces of cake have the maximum area.
````
#### Example3:
````
Input: h = 5, w = 4, horizontalCuts = [3], verticalCuts = [3]
Output: 9
````

#### Constraints:

- 2 <= h, w <= 10^9
- 1 <= horizontalCuts.length < min(h, 10^5)
- 1 <= verticalCuts.length < min(w, 10^5)
- 1 <= horizontalCuts[i] < h
- 1 <= verticalCuts[i] < w
- It is guaranteed that all elements in horizontalCuts are distinct.
- It is guaranteed that all elements in verticalCuts are distinct.
---
### [Open the Lock](./src/main/java/leetcode/jun2021/MaximumUniqueSubarray.java)
You have a lock in front of you with 4 circular wheels. Each wheel has 10 slots: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'. The wheels can rotate freely and wrap around: for example we can turn '9' to be '0', or '0' to be '9'. Each move consists of turning one wheel one slot.

The lock initially starts at '0000', a string representing the state of the 4 wheels.

You are given a list of deadends dead ends, meaning if the lock displays any of these codes, the wheels of the lock will stop turning and you will be unable to open it.

Given a target representing the value of the wheels that will unlock the lock, return the minimum total number of turns required to open the lock, or -1 if it is impossible.

#### Example1:
````
Input: deadends = ["0201","0101","0102","1212","2002"], target = "0202"
Output: 6
Explanation:
A sequence of valid moves would be "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202".
Note that a sequence like "0000" -> "0001" -> "0002" -> "0102" -> "0202" would be invalid,
because the wheels of the lock become stuck after the display becomes the dead end "0102".
````

#### Example2:
````
Input: deadends = ["8888"], target = "0009"
Output: 1
Explanation:
We can turn the last wheel in reverse to move from "0000" -> "0009".
````
#### Example3:
````
Input: deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"], target = "8888"
Output: -1
Explanation:
We can't reach the target without getting stuck.
````
#### Example4:
````
Input: deadends = ["0000"], target = "8888"
Output: -1
````

#### Constraints:

- 1 <= deadends.length <= 500
- deadends[i].length == 4
- target.length == 4
- target will not be in the list deadends.
- target and deadends[i] consist of digits only
---
### [Maximum Performance of a Team](./src/main/java/leetcode/jun2021/MaximumPerformanceTeam.java)
You are given two integers n and k and two integer arrays speed and efficiency both of length n. There are n engineers numbered from 1 to n. speed[i] and efficiency[i] represent the speed and efficiency of the ith engineer respectively.

Choose at most k different engineers out of the n engineers to form a team with the maximum performance.

The performance of a team is the sum of their engineers' speeds multiplied by the minimum efficiency among their engineers.

Return the maximum performance of this team. Since the answer can be a huge number, return it modulo 10^9 + 7.
#### Example1:
````
Input: n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 2
Output: 60
Explanation: 
We have the maximum performance of the team by selecting engineer 2 (with speed=10 and efficiency=4) and engineer 5 (with speed=5 and efficiency=7). That is, performance = (10 + 5) * min(4, 7) = 60.
````

#### Example2:
````
Input: n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 3
Output: 68
Explanation:
This is the same example as the first but k = 3. We can select engineer 1, engineer 2 and engineer 5 to get the maximum performance of the team. That is, performance = (2 + 10 + 5) * min(5, 4, 7) = 68.
````
#### Example3:
````
Input: n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 4
Output: 72
````
#### Constraints:

- 1 <= <= k <= n <= 10^5
- speed.length == n
- efficiency.length == n
- 1 <= speed[i] <= 10^5
- 1 <= efficiency[i] <= 10^8
---
### [Longest Consecutive Sequence](./src/main/java/leetcode/jun2021/LongestConsecutiveSequence.java)
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
#### Example1:
````
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
````

#### Example2:
````
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
````
#### Constraints:
- 0 <= nums.length <= 10^5
- -10^9 <= nums[i] <= 10^9
---
### [Min Cost Climbing Stairs](./src/main/java/leetcode/jun2021/MinCostClimbingStairs.java)
You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.
#### Example1:
````
Input: cost = [10,15,20]
Output: 15
Explanation: Cheapest is: start on cost[1], pay that cost, and go to the top.
````
#### Example2:
````
Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: Cheapest is: start on cost[0], and only step on 1s, skipping cost[3].
````
#### Constraints:
- 2 <= cost.length <= 1000
- 0 <= cost[i] <= 999
---
### [Construct Binary Tree from Preorder and Inorder Traversal](./src/main/java/leetcode/jun2021/ConstructBinaryTreePreorderInorderTraversal.java)
Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.
#### Example1:
````
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
````
#### Example2:
````
Input: preorder = [-1], inorder = [-1]
Output: [-1]
````
#### Constraints:
- 1 <= preorder.length <= 3000
- inorder.length == preorder.length
- -3000 <= preorder[i], inorder[i] <= 3000
- preorder and inorder consist of unique values.
- Each value of inorder also appears in preorder.
- preorder is guaranteed to be the preorder traversal of the tree.
- inorder is guaranteed to be the inorder traversal of the tree.
---
### [Jump Game VI](./src/main/java/leetcode/jun2021/JumpGameVI.java)
You are given a 0-indexed integer array nums and an integer k.

You are initially standing at index 0. In one move, you can jump at most k steps forward without going outside the boundaries of the array. That is, you can jump from index i to any index in the range [i + 1, min(n - 1, i + k)] inclusive.

You want to reach the last index of the array (index n - 1). Your score is the sum of all nums[j] for each index j you visited in the array.

Return the maximum score you can get.
#### Example1:
````
Input: nums = [1,-1,-2,4,-7,3], k = 2
Output: 7
Explanation: You can choose your jumps forming the subsequence [1,-1,4,3] (underlined above). The sum is 7.
````
#### Example2:
````
Input: nums = [10,-5,-2,4,0,3], k = 3
Output: 17
Explanation: You can choose your jumps forming the subsequence [10,4,3] (underlined above). The sum is 17.
````
#### Example3:
````
Input: nums = [1,-5,-20,4,-1,3,-6,-3], k = 2
Output: 0
````
#### Constraints:
- 1 <= nums.length, k <= 10^5
- -10^4 <= nums[i] <= 10^4
---
### [My Calendar I](./src/main/java/leetcode/jun2021/MyCalendarI.java)
Implement a MyCalendar class to store your events. A new event can be added if adding the event will not cause a double booking.

Your class will have the method, book(int start, int end). Formally, this represents a booking on the half open interval [start, end), the range of real numbers x such that start <= x < end.

A double booking happens when two events have some non-empty intersection (ie., there is some time that is common to both events.)

For each call to the method MyCalendar.book, return true if the event can be added to the calendar successfully without causing a double booking. Otherwise, return false and do not add the event to the calendar.

Your class will be called like this: MyCalendar cal = new MyCalendar(); MyCalendar.book(start, end)
#### Example1:
````
MyCalendar();
MyCalendar.book(10, 20); // returns true
MyCalendar.book(15, 25); // returns false
MyCalendar.book(20, 30); // returns true
Explanation: 
The first event can be booked.  The second can't because time 15 is already booked by another event.
The third event can be booked, as the first event takes every time less than 20, but not including 20.
````
#### Constraints:
- The number of calls to MyCalendar.book per test case will be at most 1000.
- In calls to MyCalendar.book(start, end), start and end are integers in the range [0, 10^9].
---
### [Stone Game VII](./src/main/java/leetcode/jun2021/StoneGameVII.java)
Alice and Bob take turns playing a game, with Alice starting first.

There are n stones arranged in a row. On each player's turn, they can remove either the leftmost stone or the rightmost stone from the row and receive points equal to the sum of the remaining stones' values in the row. The winner is the one with the higher score when there are no stones left to remove.

Bob found that he will always lose this game (poor Bob, he always loses), so he decided to minimize the score's difference. Alice's goal is to maximize the difference in the score.

Given an array of integers stones where stones[i] represents the value of the ith stone from the left, return the difference in Alice and Bob's score if they both play optimally.
#### Example1:
````
Input: stones = [5,3,1,4,2]
Output: 6
Explanation: 
- Alice removes 2 and gets 5 + 3 + 1 + 4 = 13 points. Alice = 13, Bob = 0, stones = [5,3,1,4].
- Bob removes 5 and gets 3 + 1 + 4 = 8 points. Alice = 13, Bob = 8, stones = [3,1,4].
- Alice removes 3 and gets 1 + 4 = 5 points. Alice = 18, Bob = 8, stones = [1,4].
- Bob removes 1 and gets 4 points. Alice = 18, Bob = 12, stones = [4].
- Alice removes 4 and gets 0 points. Alice = 18, Bob = 12, stones = [].
The score difference is 18 - 12 = 6.
````
#### Example2:
````
Input: stones = [7,90,5,1,100,10,10,2]
Output: 122
````
#### Constraints:
- n == stones.length
- 2 <= n <= 1000
- 1 <= stones[i] <= 1000
---
### [Minimum Number of Refueling Stops](./src/main/java/leetcode/jun2021/MinimumNumberRefuelingStops.java)
A car travels from a starting position to a destination which is target miles east of the starting position.

Along the way, there are gas stations.  Each station[i] represents a gas station that is station[i][0] miles east of the starting position, and has station[i][1] liters of gas.

The car starts with an infinite tank of gas, which initially has startFuel liters of fuel in it.  It uses 1 liter of gas per 1 mile that it drives.

When the car reaches a gas station, it may stop and refuel, transferring all the gas from the station into the car.

What is the least number of refueling stops the car must make in order to reach its destination?  If it cannot reach the destination, return -1.

Note that if the car reaches a gas station with 0 fuel left, the car can still refuel there.  If the car reaches the destination with 0 fuel left, it is still considered to have arrived.
#### Example1:
````
Input: target = 1, startFuel = 1, stations = []
Output: 0
Explanation: We can reach the target without refueling.
````
#### Example2:
````
Input: target = 100, startFuel = 1, stations = [[10,100]]
Output: -1
Explanation: We can't reach the target (or even the first gas station).
````
#### Example3:
````
Input: target = 100, startFuel = 10, stations = [[10,60],[20,30],[30,30],[60,40]]
Output: 2
Explanation: 
We start with 10 liters of fuel.
We drive to position 10, expending 10 liters of fuel.  We refuel from 0 liters to 60 liters of gas.
Then, we drive from position 10 to position 60 (expending 50 liters of fuel),
and refuel from 10 liters to 50 liters of gas.  We then drive to and reach the target.
We made 2 refueling stops along the way, so we return 2.
````
#### Note:
- 1 <= target, startFuel, stations[i][1] <= 10^9
- 0 <= stations.length <= 500
- 0 < stations[0][0] < stations[1][0] < ... < stations[stations.length-1][0] < target
---
### [Palindrome Pairs](./src/main/java/leetcode/jun2021/PalindromePairs.java)
Given a list of unique words, return all the pairs of the distinct indices (i, j) in the given list, so that the concatenation of the two words words[i] + words[j] is a palindrome.
#### Example1:
````
Input: words = ["abcd","dcba","lls","s","sssll"]
Output: [[0,1],[1,0],[3,2],[2,4]]
Explanation: The palindromes are ["dcbaabcd","abcddcba","slls","llssssll"]
````
#### Example2:
````
Input: words = ["bat","tab","cat"]
Output: [[0,1],[1,0]]
Explanation: The palindromes are ["battab","tabbat"]
````
#### Example3:
````
Input: words = ["a",""]
Output: [[0,1],[1,0]]
````
#### Note:
- 1 <= words.length <= 5000
- 0 <= words[i].length <= 300
- words[i] consists of lower-case English letters.
---
### [Maximum Units on a Truck](./src/main/java/leetcode/jun2021/MaximumUnitsTruck.java)
You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:

- numberOfBoxesi is the number of boxes of type i.
- numberOfUnitsPerBoxi is the number of units in each box of the type i.
You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.

Return the maximum total number of units that can be put on the truck.
#### Example1:
````
Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
Output: 8
Explanation: There are:
- 1 box of the first type that contains 3 units.
- 2 boxes of the second type that contain 2 units each.
- 3 boxes of the third type that contain 1 unit each.
You can take all the boxes of the first and second types, and one box of the third type.
The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.
````
#### Example2:
````
Input: boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
Output: 91
````
#### Constraints:
- 1 <= boxTypes.length <= 1000
- 1 <= numberOfBoxesi, numberOfUnitsPerBoxi <= 1000
- 1 <= truckSize <= 10^6
---
### [Matchsticks to Square](./src/main/java/leetcode/jun2021/MatchsticksSquare.java)
You are given an integer array matchsticks where matchsticks[i] is the length of the ith matchstick. You want to use all the matchsticks to make one square. You should not break any stick, but you can link them up, and each matchstick must be used exactly one time.

Return true if you can make this square and false otherwise.
#### Example1:
````
Input: matchsticks = [1,1,2,2,2]
Output: true
Explanation: You can form a square with length 2, one side of the square came two sticks with length 1.
````
#### Example2:
````
Input: matchsticks = [3,3,3,3,4]
Output: false
Explanation: You cannot find a way to form a square with all the matchsticks.
````
#### Constraints:
- 1 <= matchsticks.length <= 15
- 0 <= matchsticks[i] <= 10^9
---
### [Generate Parentheses](./src/main/java/leetcode/jun2021/GenerateParentheses.java)
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
#### Example1:
````
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
````
#### Example2:
````
Input: n = 1
Output: ["()"]
````
#### Constraints:
- 1 <= n <= 8
---
### [Number of Subarrays with Bounded Maximum](./src/main/java/leetcode/jun2021/NumberSubarrayBoundedMaximum.java)
We are given an array nums of positive integers, and two positive integers left and right (left <= right).

Return the number of (contiguous, non-empty) subarrays such that the value of the maximum array element in that subarray is at least left and at most right.
#### Example:
````
Input: 
nums = [2, 1, 4, 3]
left = 2
right = 3
Output: 3
Explanation: There are three subarrays that meet the requirements: [2], [2, 1], [3].
````
#### Constraints:
- left, right, and nums[i] will be an integer in the range [0, 10^9].
- The length of nums will be in the range of [1, 50000].
---
### [Range Sum Query - Mutable](./src/main/java/leetcode/jun2021/RangeSumQueryMutable.java)
Given an integer array nums, handle multiple queries of the following types:

1. Update the value of an element in nums.
2. Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:

- NumArray(int[] nums) Initializes the object with the integer array nums.
- void update(int index, int val) Updates the value of nums[index] to be val.
- int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
#### Example:
````
Input
["NumArray", "sumRange", "update", "sumRange"]
[[[1, 3, 5]], [0, 2], [1, 2], [0, 2]]
Output
[null, 9, null, 8]

Explanation
NumArray numArray = new NumArray([1, 3, 5]);
numArray.sumRange(0, 2); // return 1 + 3 + 5 = 9
numArray.update(1, 2);   // nums = [1, 2, 5]
numArray.sumRange(0, 2); // return 1 + 2 + 5 = 8
````
#### Constraints:
- 1 <= nums.length <= 3 * 10^4
- -100 <= nums[i] <= 100
- 0 <= index < nums.length
- -100 <= val <= 100
- 0 <= left <= right < nums.length
- At most 3 * 10^4 calls will be made to update and sumRange
---
### [K Inverse Pairs Array](./src/main/java/leetcode/jun2021/KInversePairsArray.java)
GFor an integer array nums, an inverse pair is a pair of integers [i, j] where 0 <= i < j < nums.length and nums[i] > nums[j].

Given two integers n and k, return the number of different arrays consist of numbers from 1 to n such that there are exactly k inverse pairs. Since the answer can be huge, return it modulo 10^9 + 7.
#### Example 1:
````
Input: n = 3, k = 0
Output: 1
Explanation: Only the array [1,2,3] which consists of numbers from 1 to 3 has exactly 0 inverse pairs.
````
#### Example 2:
````
Input: n = 3, k = 1
Output: 2
Explanation: The array [1,3,2] and [2,1,3] have exactly 1 inverse pair.
````
#### Constraints:
- 1 <= n <= 1000
- 0 <= k <= 1000
---
### [Swim in Rising Water](./src/main/java/leetcode/jun2021/SwimRisingWater.java)
On an N x N grid, each square grid[i][j] represents the elevation at that point (i,j).

Now rain starts to fall. At time t, the depth of the water everywhere is t. You can swim from a square to another 4-directionally adjacent square if and only if the elevation of both squares individually are at most t. You can swim infinite distance in zero time. Of course, you must stay within the boundaries of the grid during your swim.

You start at the top left square (0, 0). What is the least time until you can reach the bottom right square (N-1, N-1)?
#### Example 1:
````
Input: [[0,2],[1,3]]
Output: 3
Explanation:
At time 0, you are in grid location (0, 0).
You cannot go anywhere else because 4-directionally adjacent neighbors have a higher elevation than t = 0.

You cannot reach point (1, 1) until time 3.
When the depth of water is 3, we can swim anywhere inside the grid.
````
#### Example 2:
````
Input: [[0,1,2,3,4],[24,23,22,21,5],[12,13,14,15,16],[11,17,18,19,20],[10,9,8,7,6]]
Output: 16
Explanation:
 0  1  2  3  4
24 23 22 21  5
12 13 14 15 16
11 17 18 19 20
10  9  8  7  6

The final route is marked in bold.
We need to wait until time 16 so that (0, 0) and (4, 4) are connected.
````
#### Note:
- 2 <= N <= 50.
- grid[i][j] is a permutation of [0, ..., N*N - 1].
---
### [Pascal's Triangle](./src/main/java/leetcode/jun2021/PascalTriangle.java)
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it
#### Example 1:
````
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
````
#### Example 2:
````
Input: numRows = 1
Output: [[1]]
````
#### Constraints:
- 1 <= numRows <= 30
---
### [Number of Matching Subsequences](./src/main/java/leetcode/jun2021/NumberMatchingSubsequences.java)
Given a string s and an array of strings words, return the number of words[i] that is a subsequence of s.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

- For example, "ace" is a subsequence of "abcde".
#### Example 1:
````
Input: s = "abcde", words = ["a","bb","acd","ace"]
Output: 3
Explanation: There are three strings in words that are a subsequence of s: "a", "acd", "ace".
````
#### Example 2:
````
Input: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
Output: 2
````
#### Constraints:
- 1 <= s.length <= 5 * 104
- 1 <= words.length <= 5000
- 1 <= words[i].length <= 50
- s and words[i] consist of only lowercase English letters.
---
### [Reverse Linked List II](./src/main/java/leetcode/jun2021/ReverseLinkedListII.java)
Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
#### Example 1:
````
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
````
#### Example 2:
````
Input: head = [5], left = 1, right = 1
Output: [5]
````
#### Constraints:
- The number of nodes in the list is n.
- 1 <= n <= 500
- -500 <= Node.val <= 500
- 1 <= left <= right <= n
##### Follow up: Could you do it in one pass?

---
### [Out of Boundary Paths](./src/main/java/leetcode/jun2021/OutOfBoundaryPaths.java)
There is an m x n grid with a ball. The ball is initially at the position [startRow, startColumn]. You are allowed to move the ball to one of the four adjacent four cells in the grid (possibly out of the grid crossing the grid boundary). You can apply at most maxMove moves to the ball.

Given the five integers m, n, maxMove, startRow, startColumn, return the number of paths to move the ball out of the grid boundary. Since the answer can be very large, return it modulo 10^9 + 7.
#### Example 1:
````
Input: m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0
Output: 6
````
#### Example 2:
````
Input: m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1
Output: 12
````
#### Constraints:
- 1 <= m, n <= 50
- 0 <= maxMove <= 50
- 0 <= startRow <= m
- 0 <= startColumn <= n
---
### [Redundant Connection](./src/main/java/leetcode/jun2021/RedundantConnection.java)
In this problem, a tree is an undirected graph that is connected and has no cycles.

You are given a graph that started as a tree with n nodes labeled from 1 to n, with one additional edge added. The added edge has two different vertices chosen from 1 to n, and was not an edge that already existed. The graph is represented as an array edges of length n where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the graph.

Return an edge that can be removed so that the resulting graph is a tree of n nodes. If there are multiple answers, return the answer that occurs last in the input.
#### Example 1:
````
Input: edges = [[1,2],[1,3],[2,3]]
Output: [2,3]
````
#### Example 2:
````
Input: edges = [[1,2],[2,3],[3,4],[1,4],[1,5]]
Output: [1,4]
````
#### Constraints:
- n == edges.length
- 3 <= n <= 1000
- edges[i].length == 2
- 1 <= ai < bi <= edges.length
- ai != bi
- There are no repeated edges.
- The given graph is connected.
---
### [Count of Smaller Numbers After Self](./src/main/java/leetcode/jun2021/CountSmallerNumbersAfterSelf.java)
You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].
#### Example 1:
````
Input: nums = [5,2,6,1]
Output: [2,1,1,0]
Explanation:
To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.
````
#### Example 2:
````
Input: nums = [-1]
Output: [0]
````
#### Example 3:
````
Input: nums = [-1,-1]
Output: [0,0]
````
#### Constraints:
- 1 <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4
---
### [Candy](./src/main/java/leetcode/jun2021/Candy.java)
There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:
- Each child must have at least one candy.
- Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.
#### Example 1:
````
Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
````
#### Example 2:
````
Input: ratings = [1,2,2]
Output: 4
Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
The third child gets 1 candy because it satisfies the above two conditions.
````
#### Example 3:
````
Input: nums = [-1,-1]
Output: [0,0]
````
#### Constraints:
- n == ratings.length
- 1 <= n <= 2 * 10^4
- 0 <= ratings[i] <= 2 * 10^4
---
### [Remove All Adjacent Duplicates In String](./src/main/java/leetcode/jun2021/RemoveAllAdjacentDuplicatesInString.java)
You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
#### Example 1:
````
Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
````
#### Example 2:
````
Input: s = "azxxzy"
Output: "ay"
````
#### Example 3:
````
Input: nums = [-1,-1]
Output: [0,0]
````
#### Constraints:
- 1 <= s.length <= 10^5
- s consists of lowercase English letters.
---
### [Lowest Common Ancestor of a Binary Tree](./src/main/java/leetcode/jun2021/LowestCommonAncestorBinaryTree.java)
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
#### Example 1:
````
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation: The LCA of nodes 5 and 1 is 3.
````
#### Example 2:
````
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
````
#### Example 3:
````
Input: root = [1,2], p = 1, q = 2
Output: 1
````
#### Constraints:
- The number of nodes in the tree is in the range [2, 10^5].
- -10^9 <= Node.val <= 10^9
- All Node.val are unique.
- p != q
- p and q will exist in the tree.
---
### [Gray Code](./src/main/java/leetcode/jul2021/Gray Code.java)
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