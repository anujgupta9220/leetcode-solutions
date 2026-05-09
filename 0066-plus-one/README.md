# 66. Plus One

🔗 Problem Link: https://leetcode.com/problems/plus-one/

## 🧠 Approach
Traverse the array from the last digit.  
- If the digit is less than 9, increment it and return the array.  
- Otherwise, set the digit to 0 and continue.  
- If all digits are 9, create a new array with an extra digit and place 1 at the beginning.

## ⏱ Complexity
- Time Complexity: O(n)
- Space Complexity: O(1)

## 📥 Example
Input: digits = [1,2,3]  
Output: [1,2,4]
