//Shorter Implementation of the optimized sieve : 

import java.io.*;
import java.util.*;

public class Main {
	
	static void sieve(int n)
	{
		if(n <= 1)
			return;

		boolean isPrime[] = new boolean[n+1];

		Arrays.fill(isPrime, true);

		for(int i=2; i <= n; i++)
		{
			if(isPrime[i])
			{
        System.out.print(i+" ");
				for(int j = i*i; j <= n; j = j+i)
				{
					isPrime[j] = false;
				}
			}
		}
	}

	public static void main (String[] args) {
		
		int n = 23;

		sieve(n);

	}
}

//Optimized Implementation : Time Complexity : O(nloglogn), Auxiliary Space : O(n)
import java.io.*;
import java.util.*;

public class Main {
	
	static void sieve(int n)
	{
		if(n <= 1)
			return;

		boolean isPrime[] = new boolean[n+1];

		Arrays.fill(isPrime, true);

		for(int i=2; i*i <= n; i++)
		{
			if(isPrime[i])
			{
				for(int j = i*i; j <= n; j = j+i) // Replaced 2*i by i*i
				{
					isPrime[j] = false;
				}
			}
		}

		for(int i = 2; i<=n; i++)
		{
			if(isPrime[i])
				System.out.print(i+" ");
		}
	}

	public static void main (String[] args) {
		
		int n = 18;

		sieve(n);

	}
}


//Simple Implementation of Sieve : 

import java.io.*;
import java.util.*;

public class Main {
	
	static void sieve(int n)
	{
		if(n <= 1)
			return;

		boolean isPrime[] = new boolean[n+1];

		Arrays.fill(isPrime, true);

		for(int i=2; i*i <= n; i++)
		{
			if(isPrime[i])
			{
				for(int j = 2*i; j <= n; j = j+i) 
				{
					isPrime[j] = false;
				}
			}
		}

		for(int i = 2; i<=n; i++)
		{
			if(isPrime[i])
				System.out.print(i+" ");
		}
	}

	public static void main (String[] args) {
		
		int n = 18;

		sieve(n);

	}
}


//Naive Solution : Time Complexity : O(n(sqrt(n))

import java.io.*;
import java.util.*;

public class Main {
  
	static boolean isPrime(int n)
	{
		if(n==1)
			return false;

		if(n==2 || n==3)
			return true;

		if(n%2==0 || n%3==0)
			return false;

		for(int i=5; i*i<=n; i=i+6)
		{
			if(n % i == 0 || n % (i + 2) == 0)
				return false; 
		}

		return true;
	}
	
	static void printPrimes(int n)
	{
		for(int i = 2; i<=n; i++)
		{
			if(isPrime[i])
				System.out.print(i+" ");
		}
	}

	public static void main (String[] args) {
		
		int n = 18;

		printPrimes(n);

	}
}
