package challenge30Days1;

import java.lang.reflect.Field;

public class Day1 {
	
	double first = 5.35;
	char a = 'a';
	boolean one = false;
	int cem = 100;
	String monkey = "I am a code monkey";
	boolean two = true;
	double second = 17.3;
	char c = 'c';
	String derp = "derp";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1 day1 = new Day1();
		for (Field f : day1.getClass().getDeclaredFields()) {
			if (f.getType().isPrimitive()){
				System.out.println("Primitive : " + f.getType());
			}else {
				System.out.println("Referenced : " + f.getType());
			}
				
			
		}

	}

}
