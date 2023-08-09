package tcs;

public class lostinForest {
 
	static void printCollatz(int n)
	{
		// while we do not reach 1
		while (n != 1)
		{
			System.out.print(n + " ");
	
			// If n is even
			if (n%2 ==0){
                n = n / 2;
            }
	
			// If odd
			else{
               n = 3 * n + 1;
            }
		}
	
		// Print 1 at the end
		System.out.print(n);
	}
	
	public static void main (String[] args)
	{
		printCollatz(6);
	}
}
