package com.jerry.s7.thread;

public class ThreadMain {
	public static void main(String[] args) {
		PrintNumber printNumber = new PrintNumber();
		PrintWord printWord = new PrintWord();
		Thread thread = new Thread(printWord);

		printNumber.run();
		thread.start();
	}
}
