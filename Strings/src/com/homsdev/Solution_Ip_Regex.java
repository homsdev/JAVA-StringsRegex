package com.homsdev;

import java.util.*;

public class Solution_Ip_Regex {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
		
		in.close();
	}
}

class MyRegex{
	
	public String pattern;
	private static String digit="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	public MyRegex() {
		pattern=digit+"\\."+digit+"\\."+digit+"\\."+digit; 
	}
}
