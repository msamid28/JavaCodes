class Program6 
{
	public static int fact(int n)
	{
		int fac=1;
		for(int i=1;i<=n;i++)
		{
			fac=fac*i;
		}
		return fac;
	}
	public static void main(String[] args) 
	{
		int n=145;
		int n1=n;
		int sum=0;
		while(n!=0)
		{
			int d =n%10;
            sum=sum+fact(d);
			n=n/10;
		}
		if(n1==sum)
		{
		System.out.println("It is  a Strong Number");
		}
		else
		{
		System.out.println("It is not a Strong Number");
		}
	}
}
