# 8. Exactly 3 Divisors

Given a positive integer value <strong>N</strong>. The task is to find how many numbers <strong>less than or equal to N</strong> have numbers of divisors exactly equal to <strong>3</strong>.

### Example 1:
```
Input:
N = 6
Output: 1
Explanation: The only number less than 6 with 
3 divisors is 4.
```

### Example 2:
```
Input:
N = 10
Output: 2
Explanation: 4 and 9 have 3 divisors.
```
### Your Task:
You don't need to read input or print anything. Your task is to complete the function <strong>exactly3Divisors()</strong> that takes <strong>N</strong> as input parameter and returns count of numbers <strong>less than or equal to N</strong> with exactly <strong>3 divisors</strong>.


### Expected Time Complexity: O(N<sup>1/2</sup>*N<sup>1/4</sup>)
### Expected Auxiliary Space : O(1)

### Constraints:
1 <= N <= 10<sup>9</sup>
