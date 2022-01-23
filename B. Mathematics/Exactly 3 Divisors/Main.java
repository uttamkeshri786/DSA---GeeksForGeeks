// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		


		//taking testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    N=sc.nextInt();//taking N
		    //calling function exactly3Divisors()
		    System.out.println(obj.exactly3Divisors(N));
		   
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    public static boolean isPrime(int num)
    {
        if(num==1) return false;
        if(num==2 || num==3) return true;
        if(num%2==0 || num%3==0) return false;
        for(int i=5; i*i<=num; i+=6)
        {
            if(num%i==0 || num%(i+2)==0)
                return false;
        }
        return true;
    }

    public static int exactly3Divisors(int N)
    {
        int count = 0;
        for(int i=2; i*i<=N; i++)
        {
            if(isPrime(i))
                count++;
        }
        return count;
    }
}
