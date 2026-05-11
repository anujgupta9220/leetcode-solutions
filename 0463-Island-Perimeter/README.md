# 463. Island Perimeter

🔗 Problem Link: https://leetcode.com/problems/island-perimeter/

## 🧠 Approach
Traverse the grid and calculate the perimeter of each land cell.  
Each land cell contributes 4 sides, and shared sides with neighboring land cells reduce the perimeter count.

## ⏱ Complexity
- Time Complexity: O(m × n)
- Space Complexity: O(1)

## 📥 Example
Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]  
Output: 16
