class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}

class LinkedList
{
	Node head;
	public void insert(int data)
	{
		Node n1 = new Node(data);
		if(head == null)
		{
			head = n1;
			return;
		}
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = n1;
	}
	
	public void show()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null");
	}
}

class Sample
{
	public static void main(String []args)
	{
		LinkedList l1 = new LinkedList();
		l1.insert(10);
		l1.insert(20);
		l1.insert(23);
		l1.insert(14);
		
		System.out.print("Linked List is:");
		l1.show();
	}
}
