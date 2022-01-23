import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

public class Main{

    //Function to find the first position with different bits.
    static int getRightMostSetBit(int n) 
    {
        if(n == 0)
          return 0;
      
        return (int)((Math.log10(n & -n)) / 
                     Math.log10(2)) + 1;
    }
    
    // Function to find the position of
    // rightmost different bit in the
    // binary representations of 'm' and 'n'
    static int posOfRightMostDiffBit(int m, int n) 
    {
        // position of rightmost different bit
        return getRightMostSetBit(m ^ n);
    }
  
    public static void main(String arg[])
    {
        int m = 52, n = 4;
        System.out.print("Position = " + posOfRightMostDiffBit(m, n));
    }
}
