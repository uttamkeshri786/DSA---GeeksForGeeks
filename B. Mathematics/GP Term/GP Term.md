# 6. GP Term 

Given the first 2 terms <strong>A and B</strong> of a Geometric Series. The task is to find the <strong>Nth term</strong> of the series.

### Example 1:
```
Input:
A = 2 
B = 3
N = 1
Output: 2
Explanation: The first term is already
given in the input as 2
```

### Example 2:
```
Input:
A = 1
B = 2
N = 2
Output: 2
Explanation: Common ratio = 2,
Hence second term is 2.
```
### Your Task:
You don't need to read input or print anything. Your task is to complete the function <strong>termOfGP()</strong> that takes <strong>A, B and N</strong> as parameter and returns <strong>Nth</strong> term of <strong>GP</strong>. The <strong>return value</strong> should be <strong>double</strong> that would be <strong>automatically</strong> converted to <strong>floor</strong> by the <strong>driver code</strong>.


### Expected Time Complexity: O(logN)
### Expected Auxiliary Space : O(1)

### Constraints:
-100 <= A <= 100
-100 <= B <= 100
1 <= N <= 5
