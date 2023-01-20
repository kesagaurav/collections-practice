import java.util.*;
public class LinkedList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	
	private Node head;
	private Node tail;
	private Node temp;
	private Node curr;
	private Node slow;
	private Node fast;
	public void create(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public void removeDuplicates() {
		curr=head;
		while(curr!=null && curr.next!=null) {
			if(curr.data==curr.next.data) {
				curr.next=curr.next.next;
			}else {
				curr=curr.next;
			}
		}
		
	}
	
	public void pairwiseswap() {
		Node curr=head;
		while(curr!=null &&curr.next!=null) {
			int temp=curr.data;
			curr.data=curr.next.data;
			curr.next.data=temp;
			curr=curr.next.next;
		}
		
	}
	
	public Node MergeList(Node a,Node b) {
		if(a==null)
			return b;
		if(b==null) {
			return a;
		}
		head=tail=null;
		if(a.data<=b.data) {
			head=tail=a;
			a=a.next;
		}else {
			head=tail=b;
			b=b.next;
		}
		while(a!=null && b!=null) {
			if(a.data<=b.data) {
				tail.next=a;
				tail=a;
				a=a.next;
				
			}else {
				tail.next=b;
				tail=b;
				b=b.next;
			}
		}
		if(a==null) {
			tail.next=b;
		}else {
			tail.next=a;
		}
		return head;
	}
	
	
	public void middleofLinkedList() {
		if(head==null) return;
		Node slow=head,fast=head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println( "\n the value is " + slow.data);
	}
	
	
	public void display() {
		temp=head;
		while(temp!=null) {
			System.out.printf(" " + temp.data);
			temp=temp.next;

		}
	}
	
	
}
