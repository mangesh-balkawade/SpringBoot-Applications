package datastructure;

class Node
{
	int data;
	Node lchild;
	Node rchild;
}

class BinarySearchTree
{
	Node head=null;
	
	public void addNode(int data1)
	{
		Node newn=new Node();
		newn.data=data1;
		newn.lchild=null;
		newn.rchild=null;
		if(head==null)
		{
			head=newn;
			return;
		}
		Node temp=head;
	
	while(true)
	{
		
		if(temp.data==data1)
		{
		System.out.println("Data Is aleready Present; "+data1 );
		 newn=null;	
		 break;
		}
		else if(data1<temp.data)
		{
			if(temp.lchild==null)
			{
				temp.lchild=newn;
				System.out.println("lchild "+data1);
				break;
			}
			temp=temp.lchild;
		}
		else if(data1>temp.data)
		{
			if(temp.rchild==null)
			{
				temp.rchild=newn;
				System.out.println("rchild "+data1);
				break;
			}
			temp=temp.rchild;
		}
	}
	
	}
	
	public boolean searchNode(int data1)
	{
		boolean flag=false;
		Node temp=head;
		if(head==null)
		{
			return false;
		}
		else
		{
		while(temp!=null)
		{
		   	if(temp.data==data1)
		   	{
		   		flag=true;
		   		System.out.println("data found in ");
		   		break;
		   	}
		   	else if(data1<temp.data)
		   	{
		   	  
		   	  temp=temp.lchild;
		   	}
		   	else if(data1>temp.data)
		   	{
		   	  
		   	  temp=temp.rchild;
		   	}
		}
		return flag;
		}
	}
}


public class BinarySearchTreeTester 
{
public static void main(String[] args) 
{
  BinarySearchTree bst=new BinarySearchTree();
  bst.addNode(24);
  bst.addNode(120);
  bst.addNode(37);
  bst.addNode(23);
  bst.addNode(29);
  bst.addNode(12);
  
  System.out.println(bst.searchNode(33));
}
}
