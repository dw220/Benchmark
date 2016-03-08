import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
	}
	
	public boolean checkExecuting(){
		if(executor.isTerminated()){
			return true;
		}
			return false;
	}
	
}
