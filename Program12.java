class Program12 
{
	public static void main(String[] args) 
	{
		int num=12345678,count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
}
