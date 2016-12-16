import java.util.Scanner;
//class node
class Node
{
	public int data;
	public Node link;
	//constructor
	public Node()
	{
		link = null;
		data = 0;
	}
	// constructor with 2 parameters
	public Node(int d,Node n)
	{
		data = d;
        	link = n;
	}
}
//class  linkedList
class linkedList
{
	public Node head;
	public int size=0;
	//construtor
	public linkedList()
	{
		head = null;		
	}
	
	public void insertAtEnd(int val)
	{
		Node n = new Node(val,null);
		Node t=head;
		if(t == null)
			head = n;
		else
		{
			while(t.link != null)
				t=t.link;

			t.link = n;
		}
		size++;
	}
	//Function to insert at beginning
	public void insertAtBeg(int val)
	{
		Node n = new Node(val,null);
		Node t = head;
		
		if(t == null)
			head =n;
		else
		{
			n.link = head;
			head = n;
		}
		size++;
	}
    
	//  Function to insert an element  
    	public void insertAtPosition(int val , int pos)
    	{
        	Node n = new Node(val,null);
		Node t = head;
		Node tmp;

		if (t==null)
			head = n;
		else
		{
			while(t.link!=null)
			{
				tmp = t.link;
				if(tmp.data == pos)
				{
					t.link=n;
					n.link=tmp;
				}
				t = t.link;
			}
		}
		size++;
    	}
    	// Function to delete 
   	 public void deleteAtPosition(int pos)
   	 {      
		Node n ;
		Node t = head;
		while(t.link != null)
		{
			n=t.link;
			if(n.data == pos)
				t.link = n.link;
			t = t.link;
		}
       		size--;
   	 } 
	// function to display
	public void display()
	{
		Node h = head;
		while(h!=null)
			{System.out.print("Singly Linked List = "+h.data);
			System.out.println();
			h = h.link;}
	}
	public boolean isEmpty()
	{
		if(head == null)
			return true;
		else
			return false;
	}
	public int getsize()
	{
		return size;
	}
}	
//class SinglyLinkedList
public class SinglyLinkedList
{
	public static void main(String[] args)
	{

		linkedList list = new linkedList();
		list.insertAtBeg(20);
		list.insertAtEnd(30);
		list.insertAtBeg(10);
		list.insertAtEnd(50);
		list.display();
		list.insertAtPosition(40,50);
		list.deleteAtPosition(30);
		list.display();
		int i = list.getsize();
		System.out.println(i);
	}
}
