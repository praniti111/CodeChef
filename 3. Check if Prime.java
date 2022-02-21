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
		int lv = 2; // as 1 is always a factor of a number so start from 2
		int count = 0;
		
		while(lv*lv<=n)
		{
    		if(n%lv == 0)
    		{
    		    System.out.println("NO");
    		    count++;
    		    break;
    		}
    		else{
    		    lv++;
    		}
		}
    		
    		if(count == 0)
    		{
    		    System.out.println("YES");
    		}
		
		
	}
}
