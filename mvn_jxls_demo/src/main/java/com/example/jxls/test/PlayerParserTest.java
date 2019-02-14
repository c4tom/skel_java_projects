package com.example.jxls.test;

import com.example.jxls.parser.PlayerParser;

public class PlayerParserTest {

	public static void main(String[] args) {
		try {
			String current = new java.io.File(".").getCanonicalPath();
			System.out.println("Current dir:" + current);
			String currentDir = System.getProperty("user.dir");
			System.out.println("Current dir using System:" + currentDir);

			PlayerParser.parseAndDisplay("src\\main\\resources\\map.xml", "src\\main\\resources\\Players.xlsx");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}