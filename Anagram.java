package week1.day2;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args)
	{
		
		String txt1="stops";
		String txt2="potss";
		
		if(txt1.length()==txt2.length())
		{
		
			//converting String txt1 into array of characters
			char [] txt1Array=txt1.toCharArray();
			
			//converting String txt1 into array of characters
			char [] txt2Array=txt2.toCharArray();
			
			// sorting both the character arrays
			
			Arrays.sort(txt1Array);
			
			Arrays.sort(txt2Array);
			
			//printing and checking the txt1Array
			System.out.println(txt1Array);
			
			//printing and checking the txt2Array
			System.out.println(txt2Array);
			
			//looping through the arrays to check if both arrays have same values
			for (int i=0;i<txt1.length();i++)
			{
				if(txt1Array[i]==txt2Array[i])
				{
					System.out.println("[Value of txt1Array[i]] is " + txt1Array[i] +" And [Value of txt2Array[i]] is " +txt2Array[i] + " Hence they are Same");
					
				}
			}
			
		}
		
	}

}
