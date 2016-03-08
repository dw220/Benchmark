import java.math.BigInteger;

public class Explicit {
	int[] numbers = 
		{ 
				500000, 
				600000, 
				700000, 
				100000, 
				200000, 
				300000 
		};
	int counter = 0;
	BigInteger inc;
	BigInteger fact;
	long start;
	long end;
	
	public synchronized int getCounter(){
		return counter;
	}
	
	public synchronized int getNext(){
		System.out.println("Getting next number");
		int number = numbers[counter];
		inc();
		return number;
	}
	
	public void inc(){
		counter++;
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
		System.out.println("finishd");
	}
}
