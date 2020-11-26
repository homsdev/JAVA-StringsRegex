package com.homsdev;

import java.util.*;
import java.util.regex.*;

public class Solution_Tag_Content_Extractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Pattern pattern = Pattern.compile("<(.+)>([^<>]+)<\\/\\1>");

		int testCases = scan.nextInt();
		
		scan.nextLine();

		while (testCases-- > 0) {
			String input = scan.nextLine();
			Matcher matcher = pattern.matcher(input);
			if (matcher.find()) {
				matcher.reset();
				while (matcher.find()) {
					System.out.println(matcher.group(2));
				}
			} else
				System.out.println("none");
		}

		scan.close();
	}

}
