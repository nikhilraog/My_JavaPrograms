/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Lpalisubseq
{	
	
	public static String longestPalindrome2(String s) {
	if (s == null)
		return null;
 
	if(s.length() <=1)
		return s;
 
	int maxLen = 0;
	String longestStr = null;
	
	int length = s.length();
	
 	int[][] table = new int[length][length];
 	
 	for(int i= 0 ; i<length; i++){
 		table[i][i] = 1;
  	}
  	
  	System.out.println("----******-----");
  	
    printTable(table);
    
    System.out.println("----******-----");
 
	//e.g. bcba
	//two consecutive same letters are palindrome
	for (int i = 0; i <= length - 2; i++) {
		if (s.charAt(i) == s.charAt(i + 1)){
			table[i][i + 1] = 1;
			longestStr = s.substring(i, i + 2);
		}	
	}
	printTable(table);
	//condition for calculate whole table
	for (int l = 3; l <= length; l++) {
		for (int i = 0; i <= length-l; i++) {
			int j = i + l - 1;
			if (s.charAt(i) == s.charAt(j)) {
				table[i][j] = table[i + 1][j - 1];
				if (table[i][j] == 1 && l > maxLen)
					longestStr = s.substring(i, j + 1);
			} else {
				table[i][j] = 0;
			}
			printTable(table);
		}
	}
 
	return longestStr;
}
public static void printTable(int[][] x){
	for(int [] y : x){
		for(int z: y){
			System.out.print(z + " ");
		}
		System.out.println();
	}
	System.out.println("------");
 
}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		longestPalindrome2("likk");
	}
}
