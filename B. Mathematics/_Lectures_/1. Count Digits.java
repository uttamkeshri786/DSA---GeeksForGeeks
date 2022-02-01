//Time Complexity : O(d), where 'd' is the digits of number
import java.io.*;
import java.util.*;

public class CountDigits {

	static int countDigits(int x)
	{
		int res = 0;
    
		while(x > 0)
		{
			x = x / 10;
			res++;
		}	
		return res;
	}

	public static void main (String[] args) {
		
		int number = 789;

		System.out.println(countDigits(number));

	}
}
