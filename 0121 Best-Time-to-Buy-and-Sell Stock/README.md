# 121. Best Time to Buy and Sell Stock

🔗 Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

## 🧠 Approach
Traverse the array while keeping track of the minimum buying price.  
Calculate the profit for each day and update the maximum profit whenever a larger profit is found.

## ⏱ Complexity
- Time Complexity: O(n)
- Space Complexity: O(1)

## 📥 Example
Input: prices = [7,1,5,3,6,4]  
Output: 5
