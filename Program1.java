import java.util.Scanner;
class  Program1 //Prime or not
{
	public static void main(String[] args) 
	{
		int num,flag=0;
        Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		num = sc.nextInt();
		int m=num/2;
		if(m==0 ||m==1)
		{
			System.out.println("It is a Prime Number");
		}
		else
		{
		for(int i =2;i<=num;i++)
		{
			if(num%i==0)
			{
			System.out.println("It is a not a Prime number");
			flag=1;
			}
			if (flag==0)
			{
				System.out.println("It is a Prime number");
				
			}
		break;
		}
		}
	}
}
