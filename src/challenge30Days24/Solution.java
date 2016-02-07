package challenge30Days24;

import java.io.*;
import java.util.*;

public class Solution {

	public static Node removeDuplicates(Node head) {
		//Write your code here
		LinkedList<Integer> seenData = new LinkedList<Integer>();
		Node curr = head;
		seenData.add(head.data);
		while(curr.next!=null){
			if (seenData.contains(curr.next.data)){
				curr.next = curr.next.next;
			} else {
				seenData.add(curr.next.data);
				curr = curr.next;
			}
		}
		return head;
	}

	public static  Node insert(Node head,int data)
	{
		Node p=new Node(data);			
		if(head==null)
			head=p;
		else if(head.next==null)
			head.next=p;
		else
		{
			Node start=head;
			while(start.next!=null)
				start=start.next;
			start.next=p;

		}
		return head;
	}
	public static void display(Node head)
	{
		Node start=head;
		while(start!=null)
		{
			System.out.print(start.data+" ");
			start=start.next;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Node head=null;
		int T=sc.nextInt();
		while(T-->0){
			int ele=sc.nextInt();
			head=insert(head,ele);
		}
		head=removeDuplicates(head);
		display(head);

	}
}
