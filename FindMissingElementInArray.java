package week1.day2;

import java.util.Arrays;

public class FindMissingElementInArray {

	public static void main(String[] args)
	{
		
		int[] arr= {1,2,3,4,7,6,8};
		//to sort an array
		Arrays.sort(arr);
		int iterator=0;
		
		
		for(int i=1;i<=arr.length;i++)
		{
			if(i!=arr[iterator])
			{
				System.out.println("Missing array element is : " + i);
				break;
			}
			iterator++;
			
			
		}
		
		
		
	}
	
}
