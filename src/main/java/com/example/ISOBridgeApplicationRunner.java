package com.example;

import org.jpos.q2.Q2;

public class ISOBridgeApplicationRunner {

	public static void main(String[] args) {
		System.out.println("start");
		Q2 q2 = new Q2();
		q2.start();
		System.out.println("end");
	}
	
}
