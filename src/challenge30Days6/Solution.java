package challenge30Days6;

import java.io.*;
import java.util.*;

public class Solution {
	
	public void makeStaircase(int steps){
		for (int i=1;i<=steps;i++){
			for(int j=steps;j>0;j--){
				if (j>i){
					System.out.print(" ");
				} else{
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Solution solution = new Solution();
		solution.makeStaircase(T);
		

	}

}
