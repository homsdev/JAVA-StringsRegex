package com.homsdev;

import java.util.*;
import java.util.regex.*;

public class Solution_Duplicate_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "(\\b\\w+)(?:\\W+\\1\\b)+";
		Pattern pattern = Pattern.compile(regex);

		Scanner sc = new Scanner(System.in);
		int numSentences = sc.nextInt();
		sc.nextLine();
		
		while (numSentences-- > 0) {
			String input= sc.nextLine();
			Matcher matcher=pattern.matcher(input);
			
			while(matcher.find()) {
				System.out.println(matcher.group());
				System.out.println(matcher.group(1));
				input=input.replaceAll(matcher.group(),matcher.group(1));
			}
			
			System.out.println(input);
		}
		
		sc.close();
		
	}

}
