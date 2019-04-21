import java.util.concurrent.Semaphore;

public class Barrier {
	
	// add missing variables
	public volatile static int blocked = 0;
	public static int size;
	
	Barrier(int n) {
		// complete this constructor
		size = n;
	}
	
	public void b_wait() throws InterruptedException{
		// this is the only additional method you will need to complete
		blocked+=1;
		while (blocked < size);

		blocked-=1;
	}

}
