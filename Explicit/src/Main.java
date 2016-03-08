import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
	public static void main(String args[]) throws InterruptedException
	{
		Explicit e = new Explicit();
		long start = System.currentTimeMillis();
		Pool p = new Pool();
		p.startPool();
        while(!p.checkExecuting()){}
        long end = System.currentTimeMillis();
        System.out.printf( "Time taken is %d", end - start);   
	}
}
