package Programs;

class Node
{
	int data;
	Node left;
	Node right;
}

public class BinaryTree 
{
 Node head=null;
 
 public void add(int data)
 {
	 Node newn=new Node();
	 newn.left=null;
	 newn.right=null;
	 if(head==null)
	 {
		 head=newn;
	 }
	 
	 Node temp=head;
	 while(temp!=null)
	 {
		 if(data<temp.data)
		 {
			 if(temp.left==null)
				 temp.left=newn;
				 
		 }
		 if(data>temp.data)
		 {
			 if(temp.right==null)
				 temp.right=newn;
		 }
		
	 }
 }
	
}
