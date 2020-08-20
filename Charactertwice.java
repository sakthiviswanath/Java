package Javaprgm;

public class Charactertwice {
	
	
	public static void char2(String str)
	{
		String newstr="";	
		
		for(int i=0;i<=str.length()-1;i++)
		newstr=newstr + str.substring(i,i+1)+str.substring(i,i+1);
		System.out.println("New String"+":"+newstr);
	}
	
	
	

	public static void main(String[] args) {
		
		String str="sakthi";
		System.out.println("Entered String"+":"+str);
		
		char2(str);
		
	}
	
	
}
