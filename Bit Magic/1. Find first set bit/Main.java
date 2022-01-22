//Method-1 : Naive Solution
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}

class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
        if(n == 0)
              return 1;
        else{
            int pos=1;
            while((1&n)!=1){
                 n=n>>1;
                 pos++;
            }
        return pos;
        }
    }
}


//Method-2 : Efficient Code
// Java Code for Position of rightmost set bit
public class Main {

    public static int getFirstSetBitPos(int n)
    {
        return (int)((Math.log10(n & -n)) / Math.log10(2)) + 1;
    }

    // Drive code
    public static void main(String[] args)
    {
        int n = 12;
        System.out.println(getFirstSetBitPos(n));
    }
}
