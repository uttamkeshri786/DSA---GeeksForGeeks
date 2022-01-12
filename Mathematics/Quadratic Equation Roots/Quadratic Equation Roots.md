# 3. Quadratic Equation Roots
Given a quadratic equation in the form <strong>ax<sup>2</sup> + bx + c</strong>. Find its roots.

<strong>Note:</strong> Return the maximum root followed by the minimum root.

### Example 1:
```
Input:
a = 1
b = -2
c = 1
Output: 1 1
Explanation:
Roots of equation x<sup>2</sup>-2x+1 are 1 and 1.
```

### Example 2:
```
Input:
a = 1
b = -7
c = 12
Output: 4 3
Explanation: Roots of equation 
x<sup>2</sup> - 7x + 12 are 4 and 3.
```
### Your Task:
You don't need to read input or print anything. Your task is to complete the function <strong>quadraticRoots()</strong> which takes a, b, c as input parameters and returns a list of two integers containing the floor value of its roots in decreasing order. If roots are imaginary, the returning list should contain only 1 integer ie -1. Always return the greatest integer smaller than or equal to the result.
<strong>Note:</strong> If roots are imaginary, the generated output will display "Imaginary".


### Expected Time Complexity: O(1)
### Expected Auxiliary Space : O(1)

### Constraints:
-10<sup>3</sup> <= a,b,c <= 10<sup>3</sup>
