package problems;

import java.util.*;
import java.io.*;
 
class Problem_statement_5b
{
	public static String cyclicLeftShift(String s, int k){
	    k = k%s.length();
	    return s.substring(k) + s.substring(0, k);
	}
    // function that rotates s towards left by d
	public static void main(String[] args)
	{
	    String test = "MPHASIS";
	    for(int i = 0; i < test.length()*1; i++)
	        System.out.println(cyclicLeftShift(test, i));
	}
}