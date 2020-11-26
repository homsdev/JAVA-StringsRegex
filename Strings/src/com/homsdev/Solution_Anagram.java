package com.homsdev;

import java.util.*;

public class Solution_Anagram {

	public static char[] order(char[] c) {
		char aux;
		for(int j=0;j<c.length;j++) {
			for (int i = c.length - 1; i > 0; i--) {
				if (c[i] < c[i - 1]) {
					aux = c[i];
					c[i] = c[i - 1];
					c[i - 1] = aux;
				}
			}	
		}
		return c;
	}

	public static boolean isAnagram(String a, String b) {
		char[] arrA = a.toLowerCase().toCharArray();
		char[] arrB = b.toLowerCase().toCharArray();
		arrA= order(arrA);
		arrB= order(arrB);
		a=String.valueOf(arrA);
		b=String.valueOf(arrB);
		if(a.compareTo(b)==0)return true;
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();

		boolean ret = isAnagram(a, b);
		System.out.println(ret ? "Anagrams" : "Not Anagrams");
	}
}
