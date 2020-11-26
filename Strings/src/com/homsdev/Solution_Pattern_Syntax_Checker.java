package com.homsdev;

import java.util.*;
import java.util.regex.*;

public class Solution_Pattern_Syntax_Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int testCases = Integer.parseInt(scan.nextLine());
		String pattern;
		while(testCases>0) {
			pattern = scan.nextLine();
			try {
				@SuppressWarnings("unused")
				Pattern obj = Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException Ex) {
				System.out.println("Invalid");
			}
			testCases--;
		}
		
		scan.close();
	}

}
