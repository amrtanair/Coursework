
import java.util.Scanner;
class ClinkedList
{
	public Node head;
	public int size;
	public int countnode = 0;
	public ClinkedList()
	{
		head = null;
	}
	public int getSize()
	{
		int count = 0;
		Node tmp = head;
		while(tmp.next != head)
		{
			count++;
			tmp = tmp.next;
		}
		return count+1;
	}
	public void insert_at_head(int x)
	{
		Node n = new Node(x,null);
		countNode();
		if(head == null)
		{
			head = n;
			n.next = head;
		}
		else
		{
			Node tmp = head;
			while(tmp.next != head)
				tmp = tmp.next;
			n.next = head;
			tmp.next = n;
			head = n;
		}
	}
	public void insert_at_end(int x)
	{
		Node n = new Node(x,null);
		countNode();
		Node tmp = head;
		if(head == null)
		{
			head = n;
			n.next = head;
		}
		else
		{
			while(tmp.next != head)
				tmp = tmp.next;
			tmp.next = n;
			n.next = head;
		}
	}

	public void delete_at_position(int pos)
	{
		Node tmp = head;
		Node prev = tmp;



            if(pos == 1)
            {
                delete_at_head();


            }

            else
            {
                int i =1;
                while(i != pos)
                {
                    prev = tmp;
                    tmp = tmp.next;
                    i++;
                }
                prev.next = tmp.next;
            }


	}
	public void delete_at_end()
	{
		Node tmp = head;
		Node prev = tmp;
		while(tmp.next.next != head)
		{
			tmp = tmp.next;

		}
		tmp.next = head;

	}
	public void delete_at_head()
	{
		Node tmp = head;
		while(tmp.next != head)
		{
			tmp = tmp.next;
		}
		tmp.next = head.next;
		head = head.next;

	}
	public void checkEmpty()
	{
		if(head == null)
			System.out.println("list is empty");
		else
			System.out.println("not empty");
	}
	public void display()
	{
		System.out.println("Singly linked list = ");
		Node tmp = head;
		while(tmp.next != head)
		{
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
		System.out.println(tmp.data);
	}
	public int countNode()
	{
		return countnode++;
	}



}
