/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class 2nd_level_Q2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;
		int[] array1 = new int[n];
		int[] final_array = new int[n];
		for(int i=0;i<n;i++)
		{
		    int temp = sc.nextInt();
		    for(int j = 0; j<i; j++)
		    {
		        if(array1[j]>temp)
		        {
		            int x = array1[j];
		            array1[j] = temp;
		            temp = x;
		        }
		    }
		    array1[i] = temp;
		}
		for(int i=0;k<n;i++)
		{
		    final_array[k++] = array1[n-i-1];
		    System.out.print(final_array[k-1]+" ");
		    if(k<n)
		    {
		        final_array[k++] = array1[i];
		        System.out.print(final_array[k-1]+" ");
		    }
		}
	}
}
