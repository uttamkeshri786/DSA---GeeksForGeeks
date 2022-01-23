/*
    Useful links to help you understand the concepts of this problem:
    https://www.geeksforgeeks.org/gray-to-binary-and-binary-to-gray-conversion/
*/

import java.io.*;
import java.util.*;

class Solution{
    //  Function to find the gray code of given number n
    public static int greyConverter(int n) {
        
        //Performing Right Shift on n, 1 time.
        int q=n>>1;
        
        //returning the result of XOR opertaion of n and q 
        //which gives gray code.
        return n^q;
    }
}

public class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//initializing n
		    
		    Solution obj = new Solution();
		    
		    //calling greyConverter() method
		    System.out.println(obj.greyConverter(n));
		}
	}
}
