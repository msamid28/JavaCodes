class Program13 
{
	public static void main(String[] args) 
	{
		int num=1231;
		int temp=num;
		int pal=0;
		while(num!=0)
		{
			int d = num%10;
			pal=pal*10+d;
			num=num/10;
		}
		if(temp==pal)
		{
			System.out.println("Its a Palindrome");
		}
		else
			System.out.println("Its not a Palindrome");
	}
}
