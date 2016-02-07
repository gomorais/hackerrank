package challenge30Days29;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
	public static void checkIfFunny(char [] strArr){
		String result = "Funny";
		for (int i =0; i<=strArr.length -2; i+=2){
			int compareB = (int)strArr[i+1] - (int)strArr[i];
			int first = Math.abs(compareB);
			int compareE = (int)strArr[strArr.length-i-2] - (int)strArr[strArr.length-i-1];
			int second = Math.abs(compareE);
			if (!(first == second)){
				result = "Not Funny";
				break;
			}
		}
		System.out.println(result);
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		while(N-->0){
			String str=sc.next();
			char [] strArr = str.trim().replace("\n","").toCharArray();
			checkIfFunny(strArr);
		}
    }
}
