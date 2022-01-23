# 11. Modular Multiplicative Inverse

Given two integers <strong>‘a’</strong> and <strong>‘m’</strong>. The task is to find the smallest modular multiplicative inverse of <strong>‘a’</strong> under modulo <strong>‘m’</strong>.

Given two numbers a and b, find the sum of a and b. Since the sum can be very large, find the sum modulo <strong>10</strong>.

### Example 1:
```
Input:
a = 3
m = 11
Output: 4
Explanation: Since (4*3) mod 11 = 1, 4 
is modulo inverse of 3. One might think,
15 also as a valid output as "(15*3)
mod 11"  is also 1, but 15 is not in 
ring {0, 1, 2, ... 10}, so not valid.
```

### Example 2:
```
Input:
a = 10
m = 17
Output: 12
Explanation: Since (12*10) mod 17 = 1,
12 is the modulo inverse of 10.
```
### Your Task:
You don't need to read input or print anything. Your task is to complete the function <strong>function modInverse()</strong> that takes <strong>a and m as input parameters</strong> and <strong>returns</strong> modular multiplicative inverse of <strong>‘a’</strong> under modulo <strong>‘m’</strong>. If the modular multiplicative inverse doesn't exist <strong>return -1</strong>.

### Expected Time Complexity: O(m)
### Expected Auxiliary Space : O(1)

### Constraints:
1 <= a <= 10<sup>4</sup>
1 <= m <= 10<sup>4</sup>
