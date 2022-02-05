# 9. Addition Under Modulo 

Given two numbers a and b, find the sum of a and b. Since the sum can be very large, find the sum modulo <strong>10<sup>9</sup>+7</strong>.

### Example 1:
```
Input:
a = 9223372036854775807
b = 9223372036854775807
Output: 582344006
Explanation: 
9223372036854775807 + 9223372036854775807 
= 18446744073709551614.
18446744073709551614 mod (10^9+7)
= 582344006
```

### Example 2:
```
Input:
a = 1000000007
b = 1000000007
Output: 0
Explanation: 1000000007 + 1000000007 =
(2000000014) mod (10^9+7) = 0
```
### Your Task:
You don't need to read input or print anything. Your task is to complete the function <strong>sumUnderModulo()</strong> that takes <strong>a and b as input parameters</strong> and <strong>returns sum</strong> of a and b under modulo <strong>10<sup>9</sup>+7</strong>.


### Expected Time Complexity: O(1)
### Expected Auxiliary Space : O(1)

### Constraints:
1 <= a,b <= 2<sup>63</sup>-1
