class Program11
{
	public static void main(String[] args) 
	{
		int num=123498876;
		int d=0;
		int num1=num%10;
        System.out.println("Last Number "+num1);
		while(num!=0)
		{
			d = num%10;
			num=num/10;
		}
		System.out.println("First Number "+d);
		System.out.println("Sum= "+(d+num1));

	}
}
