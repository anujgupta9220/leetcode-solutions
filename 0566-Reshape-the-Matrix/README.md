# 566. Reshape the Matrix

🔗 Problem Link: https://leetcode.com/problems/reshape-the-matrix/

## 🧠 Approach
Check whether reshaping is possible by comparing the total number of elements.  
If possible, traverse the original matrix and fill the new matrix row by row.  
Otherwise, return the original matrix.

## ⏱ Complexity
- Time Complexity: O(m × n)
- Space Complexity: O(r × c)

## 📥 Example
Input: mat = [[1,2],[3,4]], r = 1, c = 4  
Output: [[1,2,3,4]]
