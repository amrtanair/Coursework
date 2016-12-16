/*u4cse15208
amrita h nair
*/

import java.util.Scanner;


public class CircularlinkedList
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		ClinkedList list = new ClinkedList();
		System.out.println("Circular Singly Linked List Test");
		char ch;
		do
		{
			System.out.println("\nCircular Singly Linkedlist operations");
			System.out.println("1. insert at beginning");
			System.out.println("2. insert at end");
			System.out.println("3. delete at end");
			System.out.println("4. delete at head");
			System.out.println("5. delete at position");

			int choice = s.nextInt();
			switch(choice)
			{
				case 1 : System.out.println("Enter data");
					 list.insert_at_head(s.nextInt());
					 list.display();
					 break;
				case 2 : System.out.println("Enter data ");
					 list.insert_at_end(s.nextInt());
					 list.display();
					 break;
				case 3 : list.delete_at_end();
					 list.display();
					 break;
				case 4 : list.delete_at_head();
					 list.display();
					 break;
				case 5 : System.out.println("Enterposition");
					 list.delete_at_position(s.nextInt());
					 list.display();
					 break;

			}
			System.out.println("\nDo you want to continue (Type y or n) ");
			ch = s.next().charAt(0);
		}while(ch == 'Y'|| ch== 'y');
		int cn = list.countNode();
		System.out.println("count of the nodes : "+cn) ;
	}
}



