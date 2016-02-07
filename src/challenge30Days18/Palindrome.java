package challenge30Days18;

import java.io.*;
import java.util.*;

public class Palindrome {
	
	private Deque<Character> stack;
	private LinkedList<Character> queue;
	
	public Palindrome() {
		this.stack = new ArrayDeque<Character>();
		this.queue = new LinkedList<Character>();
	}

	void pushCharacter(char ch) {
		//Pushes a character onto a stack.
		stack.push(ch);
	}
	
	void enqueueCharacter(char ch){
		//Enqueues a character in a queue.
		queue.add(ch);
	}
	
	char popCharacter(){
		//Pops and returns the top character.
		return stack.pop();
	}
	
	char dequeueCharacter(){
		//Dequeues and returns the first character.
		return queue.removeFirst();
	}

}
