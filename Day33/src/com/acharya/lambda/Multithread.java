package com.acharya.lambda;

interface Lambda{
	public void demo();
}

public class Multithread {

	public static void main(String[] args) {
		new Thread(()->{System.out.println("I am run method");}).start();

	}

}

