import java.math.BigInteger;

public class Benchmark {
	
	int[] numbers = 
		{ 
				99900,
				99901,
				99902,
				99903,
				99904,
				99905,
				99906,
				99907,
				99908,
				99909
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
		double average = 0;
		for(int j=0; j < 5; j++){
			start = System.currentTimeMillis();
			for(int i=0; i< numbers.length; i++){
				calcFact(numbers[i]);
			}
			end = System.currentTimeMillis();
			average += (end-start);
			
		}
		System.out.println("Average time taken is: " + average/5);
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
	}
}
