import java.math.BigInteger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Threadpool {

	/**
	 * Inner class for thread creation and running
	 * @author dw220
	 *
	 */
	public class worker implements Runnable{
		int number = 0;
		
		public worker(int number){
			this.number = number;
		}

		//Calcualte the factorial of the given number
		@Override
		public void run() {
			BigInteger fact = new BigInteger( "1" );
			BigInteger inc  = new BigInteger( "1" );
			
			for(int c=1; c <= this.number; c++){
				fact = fact.multiply(inc);
				inc  = inc.add(BigInteger.ONE);
			}
			System.out.printf("finished calculating number %d\n", this.number);
		}
		
	}
	
	/**
	 * Start thread pool and run tasks, calculate factorial between 90000-90010
	 */
	public void startPool(int threads){
		
		ExecutorService executor = Executors.newFixedThreadPool(threads);
		
		for(int i=99900; i< 99910; i++){
			worker t = new worker(i);
			executor.execute(t);
		}
		executor.shutdown();
		
		//wait for operation to finish
		try{ executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS); } 
		catch(InterruptedException e){System.out.println("Thread pool interuptted");}
	}
	
	
}
