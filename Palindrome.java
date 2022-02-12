package week1.day2;

public class Palindrome {
	
	public static void main(String[] args)
	{
	String name="MADAM";
	String rev="";
	
	int len=name.length();
	
	System.out.println("Length of the string is : "+len);
	
	char[] charArray=name.toCharArray();
	
	for(int i=len-1;i>=0;i--)
	{
		//System.out.println(name.charAt[i]);
		rev= rev+charArray[i];
		
	}
	
	if(name.equalsIgnoreCase(rev))
	{
		System.out.println(name+" is a Palindrome String");
		
	}
	else
	{
	
		System.out.println(name+" is not a Palindrome String");
	}
	
	
	}

}
