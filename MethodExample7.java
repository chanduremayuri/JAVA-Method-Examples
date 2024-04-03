class MethodExample7
 {
    public static void main(String[] args) {
        System.out.println("from main 1");
        m1();
        System.out.println("from main 2");
    }
     public static void  m1()
     {
     System.out.println("from m(1)");
     String [] person = {"ramesh ", "suresh"};
     main(person);
     System.out.println("from m(2)");
}}