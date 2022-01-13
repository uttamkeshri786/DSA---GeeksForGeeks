//Optimised Euclidean Algorithm Code : Time Complexity : O(log(min(a,b)))

import java.io.*;
import java.util.*;

public class Main {

	static int gcd(int a, int b)
	{
		if(b==0)
			return a;

		return gcd(b, a % b);
	}

	public static void main (String[] args) {
		
		int a = 12, b = 15;

		System.out.println(gcd(a, b));

	}
}

//Euclidean Algorithm Code

import java.io.*;
import java.util.*;

public class Main {
	
	static int gcd(int a, int b)
	{
		while(a!=b)
		{
			if(a > b)
				a = a - b;
			else
				b = b - a; 
		}

		return a;
	}

	public static void main (String[] args) {
		
		int a = 12, b = 15;

		System.out.println(gcd(a, b));

	}
}

// Naive Method : Time Complexity : O(min(a,b))

import java.io.*;
import java.util.*;

public class Main {

	static int gcd(int a, int b)
	{
		int res = Math.min(a,b);
		
		while(res > 0)
		{
		    if(a%res == 0 && b%res == 0)
		    {
		        break;
		    }
		    res--;
		}
	
		return res;
	}

	public static void main (String[] args) {
		
		int a = 12, b = 15;

		System.out.println(gcd(a, b));

	}
}
