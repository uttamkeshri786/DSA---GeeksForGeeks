// Efficient Method : Time Complexity : Θ(logn)

import java.io.*;
import java.util.*;

public class Main {

	static int countTrailingZeros(int n)
	{
		int res = 0;

		for(int i=5; i<=n; i=i*5)
		{
			res = res + (n / i);
		}

		return res;
	}

	public static void main (String[] args) {
		
		int number = 251;

		System.out.println(countTrailingZeros(number));

	}
}

// Naive Method : Time Complexity : Θ(n)

// Overflow for n=20, as factorial value will be of around 19 digits

static int countTrailingZeros(int n)
{
	int fact = 1;

	for(int i=2; i<=n; i++)
	{
	    fact = fact*i;
	}

	int res = 0;

	while(fact%10 == 0)
	{
	    res++;
	    fact = fact/10;
	}

	return res;
}
