//Efficient Solution : Time Complexity : O(log(min(a,b)))

import java.io.*;
import java.util.*;

public class Main {
	
	static int gcd(int a, int b)
	{
		if(b==0)
			return a;

		return gcd(b, a % b);
	}

	static int lcm(int a, int b)
	{
		return (a * b) / gcd(a, b); // constant no. of operations
	}
	
	public static void main (String[] args) {
		
		int a = 4, b = 6;

		System.out.println(lcm(a, b));

	}
}

// Naive Method : Time Complexity : O(a*b-max(a,b))

import java.io.*;
import java.util.*;

public class Main {

	static int lcm(int a, int b)
	{
		int res = Math.max(a,b);
		
		while(res > 0)
		{
		    if(res%a == 0 && res%b == 0)
		    {
		        return res;
		    }
		    res++;
		}
		return res;
	}

	public static void main (String[] args) {
		
		int a = 12, b = 15;

		System.out.println(lcm(a, b));

	}
}
