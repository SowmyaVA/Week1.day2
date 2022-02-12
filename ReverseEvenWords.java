package week1.day2;

public class ReverseEvenWords 
{
	
	public static void main(String[] args)
	{
		
		String str="I am a software tester";
		String rev="";
		
		String[] split=str.split(" ");
		
		
		for(int i=0;i<split.length;i++)
		{
			//System.out.println(split[i]);
			
			if(i%2!=0)
			{
				//System.out.println(split[i]);
				
				char[] charSplit=split[i].toCharArray();
				
				for(int y=charSplit.length-1;y>=0;y--)
				{
					rev=rev+charSplit[y];
					
				}
				rev=rev+" ";
			}
			
		}
		System.out.println(rev);
		
	}

}
