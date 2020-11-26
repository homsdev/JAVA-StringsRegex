package com.homsdev;

import java.util.Scanner;

public class Solution_min_max_string_comp {
	
	public static String getSmallestAndLargest(String s,int k) {
		String aux;
		String min=s.substring(0,k);
		String max="";
		for(int i=0;i<=s.length()-k;i++) {
			aux=s.substring(i,i+k);
			if(aux.compareTo(min)<0)min=aux;
			if(aux.compareTo(max)>0)max=aux;
		}
		return (min+"\n"+max);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
	}
}
