import java.math.BigInteger;

public class Explicit {
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
				99000,
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
	
	int counter = 0;
	BigInteger inc;
	BigInteger fact;
	long start;
	long end;
	
	public synchronized int getCounter(){
		return counter;
	}
	
	public synchronized int getNext(){
		int no = -1;
		if(getCounter() <= numbers.length){	
		System.out.println("Getting next number");
		int number = numbers[counter];
		inc();
		return number;
		}
		return no;
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
