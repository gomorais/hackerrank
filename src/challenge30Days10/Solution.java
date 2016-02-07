package challenge30Days10;

import java.io.*;
import java.util.*;

public class Solution {
	
	public static void convertToBinary(int n){
		System.out.println(Integer.toString(n,2));
	}
	
	public static Stack<Integer> convertToBinary2(int n, Stack<Integer> stack){
		if (n ==0){
			return stack;
		} else {
			int d = n % 2;
		    stack.push(d);
		    n /= 2;
			return convertToBinary2(n, stack);
		}
		
	}
	
	public static void printStack(Stack<Integer> stack){
		while(!stack.isEmpty()){
			int i = stack.pop();
			System.out.print(i);
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		// Take Input
		int n=sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			//convertToBinary(number);
			stack = convertToBinary2(number, stack);
			printStack(stack);
		}
	}

}
