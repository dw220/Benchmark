import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Pool {
	int threadNo = 0;
	Explicit e;
	ExecutorService executor;
	public Pool(  ){
		e = new Explicit();
	}
	
	public void startPool(){
		executor = Executors.newFixedThreadPool(4);
		for(int i=0; i< e.numbers.length; i++){
			Workerthread t = new Workerthread(e);
			executor.execute(t);
		}
		executor.shutdown();
		try {
			executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
			} catch (InterruptedException e) {
			 
		}
	}
	
}
