// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    
		    //taking N
		    N=sc.nextInt();
		    
		   //calling method digitsInFactorial()
		   System.out.println(obj.digitsInFactorial(N));
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    public int digitsInFactorial(int N){
        
        if (N < 0)
            return 0;
  
        // base case
        if (N <= 1)
            return 1;
  
        // else iterate through n and calculate the value
        double digits = 0;
        for (int i=2; i<=N; i++)
            digits += Math.log10(i);
  
        return (int)(Math.floor(digits)) + 1;
    }
}
