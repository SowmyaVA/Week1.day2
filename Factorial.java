package week1.day2;

public class Factorial {
	
	public static void main(String[] args)
	{
		int fact=1;
		int n=7;
		for (int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial value of 5! is : "+ fact);
	}

}
