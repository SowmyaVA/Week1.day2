package week1.day2;

public class FibonacciSeries {
	
	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		int sum;
		
		System.out.println("value of Fibonacci series is " +a);
		System.out.println("value of Fibonacci series is " +b);
		for(int i=0;i<=5;i++) 
		{
			
		sum=a+b;
		System.out.println("value of Fibonacci series is " +sum);
		a=b;
		b=sum;
		}
		
	}

}
