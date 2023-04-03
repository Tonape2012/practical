package Lab;

public class AdvancedArithmetic {

	public void divisorSum(int n)
	{
		int i, sum=0;
		for(i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of all divisors of"+n+"is: "+sum);
	}

}
