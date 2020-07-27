import java.util.*;
class linkedlist{
    Node head;
	  static class Node{
	     int data;
		 Node next;
		 Node(int d){
		 data=d;
		 next=null;
		 }
		 }
		 void display(){
			 Node n=head;
			 while(n!=null){
				 System.out.println(""+n.data);
				 n=n.next;
			 }
		 }
		  
		 void push(int m){
			 Node new_node=new Node(m);
			 new_node.next=head;
			 head=new_node;
		 }
			 
		public static void main(String...args){
		linkedlist l=new linkedlist();
		l.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		l.head.next=second;
		second.next=third;
		l.display();
		l.push(5);
		}
		}
