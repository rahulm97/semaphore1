import java.util.concurrent.Semaphore;

public class Barrier {
	
	// add missing variables
	
	private Semaphore semaphore;
	
	Barrier(int n) {
		// complete this constructor
		semaphore = new Semaphore(n);
	}
	
	public void b_wait() throws InterruptedException{
		// this is the only additional method you will need to complete
		semaphore.acquire();
		while (semaphore.availablePermits() != 0);
		semaphore.release();
	}

}