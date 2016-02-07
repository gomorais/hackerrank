package challenge30Days16;

import java.io.*;
import java.util.*;

public class Solution {
	
	static List<Integer> sortedList = new ArrayList<Integer>();
	static HashMap<Integer,List<Integer>> map = new HashMap<Integer, List<Integer>>();
	
	public static void computeDifference(List<Integer> sortedList){
		List<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < sortedList.size(); i++){
  			for (int j = i+1; j < sortedList.size(); j++){
  				int diff = sortedList.get(i) - sortedList.get(j);
  				int absDiff = Math.abs(diff);
  				if (map.containsKey(absDiff)){
  					List<Integer> current = map.get(absDiff);
  					current.add(sortedList.get(i));
  					current.add(sortedList.get(j));
  				}else {
  					List<Integer> current = new ArrayList<Integer>();
  					current.add(sortedList.get(i));
  					current.add(sortedList.get(j));
  					map.put(absDiff, current);
  				}
  			}
  		}
  	}
	
	public static int orderList(){
		List<Integer> sortedKeys=new ArrayList<Integer>(map.keySet());
		Collections.sort(sortedKeys);
		return sortedKeys.get(0);
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
    	
    	int key = orderList();
    	List<Integer> current = map.get(key);
    	for (int i=0; i < current.size(); i+=2){
    		System.out.print(current.get(i) +" ");
    		System.out.print(current.get(i+1) +" ");
    	}
    	
    }

}
