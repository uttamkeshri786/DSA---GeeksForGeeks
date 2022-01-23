// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of testcases
        while (T > 0) {
            int I = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.absolute(I));

            T--;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int absolute(int I) {
       int absolute=Math.abs(I);
       return absolute;
       
       /*
       //used a simple logic 

       if(I<0){
           I=-I;
       }
       else if(I==0){
          I=0;
       }
       else{
           I=I;
       }
       return I;
       */
    }
}
