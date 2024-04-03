class MethodExample2 
{
   public static void main(String[] args)
        {
		String name = "Ramesh";
		char ch = demo(name,3);
		System.out.println(name +" has acharacter "+ch + " at 3");
		
	
	}
    public static char demo(String name,int index)
	{
		char ch =name.charAt(index);
		return ch;
	}	
}