### [Permutations](Permutations.java)
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

#### Example1:
````
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
````
#### Example2:
````
Input: nums = [0,1]
Output: [[0,1],[1,0]]
````
#### Example3:
````
Input: nums = [1]
Output: [[1]]
````

#### Constraints:

- 1 <= nums.length <= 6
- -10 <= nums[i] <= 10
- All the integers of nums are unique.

---
### [39. Combination Sum](CombinationSum.java)
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

#### Example1:
````
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
````
#### Example2:
````
Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
````
#### Example3:
````
Input: candidates = [2], target = 1
Output: []
````

#### Constraints:

- 1 <= candidates.length <= 30
- 1 <= candidates[i] <= 200
- All elements of candidates are distinct.
- 1 <= target <= 500