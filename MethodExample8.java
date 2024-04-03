
class  MethodExample8{
    public static void main(String[] args) {
        System.out.println("from main hiii");
        myMethod();
        checkEvenOdd(44);
        checkEvenOdd(47);
        System.out.println("from main byeee");
    }
     public static void  myMethod()
     {
     System.out.println("hi from myMethod()");
     }
     public static void checkEvenOdd(int num)
     {
         if(num % 2==0)
         {
             System.out.println(num +"Even");
         }
         else
         {
             System.out.println(num +"odd");
         }
         
}}