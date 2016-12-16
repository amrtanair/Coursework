
import java.util.Scanner;
class Node
{
	public int data;
	public Node next;
	public Node()
	{
		next = null;
		data = 0;
	}
	public Node(int d , Node n)
	{
		data = d;
		next = n;
	}
}
