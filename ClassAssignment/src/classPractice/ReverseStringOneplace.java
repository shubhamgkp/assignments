package classPractice;

import java.util.Arrays;

public class ReverseStringOneplace {
	
	
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("verma");
		char temp;
		for(int i=0;i<sb.length()/2;i++)
		{
			temp=sb.charAt(i); //temp=a[i];
			sb.setCharAt(i,sb.charAt(sb.length()-1-i));  //a[i]=a[a.length-1-i];
			sb.setCharAt(sb.length()-1-i,temp);          //a[a.length-1-i]=temp;
					
		}
		System.out.println(sb);	
		
	}

}
