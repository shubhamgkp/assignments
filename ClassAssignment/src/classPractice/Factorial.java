package classPractice;

import java.util.Scanner;

public class Factorial {
	static int fact=1;
	public static void main(String[] args) {
		System.out.println("enter number ");
		int n=new Scanner(System.in).nextInt();
		System.out.println(calfact(n));
	}
	public static int calfact(int n)
	{
		
		if(n>0)
		{
			fact=fact*n;
			calfact(n-1);
		}
		return fact;
		
	}
	

}
