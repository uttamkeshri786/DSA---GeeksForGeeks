Quiz - Bit Magic
==============================

### 1. What is the return value of following function for arr[] = {9, 12, 2, 11, 2, 2, 10, 9, 12, 10, 9, 11, 2} and n is size of this array.

```
    int fun(int arr[], int n)

    {

        int x = arr[0];

        for (int i = 1; i < n; i++)

            x = x ^ arr[i];

        return x;

    }
```
        A. 0
        B. 9
        C. 12
        D. 2

Ans: B
#### Explanation
Note that 9 is the only element with odd occurrences, all other elements have even occurrences.

If the input array has all elements with even occurrences except one, then the function returns the only element with odd occurrences. Note that XORing an element with itself results 0 and XOR of 0 with a number x is equal to x.

Try following complete program.
``` 
    # include <iostream>
    using namespace std;
    
    int fun(int arr[], int n)
    {
        int x = arr[0];
        for (int i = 1; i < n; i++)
            x = x ^ arr[i];
        return x;
    }

    int main()
    {
      int arr[] = {9, 12, 2, 11, 10, 9, 12, 10, 9, 11, 2};
      int n = sizeof(arr)/sizeof(arr[0]);
      cout << fun(arr, n) << endl;
      return 0;
    }
``` 


### 2. What does the following C expression do?

x = (x<<1) + x + (x>>1);

        A. Multiplies an integer with 7
        B. Multiplies an integer with 3.5
        C. Multiplies an integer with 3
        D. 8

Ans: B
#### Explanation
The expression multiplies an integer with 3.5. 
For example, if x is 4, the expression returns 15. If x is 6, it returns 21. If x is 5, it return 17. 
See, Multiply a given Integer with 3.5 for more details.
  http://www.geeksforgeeks.org/multiply-an-integer-with-3-5/


### 3. What does the following C expression do?

x = x & (x-1) 

        A. Sets all bits as 1
        B. Makes x equals to 0
        C. Turns of the rightmost set bit
        D. Turns of the leftmost set bit

Ans: C
#### Explanation
The expression simply turns off the rightmost set bit. For example, if x = 14 (1110), x - 1 = 13 (1101) it returns resultant as (1100) i.e, 12 .


### 4. Given two arrays of numbers a1, a2, a3,...an and b1, b2, .. bn where each number is 0 or 1, the fastest algorithm to find the largest span(i, j) such that ai + ai+1, ....aj = bi + bi+1, .. bj. or report that there is not such span,

        A. Takes O(n<sup>3</sup>) and Ω(2<sup>n</sup>) time if hashing is permitted
        B. Takes O(n<sup>3</sup>) and Ω(n<sup>2.5</sup>) time in the key comparison model
        C. Takes θ(n) time and space
        D. Takes O(sqrt(n)) time only if the sum of the 2n elements is an even number

Ans: C
#### Explanation
The problem can be solved in  Takes θ(n) time and space.

The idea is based on below observations.
  1. Since there are total n elements, maximum sum is n for both arrays.
  2. Difference between two sums varies from -n to n. So there are total 2n + 1 possible values of difference.
  3. If differences between prefix sums of two arrays become same at two points, then subarrays between these two points have same sum.
Below is Complete Algorithm.
  1. Create an auxiliary array of size 2n+1 to store starting points of all possible values of differences (Note that possible values of differences vary from -n to n, i.e., there are total 2n+1 possible values)
  2. Initialize starting points of all differences as -1.
  3. Initialize maxLen as 0 and prefix sums of both arrays as 0, preSum1 = 0, preSum2 = 0
  4. Traverse both arrays from i = 0 to n-1.
- Update prefix sums: preSum1 += arr1[i], preSum2 += arr2[i]
- Compute difference of current prefix sums: curr_diff = preSum1 – preSum2
- Find index in diff array: diffIndex = n + curr_diff // curr_diff can be negative and can go till -n
- If curr_diff is 0, then i+1 is maxLen so far
- Else If curr_diff is seen first time, i.e., starting point of current diff is -1, then update starting point as i
- Else (curr_diff is NOT seen first time), then consider i as ending point and find length of current same sum span. If this length is more, then update maxLen
  5. Return maxLen
See, Longest Span with same Sum in two Binary arrays for complete running code
http://www.geeksforgeeks.org/longest-span-sum-two-binary-arrays/


### 5. Consider the following code snippet for checking whether a number is power of 2 or not.

``` 
    /* Incorrect function to check if x is power of 2*/

    bool isPowerOfTwo (unsigned int x) 

    { 

      return (!(x&(x-1))); 

    }
``` 

        What is wrong with above function?

        A. It does reverse of what is required
        B. It works perfectly fine for all values of x.
        C. It does not work for x = 0
        D. It does not work for x = 1

Ans: C
#### Explanation
Please see https://www.geeksforgeeks.org/program-to-find-whether-a-no-is-power-of-two/
