package challenge30Days17;

public class Calculator {
	
	public int power(int n, int p) throws MyException{
		if(n<0 || p<0){
			throw new MyException("n and p should be non-negative");
		} else {
			return (int) Math.pow(n, p);
		}
		
	}

}
