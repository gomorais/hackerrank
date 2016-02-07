package challenge30Days5;

import java.io.*;
import java.util.*;

import challenge30Days4.Person;

public class Solution {
	
	public static void calculation(int a, int b, int n){
		int j =0;
		while(j<n){
			int result = 0;
			for (int i=0;i<=j;i++){
				result += Math.pow(2, i)*b;
			}
			result += a;
			System.out.print(result + " ");
			j++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			calculation(a,b,n);
			System.out.println();
		}

	}

}
