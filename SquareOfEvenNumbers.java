package week1.day2;

public class SquareOfEvenNumbers {
	
	
	public static void main (String[] args)
	{
		for (int i=59;i>=38;i--)
		{
			if(i%2==0)
			{
				int square=i*i;
				System.out.println("Even number is : "+i);
				System.out.println("Square of even number " +square);
			}
		}
	}

}
