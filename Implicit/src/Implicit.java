import java.math.BigInteger;
import java.util.Arrays;

public class Implicit {
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
	
	public void run(){
		start = System.currentTimeMillis();
		
		Arrays.stream(numbers).parallel().forEach( (x) -> { calcFact(x); });
		
		end = System.currentTimeMillis();
		System.out.printf("Implicit concurrency test results, Time taken: %d", end - start);
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
