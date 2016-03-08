import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
	public static void main(String args[]) throws InterruptedException
	{
		long start = 0;
		long end = 0;
		double average = 0.0;
		
		Explicit e = new Explicit();
		
		for(int i=0; i<5; i++){
			start = System.currentTimeMillis();
			Pool p = new Pool();
			p.startPool();
	        while(!p.checkExecuting()){}
	        end = System.currentTimeMillis();
	        System.out.printf( "Time taken is %d \n", end - start);
	        average += (end - start);
		}
		System.out.println("Average time is " + average/5);
        
	}
}
