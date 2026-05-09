# 35. Search Insert Position

🔗 Problem Link: https://leetcode.com/problems/search-insert-position/

## 🧠 Approach
Traverse the array and compare each element with the target.  
- If the target is found, return its index.  
- If the current element becomes greater than the target, return that index as the insert position.  
- If the target is greater than all elements, return the array length.

## ⏱ Complexity
- Time Complexity: O(n)
- Space Complexity: O(1)

## 📥 Example
Input: nums = [1,3,5,6], target = 5  
Output: 2
