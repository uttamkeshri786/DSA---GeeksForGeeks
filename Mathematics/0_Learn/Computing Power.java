//Efficient Method : Time Complexity : θ(logn), Auxiliary Space: θ(logn)

import java.io.*;
import java.util.*;

public class Main {
	
	static int power(int x, int n)
	{
		if(n == 0)
			return 1;

		int temp = power(x, n/2);

		temp = temp * temp;

		if(n % 2 == 0)
			return temp;
		else
			return temp * x; 
	}

	public static void main (String[] args) {
		
		int x = 3, n = 5;

		System.out.println(power(x, n));

	}
}

// Naive Method : Time Complexity : θ(n)

import java.io.*;
import java.util.*;

public class Main {
	
	static int power(int x, int n)
	{
    
		int res = 1;
    
    for(int i=0; i<n; i++)
    {
      res = res * x;
    }

			return res; 
	}

	public static void main (String[] args) {
		
		int x = 3, n = 5;

		System.out.println(power(x, n));

	}
}
