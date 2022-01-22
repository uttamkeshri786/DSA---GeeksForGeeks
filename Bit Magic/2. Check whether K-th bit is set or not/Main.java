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
