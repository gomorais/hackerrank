package challenge30Days16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution3 {
	static int[] arr;
	static StringBuilder str = new StringBuilder();

	public static void computeDifference(int[] arr){
		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length-1; i++){
				int diff = arr[i] - arr[i+1];
				int absDiff = Math.abs(diff);
				if (absDiff<minValue){
					str.setLength(0);
					str.append(arr[i] + " " + arr[i+1]);
					minValue = absDiff;
				}else if(absDiff == minValue) {
					str.append(" " + arr[i] + " " + arr[i+1]);
				} 
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		computeDifference(arr);

	}
}

