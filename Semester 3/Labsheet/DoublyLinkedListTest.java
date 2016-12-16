class Node
{
	public int data;
	public Node next;
	public Node prev;

	public Node (int d)
	{
		data = d;
	}
	public void displayNode()
	{
		System.out.print(data+ " ");
	}
}
class DoublyLinkedList
{
	private Node first;
	private Node last;

	public DoublyLinkedList()
	{
		first = null;
		last = null;
	}
	public boolean isEmpty()
	{
		return first == null;
	}
	public void insertFirst(int d)
	{
		Node n = new Node(d);
		if(isEmpty())
			last=n;
		else
			first.prev = n;

		n.next = first;
		first = n;
	}

	public void insertLast(int d)
	{
		Node n = new Node(d);

		if(isEmpty())
			first = n;
		else
		{
			last.next = n;
			n.prev = last;
		}
		last = n;
	}

	public Node deleteFirst()
	{
		Node temp = first;
		if(first.next == null)
			last = null;
		else
			first.next.prev = null;
		first = first.next;
		return temp;
	}

	public Node deleteLast()
	{
		Node temp = last;
		if(first.next == null)
			first = null;
		else
			last.prev.next = null;
		last = last.prev;
		return temp;
	}

	public boolean insertAfter(double key, int d)
	{
		Node current = first;
		while(current.data != key)
		{
			current = current.next;
			if(current == null)
				return false;
		}

		Node n = new Node(d);
		if(current == last)
		{
			n.next = null;
			last = n;
		}
		else
		{
			n.next = current.next;
			current.next.prev = n;
		}
		n.prev = current;
		current.next = n;
		return true;
	}

	public Node deleteKey(double key)
	{
		Node current = first;
		while(current.data != key)
		{
			current = current.next;
			if(current == null)
				return null;
		}
		if(current == first)
			first = current.next;
		else
			current.prev.next = current.next;
		if(current == last)
			last = current.prev;
		else
			current.next.prev = current.prev;
		return current;
	}

	public void displayForward()
	{
		System.out.print("List :");
		Node current = first;
		while(current != null)
		{
			current.displayNode();
			System.out.print("<->");
			current = current.next;
		}

		System.out.println(" ");
	}

	public void displayBackward()
	{
		System.out.println("List :");
		Node current = last;
		while(current != null)
		{
			current.displayNode();
			System.out.print("<->");
			current = current.prev;
		}

		System.out.println(" ");
	}
}

class DoublyLinkedListTest{
	public static void main(String args[])
	{
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertFirst(10);
		list.insertLast(20);
		list.displayForward();
		list.insertFirst(5);
		list.insertLast(30);
		list.displayBackward();
		list.deleteFirst();
		list.deleteLast();
		list.displayForward();
		list.insertAfter(20,25);
		list.displayForward();
		list.insertAfter(20,40);
		list.displayForward();
		list.deleteKey(20);
		list.displayBackward();
	}
}
