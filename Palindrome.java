 public class Palindrome 
{
	public static void main(String[] args)
	{
		for (int i = 0; i < args.length; i++)
		{ 
            String s = args[i];
			//if(s.equals(reverseString(s)))
			//System.out.println(reverseString(s));
			System.out.println(isPalindrome(s));
		} 			
	} 
	
	public static String reverseString(String s)
	{
		String newS = "";
		for(int i = s.length()-1; i >= 0; i--)
		{
			newS += s.charAt(i);
		}
		return newS;
	}
	
	public  static  boolean  isPalindrome(String  s)
	{
		String reverseS = reverseString(s);
		return s.equals(reverseS);
	}
} 
