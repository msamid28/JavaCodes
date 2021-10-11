import java.util.Scanner;
class  Program2 //Prime or not between two nums
{
	public static void main(String[] args) 
	{
		int num1,num2,flag=0,i,j;
        Scanner sc= new Scanner(System.in);
		System.out.println("Enter  the Start Number");
		num1 = sc.nextInt();
		System.out.println("Enter the End Number");
		num2 = sc.nextInt();
        System.out.println();

		for(i =num1;i<=num2;i++)
		{
			for(j=2;j<=i;j++)
			{
				if (i%j==0)
				{
					break;
				}
			}
			if(i==j)
			{
				System.out.println(j+" ");
			}
		}
	}
}

