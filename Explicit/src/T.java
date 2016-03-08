
public class T implements Runnable{

	Explicit e;
	
	public T( Explicit e){
		this.e = e;
	}
	
	
	@Override
	public void run() {
		while(e.counter < 6){
			e.calcFact(e.getNext());
		}
	}
}
