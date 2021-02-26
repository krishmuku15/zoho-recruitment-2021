import java.util.*;
import java.lang.*;
import java.io.*;

class level1_program
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		for(int i =0; i<name.length();i++)
		{
		    int k = (name.length())/2;
		    for(int j=name.length()-1-i; j>0 ; j--)
		    {
		        System.out.print(" ");
		    }
		    for(int j=0;j<=i;j++,k++)
		    {
		        if(k==name.length())
		        {
		            k=0;
		        }
		        System.out.print(name.charAt(k));
		    }
		    System.out.println();
		}
	}
}
