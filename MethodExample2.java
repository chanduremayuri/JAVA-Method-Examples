import java.util.*;
class MethodExample2
{
	public static void main(String[] args) {
		
	
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number :");
    int num = se.nextInt();
    int rev = reverseNumber(num);
     isPalindrome(num,rev);

}

public static int  reverseNumber(int num)
{
	int rev = 0;
	while(num != 0)
	{
		int rem = num %10;
		rev = rev *10 + rem ;
		num / 10;
	}

	return rev ;
}
public static void isPalidrome(int num , int rev) 
{
	if(num == reverseNumber)
	{
       System.out.println("Palidrome");
	}
	else 
	{
		System.out.println("Not a Palidrome");
	}
}

}
	
