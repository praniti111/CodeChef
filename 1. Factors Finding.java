// DIFACTRS

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
	
	    int[] arr = new int[n];
		for(int i=1; i<=n;i++)
		{
		    if(n%i==0)
		    {
		        arr[count] = i;
		        count++;
		    }
		    
		}
		System.out.println(count);
		for(int i = 0;i<count;i++)
		{
		    System.out.print(arr[i] +" ");
		    
		}
	}
}
