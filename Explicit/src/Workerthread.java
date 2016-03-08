
public class Workerthread implements Runnable{

	Explicit e;
	
	public Workerthread( Explicit e){
		this.e = e;
	}
	
	
	@Override
	public void run() {
			e.calcFact(e.getNext());		
	}
}
