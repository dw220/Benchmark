import java.math.BigInteger;
import java.util.Arrays;

public class Implicit {
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
	
	public void run(){
		double average = 0.0;
		for(int i=0; i<5; i++){
			start = System.currentTimeMillis();
			
			Arrays.stream(numbers).parallel().forEach( (x) -> { calcFact(x); });
			
			end = System.currentTimeMillis();
			System.out.printf("Implicit concurrency test results, Time taken: %d\n", end - start);
			average += end-start;
		}
		
		System.out.println("Average time taken: " + average/5);
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
