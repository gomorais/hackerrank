package challenge30Days25;

import java.io.*;
import java.util.*;

import challenge30Days24.Node;

public class Solution {

	public static void checkIfPrime(int number){
		boolean isPrime= true;
		if (number >1){
			for (int i = 2; i<= (int) Math.sqrt((double) number); i++){
				if (number%i == 0){
					isPrime = false;
				}
			}
		} else 
			isPrime = false;
		if (isPrime){
			System.out.println("Prime");
		}else{
			System.out.println("Not prime");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		while(N-->0){
			int ele=sc.nextInt();
			checkIfPrime(ele);
		}
	}

}
