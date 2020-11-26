package com.homsdev;

import java.util.*;

public class Solution_String_reversed {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reversed="";
        
        for(int i=A.length()-1;i>=0;i--) {
        	reversed+=A.charAt(i);
        }
        
        System.out.println(reversed.compareToIgnoreCase(A)== 0 ? "Yes":"No");
        sc.close();
	}

}
