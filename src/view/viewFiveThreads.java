package view;
import Thread.ThreadLogger;
public class viewFiveThreads {

	public static void main(String[] args) {
		Thread one = new ThreadLogger();
		Thread two = new ThreadLogger();
		Thread Three = new ThreadLogger();
		Thread four = new ThreadLogger();
		Thread five = new ThreadLogger();
		
		one.start();
		two.start();
		Three.start();
		four.start();
		five.start();
	}

}
