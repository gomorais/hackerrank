package challenge30Days21;

public class Printer {
	
	public <T> void printArray(T[] arr){
		for (T item: arr){
			System.out.println(item);
		}
	}

}
