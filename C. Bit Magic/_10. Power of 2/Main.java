//METHOD-1
// Time Complexity: O(1), Auxiliary Space: O(1)
    static boolean isPowerOfTwo(int n)
    {
        if(n==0)
        return false;

        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == 
               (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }

//METHOD-2
// Time Complexity: O(1), Auxiliary Space: O(1)
/*If we subtract a power of 2 numbers by 1 then all unset bits after the only set bit become set; and the set bit becomes unset.
For example for 4 ( 100) and 16(10000), we get the following after subtracting 1 
3 --> 011 
15 --> 01111

So, if a number n is a power of 2 then bitwise & of n and n-1 will be zero. We can say n is a power of 2 or not based on the value of n&(n-1). 
The expression n&(n-1) will not work when n is 0. To handle this case also, our expression will become n& (!n&(n-1))*/

    /* Method to check if x is power of 2*/
    static boolean isPowerOfTwo (int x)
    {
      /* First x in the below expression is for the case when x is 0 */
        return x!=0 && ((x&(x-1)) == 0);  
    }


//METHOD-3
// Time Complexity: O(1), Auxiliary Space: O(1)
//Another way is to use the logic to find the rightmost bit set of a given number.
    static boolean isPowerofTwo(int n)
    {
        if (n == 0)
            return false;
        if ((n & (~(n - 1))) == n)
            return true;
        return false;
    }

//METHOD-4
/* All power of two numbers has only a one-bit set. 
   So, count the no. of set bits and if you get 1 then the number is a power of 2. 
   Please see Count set bits in an integer for counting set bits.
   https://www.geeksforgeeks.org/count-set-bits-in-an-integer/
*/

////METHOD-5
// Time Complexity: O(log2n), Auxiliary Space: O(1)
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n)
    { 
        if (n == 0) 
            return false; 
        while (n != 1) 
        { 
            if (n%2 != 0) 
                return false; 
            n = n/2; 
        } 
        return true; 
    }
    
    public static void main(String args[])
    {
        if (isPowerOfTwo(31))
            System.out.println("Yes");
        else
            System.out.println("No");

        if (isPowerOfTwo(64))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

//METHOD-6
// Time Complexity: O(log2n), Auxiliary Space: O(log2n)
import java.util.*;
public class Main{

  // Function which checks whether a number is a power of 2
  static boolean powerOf2(int n)
  {
    // base cases
    // '1' is the only odd number which is a power of 2(2^0) 
    if (n == 1) 
      return true; 

    // all other odd numbers are not powers of 2
    else if (n % 2 != 0 || 
             n ==0) 
      return false; 

    // recursive function call
    return powerOf2(n / 2); 
  }

  public static void main(String[] args)
  {
    //True
    int n = 64;

    //False
    int m = 12;

    if (powerOf2(n) == true) 
      System.out.print("True" + "\n");
    else System.out.print("False" + "\n");

    if (powerOf2(m) == true) 
      System.out.print("True" + "\n");
    else 
      System.out.print("False" + "\n");
  }
}
