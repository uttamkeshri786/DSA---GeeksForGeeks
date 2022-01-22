import java.io.*;
import java.util.*;
class CheckBit
{
    // Function to check if Kth bit is set or not.
    public static boolean checkKthBit(int n, int k)
    {
        return((n & (1 << (k - 1))) > 0);
    }  
}

public class Main
{
	static int n;
	static int k;
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine()); //Inputting the testcases
		
		while(t>0) //While testcases exist
		{
			n = Integer.parseInt(br.readLine()); //Input N
			k = Integer.parseInt(br.readLine()); // Input K
			
			CheckBit obj = new CheckBit();
			
			if(obj.checkKthBit(n, k))
				System.out.println("Yes"); //If true, print Yes
				
			else
				System.out.println("No");	// Else print No
            
            t--;
		}
	}	
}

/*
// Java program to check if k-th bit of a given number is set or not

import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;

public class Main {
    public static void isKthBitSet(int n, int k)
    {
        if ((n & (1 << (k - 1))) > 0)
            System.out.print("SET");
        else
            System.out.print("NOT SET");
    }

    public static void main(String[] args)
    {
        int n = 5, k = 1;
        isKthBitSet(n, k);
    }
}
*/
