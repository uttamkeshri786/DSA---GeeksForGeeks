//Iterative Code : Time Complexity : Θ(n), Auxiliary Space : Θ(1)

import java.io.*;
import java.util.*;

public class Main {

	static int fact(int n)
	{
		int res = 1;

		for(int i=2; i<=n; i++)
		{
			res = res * i;
		}
		return res;
	}

	public static void main (String[] args) {
		
		int number = 5;

		System.out.println(fact(number));

	}
}

//Recursive Code : Time Complexity : Θ(n), Auxiliary Space : Θ(n) 

import java.io.*;
import java.util.*;

public class Main {

	
	static int fact(int n)
	{
	    if(n==0)
	        return 1;
		
		return n * fact(n-1);
	}

	public static void main (String[] args) {
		
		int number = 5;

		System.out.println(fact(number));

	}
}
