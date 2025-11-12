package basic;

class Node
{
	int data;
	Node left;
	Node right;
}

class BinarySearchTree
{
	Node head;
	int count;
	
	public void insertNode(int data1)
	{
		Node newn =new Node();
		newn.left=null;
		newn.right=null;
		newn.data=data1;
		
		if(head==null)
		{
		  head=newn;	
		  System.out.println("main node"+data1);
		  
		}
		else
		{
			Node temp=head;
			while(true)
			{
				if(temp.data==data1)
				{
					System.out.println("duplicate node"+data1);
					break;
					
				}
				if(data1<temp.data)
				{
					if(temp.left==null)
					{
						temp.left=newn;
						System.out.println("left node"+data1);
						this.count++;
						break;
					}
					temp=temp.left;
					
				}
				 if(data1>temp.data)
				{
					if(temp.right==null)
					{
						temp.right=newn;
						System.out.println("right node"+data1);
						this.count++;
						break;
					}
					temp=temp.right;
					
				}
			}
		}
	}
	
	public boolean searchNode(int data1)
	{
		boolean flag=false;
		if(head==null)
		{
			return false;
		}
		else
		{
			Node temp=head;
			while(temp!=null)
			{
				if(temp.data==data1)
				{
					flag=true;
					break;
				}
				else if(data1<temp.data)
				{
					temp=temp.left;
				}
				else if(data1>temp.data)
				{
					temp=temp.right;
				}
			}
		}
		return flag;
	}
}


class Revision
{
	public static void main(String[] args) 
	{
		BinarySearchTree bst=new BinarySearchTree();
		bst.insertNode(55);
		bst.insertNode(27);
		bst.insertNode(35);
		bst.insertNode(75);
		bst.insertNode(105);
		System.out.println(bst.searchNode(27));
		System.out.println(bst.searchNode(21));
	}
}