# 661. Image Smoother

🔗 Problem Link: https://leetcode.com/problems/image-smoother/

## 🧠 Approach
Traverse each cell of the matrix and calculate the average of the current cell and all valid neighboring cells.  
Store the smoothed value in a new matrix.

## ⏱ Complexity
- Time Complexity: O(m × n)
- Space Complexity: O(m × n)

## 📥 Example
Input: img = [[1,1,1],[1,0,1],[1,1,1]]  
Output: [[0,0,0],[0,0,0],[0,0,0]]
