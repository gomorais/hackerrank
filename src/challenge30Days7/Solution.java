package challenge30Days7;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	public void printReverseArr(int arr[]){
		for (int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
        }
        Solution solution = new Solution();
        solution.printReverseArr(arr);

	}

}
