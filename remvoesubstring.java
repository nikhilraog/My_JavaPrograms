/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

 class Ideone {
	public static String minS(String s, String subs[]){
		System.out.println("String   "+ s );
		boolean found=false;
		for(String ss:subs){
				System.out.println("Substring String  "+ ss );
			if(s.indexOf(ss)>=0){
				System.out.println("Index of first occurence of first substring "+ s.indexOf(ss) );
				String s1=s.substring(0,s.indexOf(ss));
				String s2=s.substring(s.indexOf(ss)+ss.length(),s.length());
				found=true;
				return minS(s1+s2,subs);
			} 
		}
		return s;
		
	}

	public static void main(String[] args){
		//System.out.println("RESULT="+minS("abc",new String[]{"ab","cd"}));
		//System.out.println("RESULT="+minS("abcd",new String[]{"abcd","cd"}));
		System.out.println("RESULT="+minS("ccdaabcdbb",new String[]{"ab","cd"}));
		
	}
	
}
