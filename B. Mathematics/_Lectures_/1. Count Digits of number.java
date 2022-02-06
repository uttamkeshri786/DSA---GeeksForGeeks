//Time Complexity : O(d), where 'd' is the digits of number
import java.io.*;
import java.util.*;
 
public class CountDigits {
 
	static int countDigits(int num)
	{
		int count = 0;
    
		while(num > 0)
		{
			num = num / 10;
			count++;
		}	
		return count;
	}
 
	public static void main (String[] args) {
		
		int number = 789;
 
		System.out.println(countDigits(number));
 
	}
}
