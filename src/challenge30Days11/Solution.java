package challenge30Days11;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	public int countHourglass(int arr[][], int size){
		int total= Integer.MIN_VALUE;
		for (int i =1; i<size-1;i++){
			for (int j=1; j<size-1;j++){
				int row1 = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1];
				int row2 = arr[i][j];
				int row3 = arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
				int rows = row1 + row2 + row3;
				System.out.println("rows = " + row1 + " + " + row2 + " + " + row3);
				if (rows>total){
					total = rows;
				}
			}
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        Solution solution = new Solution();
        int maxNr = solution.countHourglass(arr, 6);
        System.out.println(maxNr);
	}
}
