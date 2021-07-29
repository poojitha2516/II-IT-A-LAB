/* Write a Java program that implements a multi-thread application that has three threads. First thread generates random integer every 1 second and if the value is even, second thread computes the square of the number and prints. If the value is odd, the third thread will print the value of cube of the number. */

import java.util.Random;

class RandomNumberThread extends Thread {
	public void run() {
		Random random = new Random();
		for(int i=0;i<10;i++) {
			int randomInteger = random.nextInt(100);
			System.out.println("Random Integer generated : "+randomInteger);
			if((randomInteger % 2) == 0) {
				SquareThread sThread = new SquareThread(randomInteger);
				sThread.start();
			}
			else {
				CubeThread cThread = new CubeThread(randomInteger);
				cThread.start();
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}
}

class SquareThread extends Thread {
	int num;
	SquareThread(int randomNumber) {
		num = randomNumber;
	}
	public void run() {
		System.out.println("Square of "+num+" = "+(num * num));
	}
}

class CubeThread extends Thread {
	int num;
	CubeThread(int randomNumber) {
		num = randomNumber;
	}
	public void run() {
		System.out.println("Cube of "+num+" = "+(num * num * num));
	}
}

public class MultiThreading {
	public static void main(String args[]) {
		RandomNumberThread rnThread = new RandomNumberThread();
		rnThread.start();
	}
}

