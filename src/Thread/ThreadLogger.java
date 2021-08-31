package Thread;

public class ThreadLogger extends Thread {

	public ThreadLogger() {
		// TODO Auto-generated constructor stub
	
	}
	@Override
	public void run() {
		System.out.println("O id da thread é " + getId());
	}
	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}
}
