import java.util.Scanner;
class Program4
{
	public static void main(String[] args) 
	{
		int num,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of the given number is "+fact);
	}
}
