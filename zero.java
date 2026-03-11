import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(c%3==0 && b==2*a +(c/3))
		{
		    System.out.println("yes");
		}
		else{
		    System.out.println("no");
		}
		}

	}
}
