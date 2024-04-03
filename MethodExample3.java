class MethodExample3
{
	public static void main(String[] args) 
	{
		 for(int i = 2 ;i <=20 ; i++)
		 {
		 	evenOdd(i);
		 }
	}

	public static void evenOdd(int num)
    {
		if(num % 2 == 0)
		{
			System.out.println(num + "- Even");
		}
		else
		{
			System.out.println(num + "- Odd");
		}


	}
}