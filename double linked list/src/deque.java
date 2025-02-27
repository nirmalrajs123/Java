import java.util.Scanner;
public class deque {
public static void main(String arg[]) {
	Scanner s=new Scanner(System.in);
	doublelinklist list=new doublelinklist();
	System.out.println("Enter no nodes");
	int n=s.nextInt();
	for(int i=0;i<n;i++) {
		System.out.println("Enter the data");
		int data=s.nextInt();
		list.addnode(data);
	}
	list.display();
	System.out.println("Enter no nodes to delete");
	int n1=s.nextInt();
	for(int i=0;i<n1;i++) {
		list.delete();
	}
	System.out.println("After deletion list");
	list.display();
}
}
class doublelinklist{
	class node{
		int data;
		node left;
		node right;
   node(int data){
	   this.data=data;
   }
	}
	node head,tail=null;
	private int item;
	void addnode(int data) {
		node newnode=new node(data);
		if(head==null) {
			head=newnode;
			tail=newnode;
			head.left=null;
			tail.right=null;
		}else {
			tail.right=newnode;
			newnode.left=tail;
			tail=newnode;
			tail.right=null;
		}
	}
	void delete() {
		if(head==null) {
			System.out.println("detetion not possible list is empty");
		}else {
			item=tail.data;
			tail=tail.left;
			tail.right=null;
			
		}
	}
	void display() {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			node current=head;
			while(current!=null) {
				System.out.println(current.data);
				current=current.right;
			}
		}
	}
}
