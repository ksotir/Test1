package test1;

public class ThreadTest {
	
	public static void main(String[] args) {
		Thread t1 = new ThreadA();
		Thread t2 = new Thread(new ThreadB());
		t1.start();
		t2.start();
	}

}

class ThreadA extends Thread {

	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("**");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class ThreadB implements Runnable {
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("-----");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}