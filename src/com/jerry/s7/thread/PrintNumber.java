package com.jerry.s7.thread;

public class PrintNumber extends Thread {
	@Override
	public void run() {
		this.info();
	}

	public synchronized void info() {
		Object obj = new Object();
		// obj.notify();
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
