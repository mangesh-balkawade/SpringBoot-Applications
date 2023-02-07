//package datastructure;
//
//class Node
//{
//	int data;
//	Node next;
//}
//
//class LinkedList
//{
//	int count=0;
//	Node head=null;
//	
//	public void insertFirst(int data1)
//	{
//		Node newn=new Node();
//		newn.next=null;
//		newn.data=data1;
//		
//		if(head==null)
//		{
//			head=newn;
//		}
//		else
//		{
//			newn.next=head;
//			head=newn;
//		}
//		this.count++;
//	}
//	
//	public void insertLast(int data1)
//	{
//
//		Node newn=new Node();
//		newn.next=null;
//		newn.data=data1;
//		if(head==null)
//		{
//			head=newn;
//		}
//		else
//		{
//			Node temp=head;
//			while(temp.next!=null)
//			{
//				temp=temp.next;
//			}
//			temp.next=newn;
//		}	
//		this.count++;
//	}
//	
//	public void insertBetween(int data1,int pos)
//	{
//		Node newn=new Node();
//		newn.next=null;
//		newn.data=data1;
//		if(head==null)
//		{
//			head=newn;
//		}
//		else
//		{
//			Node temp=head;
//			for(int i=1;i<pos-1;i++)
//			{
//				temp=temp.next;
//			}
//			newn.next=temp.next;
//			temp.next=newn;
//		}
//	}
//	
//	public void deletefirst()
//	{
//		if(head==null)
//		{
//			
//		}
//		else
//		{
//			head=head.next;
//			this.count--;
//		}
//		
//	}
//	
//	public void deleteLast()
//	{
//		if(head==null)
//		{
//			
//		}
//		else
//		{
//			Node temp=head;
//			while(temp.next.next!=null)
//			{
//				temp=temp.next;
//			}
//			temp.next=null;
//			this.count--;
//		}
//	}
//	
//	public void deleteBetween(int pos)
//	{
//		if(head==null)
//		{
//			
//		}
//		else
//		{
//			Node temp=head;
//			for(int i=1;i<pos-1;i++)
//			{
//				temp=temp.next;
//			}
//			temp.next=temp.next.next;
//		}
//	}
//	
//	public void display()
//	{
//		Node temp=head;
//		while(temp!=null)
//		{
//			System.out.print(temp.data+"->");
//			temp=temp.next;
//		}	
//	}
//}
//
//public class LinkedListTester 
//{
//public static void main(String[] args) {
//	LinkedList l1=new LinkedList();
//	l1.insertFirst(1);
//	l1.insertLast(2);
//	l1.insertBetween(3, 2);
//	l1.deleteBetween(2);
//	l1.deleteLast();
//	l1.deletefirst();
//	l1.display();
//}
//}
