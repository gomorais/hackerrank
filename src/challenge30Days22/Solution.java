package challenge30Days22;

import java.util.*;
import java.io.*;

public class Solution {

	public static int getHeight(Node root){
		//Write your code here
		if(root == null){
			return 0;
		}
		
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		if(left>right){
			return left+1;
		}else{
			return right+1;
		}
	}	

	public static Node insert(Node root,int data){
		if(root==null){
			return new Node(data);
		}
		else{
			Node cur;
			if(data<=root.data){
				cur=insert(root.left,data);
				root.left=cur;
			}
			else{
				cur=insert(root.right,data);
				root.right=cur;
			}
			return root;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		Node root=null;
		while(T-->0){
			int data=sc.nextInt();
			root=insert(root,data);
		}
		int height=getHeight(root);
		System.out.println(height);
	}

}
