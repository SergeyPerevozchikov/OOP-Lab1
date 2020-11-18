public class Primes { 
        public static void main(String[] args) { 
		for(int i = 2; i < 100; i++)
		{
			boolean result = isPrime(i);
			if(result == true)
			{
				System.out.println(i);
			}
		}
        } 
	public static boolean isPrime(int n)  
	{
		boolean isPrime = true;
		for(int i = 2; i < n; i++)
		{
			if(n%i == 0)
			{
				isPrime = false;
			}
		}
		return isPrime;
	} 

} 
