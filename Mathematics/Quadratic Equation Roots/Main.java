// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        
       ArrayList<Integer> numbers = new ArrayList<Integer>();
       int d = (int) (Math.pow(b,2)-(4*a*c));
       int r1 = (int) Math.floor(((-1*b)+Math.sqrt(d))/(2*a));
       int r2 = (int) Math.floor(((-1*b)-Math.sqrt(d))/(2*a));
       if(d<0){
           numbers.add(-1);
       }
       else
       {
           numbers.add(Math.max(r1,r2));
           numbers.add(Math.min(r1,r2));
       }
       return numbers;
    }
}
