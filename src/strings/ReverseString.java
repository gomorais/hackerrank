package strings;

public class ReverseString {
	
	public String easyReverse(String str){
		char [] strArr = str.toCharArray();
		StringBuilder reverseStr = new StringBuilder();
		for (int i =strArr.length-1; i>=0;i--){
			reverseStr.append(strArr[i]);
		}
		return reverseStr.toString();
	}
	
	public String betterReverse(String str){
		char [] strArr = str.toCharArray();
		
		int len = strArr.length;
		for (int i=0; i< len/2;i++){
			char temp = strArr[i];
			strArr[i] = strArr[len-i-1];
			strArr[len-i-1] = temp;
		}
		return String.valueOf(strArr);
	}

}
