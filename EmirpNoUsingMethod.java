import java.util.Scanner;

public class EmirpNoUsingMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
	int num = sc.nextInt();
	if(isPrime(num))
	{
	int rev = reverseNumber(num);
	 System.out.println(isPrime(rev)?"EMIRP":"NOT EMIRP");
	}
	else
	{
		 System.out.println("NOT EMIRP");
	}
	}
	public static boolean isPrime(int num)
	{
	if(num<=1)
	 {
		return false ;
	}
	boolean flag = true;
	for(int i =2;i<num;i++)
	{
          if(num%i ==0){
		flag = false;
 		break;
        }
	}
return flag;
}
public static int reverseNumber(int num)
{ int rev =0;
while(num>0)
{
rev = rev *10 +(num%10);
num/=10;
}
return rev;
}
}
		   