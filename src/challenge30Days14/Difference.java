package challenge30Days14;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Difference {
	private int[] elements;
  	public int maximumDifference;
	
  	public Difference(int[] elements) {
		this.elements = elements;
	}
	
  	public void computeDifference(){
  		this.maximumDifference =0;
  		for (int i = 0; i<elements.length; i++){
  			for (int j=0; j<elements.length; j++){
  				int diff = elements[i] - elements[j];
  				int absDiff = Math.abs(diff);
  				if (absDiff> this.maximumDifference){
  					this.maximumDifference = absDiff;
  				}
  			}
  		}
  	}

}
