import java.util.Scanner;
class Program17 
{
	public static double power(double base)
	{
		int res=1;
		while (exp!=0)
		{
			double exp=
			res*=base;
			--exp;

		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Base");
		int num=sc.nextInt();
		System.out.println("Enter the Exponential");
		int ex=sc.nextInt();
		int num1=num+1;

		if (power(num1)%1==0)
		{
		System.out.println("Is a Sunny Number");
		}
		else
		{
		System.out.println("Is not a Sunny Number");
		}
	}
}
