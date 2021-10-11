class Program15 
{
	public static void main(String[] args) 
	{
		int num=371,original,sum=0;
		original=num;
		while(original!=0)
		{
			int d=original%10;
			sum=sum+d*d*d;
			original=original/10;
		}
		if(sum==num)
		{
		System.out.println("It is an armstrong number");
		}
		else
		{
			System.out.println("It is not an armstrong number");
		}
	}
}
