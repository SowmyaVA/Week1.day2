package week1.day2;

public class FindDuplicatesInArray {
	
	public static void main(String[] args)
	{
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int len=arr.length;
		int count;
		for(int i=0;i<len-1;i++)
		{
			count=0;
			
			//System.out.println(" value if arr[i] : "+arr[i]);
			
			for(int y=i+1;y<=len-1;y++)
			{
				//System.out.println(" value if arr[y] : "+arr[y]);
				
				if(arr[i]==arr[y])
				{
					
					count=count+1;
				}
				
			}
			
			
			if(count>0)
			{
				System.out.println(" Duplicate array variable is : " +arr[i]);
			}
			
		}
		
	}

}
