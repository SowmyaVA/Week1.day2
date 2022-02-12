package week1.day2;

public class FindTypes 
{
	
	public static void main(String[] args)
	{
		String test="$$ Welcome to 2nd Class of Automation $$ ";
		int letter=0,space=0,num=0,specialChar=0;
		
		//converting the String to char array
		
		char[] charArray=test.toCharArray();
		
		for(int i=0;i<charArray.length;i++)
		{
			// isLetter(), isDigit(), isSpaceChar() are methods of class Character
			//directly calling the static methods using the class name
			Boolean charCheck=Character.isLetter(charArray[i]);
			Boolean numCheck=Character.isDigit(charArray[i]);
			Boolean spaceCheck=Character.isSpaceChar(charArray[i]);
			
			if(charCheck)
			{
				letter=letter+1;
			}
			else if(numCheck)
			{
				num=num+1;
			}
			else if(spaceCheck)
			{
				space=space+1;
			}
			else
			{
				specialChar=specialChar+1;
			}
				
		}
		
		System.out.println("Total length of the String is : "+test.length());
		System.out.println("Total Aplhabets available in the String is : "+ letter);
		System.out.println("Total numbers available in the String is : "+ num);
		System.out.println("Total spaces available in the String is : "+ space);
		System.out.println("Total special characters available in the String is : "+ specialChar);
		
	}

}
