package Javaprgm;

import java.util.Scanner;

public class Charend {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the string");
		String[] str= {"madam","sakthi","Ram","Kannan"};
		System.out.println("Length of String array"+str.length);
		
		for(int i=0;i<=str.length-1;i++)
		{
			
	if	(str[i].charAt(str[i].length()-1)=='m' || str[i].charAt(str[i].length()-1)=='n')
	{
		System.out.println("The String"+" "+ str[i]+" " +"ends with m or n");
	}
	else
	{
		System.out.println("The String"+" "+ str[i]+" " +"does not ends with m or n");
	}
	}

}
}