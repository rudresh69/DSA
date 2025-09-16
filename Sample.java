class Node 
{
	int rollno;
	int marks;
	String name;
	Node next;

	Node(int rollno, int marks, String name) 
	{
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
		this.next = null;
	}
}
class LinkedList 
{
	Node head;
	public void insert(int rollno, int marks, String name) 
	{
		Node n1 = new Node(rollno, marks, name);
		if (head == null) 
		{
			head = n1;
			return;
		}
		Node temp = head;
		while (temp.next != null) 
		{
			temp = temp.next;
		}
		temp.next = n1;
	}
	public void delete(int rollno) 
	{
		if (head == null) 
		{
		return; 
		}
		if (head.rollno == rollno) 
		{
		head = head.next;
		return;
		}
		Node temp = head;
		while (temp.next != null && temp.next.rollno != rollno) 
		{
		temp = temp.next;
		}
		if (temp.next != null && temp.next.rollno == rollno) 
		{
		temp.next = temp.next.next;
		}
	}
	public void show() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.rollno + "/" + temp.name + "/" + temp.marks + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
}
class Sample {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.insert(10, 100, "Sarvesh");
		l1.insert(20, 90, "Kushal");
		l1.insert(23, 95, "Vishwajit");
		l1.insert(14, 92, "Rushikesh");

		l1.delete(20);
		l1.delete(10);
		System.out.print("Linked List is: ");
		l1.show();
	}
}
