package week1.day2;

public class CharOccurance {
	
	public static void main(String[] args)
	{
		String txt="welcome to chennai";
		int count=0;
		
		//convert String txt to character array
		char[] txtArray=txt.toCharArray();
		//find the length of the character array
		int len=txtArray.length;
		
		for(int i=0;i<len;i++)
		{
			if(txtArray[i]=='w')
			{
				count=count+1;
			}
		}
		System.out.println("Occurance of letter e in the String is : "+count);
	}

}
