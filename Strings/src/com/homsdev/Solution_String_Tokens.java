package com.homsdev;

import java.util.*;

public class Solution_String_Tokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		
		StringTokenizer tokens= new StringTokenizer(s, "!,?._'@ \n");
		
		System.out.println(tokens.countTokens());
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
		
		sc.close();
	}

}
