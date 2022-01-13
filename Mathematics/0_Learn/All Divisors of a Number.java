//Efficient Code with Sorted Order : Time Complexity : O(sqrt(n)), Auxiliary Space : O(1)

import java.io.*;
import java.util.*;

public class Main {

	
	static void printDivisors(int n)
	{
		int i = 1;
		for(i=1; i*i < n; i++)
		{
			if(n % i == 0)
			{
				System.out.print(i+" ");
			}
		}

		for(; i >= 1; i--)
		{
			if(n % i == 0)
			{
				System.out.print((n / i)+" ");
			}
		}
	}

	public static void main (String[] args) {
		
		int n = 15;

		printDivisors(n);

	}
}


//Efficient Code : Time Complexity : O(sqrt(n))

import java.io.*;
import java.util.*;

public class Main {
	
	static void printDivisors(int n)
	{
		for(int i=1; i*i <= n; i++)
		{
			if(n % i == 0)
			{
				System.out.print(i+" ");

				if(i != n / i)
					System.out.print((n / i)+" ");					
			}
		}
	}

	public static void main (String[] args) {
		
		int n = 25;

		printDivisors(n);

	}
}

// Naive Method : Time Complexity : O(n), Auxiliary Space : O(1)

import java.io.*;
import java.util.*;

public class Main {

	static void printDivisors(int n)
	{
		for(int i=1; i<=n; i++)
		{
		    if(n%i == 0)
		        System.out.print(i+" ");
		}
	}

	public static void main (String[] args) {
		
		int n = 15;

		printDivisors(n);

	}
}
