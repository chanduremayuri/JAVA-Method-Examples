class MethodExample1
{
	public static void main(String[] args) {
		System.out.println("Execution Starts :");
        myMethod1() ;
        checkEvenOdd(44);
        checkEvenOdd(47);
        System.out.println("Execution Ends");
	}
	public static void myMethod1() 
	{
		System.out.println("Hello from myMethod1() ");
	}
	public static void checkEvenOdd(int num) 
	{
		if(num % 2 == 0)
		{
			System.out.println(num + "- is a even Number");
		}else
		{
			System.out.println(num + "- is a odd Number");
		}
	}
}