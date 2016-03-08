import java.math.BigInteger;

public class Benchmark {
	
	int[] numbers = 
		{ 
				90000, 
				91000, 
				92000, 
				93000, 
				94000, 
				95000,
				96000,
				97000,
				98000,
				99000
		};
	
	BigInteger inc;
	BigInteger fact;
	long start;
	long end;
	
	/**
	 * run the benchmark test without concurrency
	 */
	public void run()
	{
		start = System.currentTimeMillis();
		for(int i=0; i< numbers.length; i++){
			calcFact(numbers[i]);
		}
		end = System.currentTimeMillis();
		System.out.printf( "No concurrency benchmark test results: %d", end - start );
	}
	
	/**
	 * calculate the factorial 
	 */
	public void calcFact(int number)
	{
		fact = new BigInteger( "1" );
		inc  = new BigInteger( "1" );
		for(int c=1; c <= number; c++){
			fact = fact.multiply(inc);
			inc  = inc.add(BigInteger.ONE);
		}
		System.out.printf("[%d] factorial number calculated\n", fact);
	}
}
