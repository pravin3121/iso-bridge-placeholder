package com.example;

import org.jpos.q2.Q2;

import java.io.File;

public class ISOBridgeApplicationRunner {

	public static final String  Q2_LOG = "./log/";
	public static final String  Q2_FILE = Q2_LOG+"q2.log";
	public static final String  Q2_DEPlOY = "./deploy/";


	public static void main(String[] args) throws Exception{

		mkdirs(Q2_DEPlOY);
		mkdirs(Q2_LOG);
		File q2file = new File(Q2_FILE);
		boolean unused =  q2file.createNewFile();

		System.out.println("start");
		Q2 q2 = new Q2();
		q2.start();
		System.out.println("end");
	}

	private static void mkdirs(String dirPath) throws  Exception{
		File dir = new File(dirPath);
		if(!dir.mkdirs()) {
			throw new Exception("Could not create directory "+dir.getAbsolutePath());
		}
	}
}
