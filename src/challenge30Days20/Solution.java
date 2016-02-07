package challenge30Days20;

import java.io.*;
import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String input = sc.nextLine();
		//String str = input.replaceAll("\\W", " ");
		//StringTokenizer st = new StringTokenizer(str);
		//System.out.println(st.countTokens());
	    //while (st.hasMoreTokens()) {
	    //    System.out.println(st.nextToken());
	    //}
	    String [] input = sc.nextLine().trim().split("[^a-zA-Z]+"); 
	    System.out.println(input.length);
	    for (String i: input){
	    	System.out.println(i);
	    }

	}

}
