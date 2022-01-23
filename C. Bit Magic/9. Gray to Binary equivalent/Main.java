/*
    Useful links to help you understand the concepts of this problem:
    https://www.geeksforgeeks.org/decimal-equivalent-gray-code-inverse/
*/

import java.io.*;
import java.util.*;

class Solution{
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        int b=0;
        
        //We use a loop and Right shift n everytime until it becomes 0.
        for(n=n;n>0;n=n>>1)
         //We use XOR operation which stores the result of conversion in b.
            b^=n;
            
        //returning the Binary equivalent.
        return b;
    }    
}

public class Main {
  
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//initializing n
		    
		    Solution obj = new Solution();
		    
		    //calling grayToBinary() function
		    System.out.println(obj.grayToBinary(n));
		}
	}
}
