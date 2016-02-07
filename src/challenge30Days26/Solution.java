package challenge30Days26;

import java.io.*;
import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Solution {
	
	public static int calculateFine(Calendar actDate, Calendar expDate){
		if (actDate.before(expDate)){
			return 0;
		} else {
			int expY = expDate.get(Calendar.YEAR);
			int actY = actDate.get(Calendar.YEAR);
			if (expY == actY){
				int expM = expDate.get(Calendar.MONTH);
				int actM = actDate.get(Calendar.MONTH);
				System.out.println(expM);
				System.out.println(actM);
				if (expM == actM){
					int expD = expDate.get(Calendar.DATE);
					int actD = actDate.get(Calendar.DATE);
					return 15 * (actD - expD);
				}
				else {
					return 500 * (actM - expM);
				}
			}else {
				return 10000;
			}
		}
	}
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int d1=sc.nextInt();
		int m1=sc.nextInt();
		int y1=sc.nextInt();
		int d2=sc.nextInt();
		int m2=sc.nextInt();
		int y2=sc.nextInt();
		Calendar actDate = Calendar.getInstance();
		actDate.set(y1, m1-1, d1);
		System.out.println(actDate);
		System.out.println(actDate.get(Calendar.MONTH));
		Calendar expDate = Calendar.getInstance();
		expDate.set(y2, m2-1, d2);
		int fine = calculateFine(actDate, expDate);
		System.out.println(fine);
		
    }

}
