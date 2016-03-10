
public class Main {
	
	public static void main(String args[]){
		double average = 0.0;
	for(int i=0; i<5; i++){		
		long start = System.currentTimeMillis();
			Threadpool p = new Threadpool();
			p.startPool(30);
		long end = System.currentTimeMillis();
		average += (end - start);
	}
	
	System.out.printf("Time taken to execut tasks: %f ", average/5);
	}
	
}
