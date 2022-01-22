# 1. Find first set bit 

Given an integer an <strong>N</strong>. The task is to return the position of <strong>first set bit found from the right side</strong> in the binary representation of the number.
<strong>Note:</strong> If there is no set bit in the integer N, then return 0 from the function. 

### Example 1:
```
Input: N = 18
Output: 2
Explanation: Binary representation of 
18 is 010010,the first set bit from the 
right side is at position 2.
```

### Example 2:
```
Input: N = 12 
Output: 3 
Explanation: Binary representation 
of  12 is 1100, the first set bit 
from the right side is at position 3.
```
### Your Task:
The task is to complete the function <strong>getFirstSetBit()</strong> that takes an integer <strong>n</strong> as a <strong>parameter</strong> and <strong>returns</strong> the <strong>position of first set bit</strong>.
 

### Expected Time Complexity: O(logN)
### Expected Auxiliary Space : O(1)

### Constraints:
0 <= N <= 10<sup>8</sup>
