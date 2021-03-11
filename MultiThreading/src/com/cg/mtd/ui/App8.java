package com.cg.mtd.ui;

import java.util.Random;

class PrimeThread extends Thread {
	private long num;
	
	PrimeThread(long num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		boolean isPrime = true;
		for(long i=2; i<=num/2; i++) {
			if (num%i==0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + " is prime " + "[" + Thread.currentThread().getName() + "]");
		} else {
			System.out.println(num + " is not prime" + "[" + Thread.currentThread().getName() + "]");
		}
	}
}

public class App8 {

	public static void main(String[] args) {
		Random random = new Random();
		for(int i=1; i<=10; i++) {
			long num1 = Math.abs(random.nextLong());	/* since prime number is always positive */
			PrimeThread thread = new PrimeThread(num1);
			thread.setName("Thread " + i);
			thread.start();
		}

	}

}
