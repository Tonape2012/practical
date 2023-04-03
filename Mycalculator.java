package Lab;

public class Mycalculator {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		AdvancedArithemetic a1=new AdvancedArithemetic();
		a1.divisorsum(n);
		sc.close();
		
	}

}
