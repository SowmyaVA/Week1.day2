package week1.day2;

public class OddNumber 
{
	
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd number between 1 to 100 is : "+ i);
				i=i+1;
			}
		}
	}

}
