package Javaprgm;

import java.util.Scanner;

public class SwapString {
	static char temp;
	
	public   static char[] swap(char[] ch,int i,int j)
	{
		//char temp=ch[i];
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return ch;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		
		char[] ch = str.toCharArray();
		
		
		System.out.println(swap(ch,0,5));
	}
	
	
}
