package challenge30Days16;

import java.io.*;
import java.util.*;

public class Solution2 {
	
	static List<Integer> sortedList = new ArrayList<Integer>();
	static StringBuilder str = new StringBuilder();
	
	public static void computeDifference(List<Integer> sortedList){
		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < sortedList.size(); i++){
  			for (int j = i+1; j < sortedList.size(); j++){
  				int diff = sortedList.get(i) - sortedList.get(j);
  				int absDiff = Math.abs(diff);
  				if (absDiff<minValue){
  					str.setLength(0);
  					str.append(sortedList.get(i) + " " + sortedList.get(j));
  					minValue = absDiff;
  				}else if(absDiff == minValue) {
  					str.append(" " + sortedList.get(i) + " " + sortedList.get(j));
  				} 
  				
  			}
  		}
		System.out.println(str);
  	}
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	for (int i = 0; i < N; i++) {
    		sortedList.add(sc.nextInt());
    	}
    	sortedList.sort(new Comparator<Integer>() {
    	    @Override
    	    public int compare(Integer a, Integer b) {
    	        return a.compareTo(b);
    	    }});
    	computeDifference(sortedList);
    	
    }

}
