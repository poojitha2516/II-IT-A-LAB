/* Write a Java program for the following:
i) Create a doubly linked list of elements.
ii) Delete a given element from the above list.
iii) Display the contents of the list after deletion */

import java.io.*;
import java.util.Scanner;

class linkedlist {
	int data;
	linkedlist prev;
	linkedlist next;
	linkedlist(int value) {
		this.data = value;
	}
	void display() {
		System.out.println(data);
	}
}

class linked {
	public linkedlist frstnode,lastnode;
	linked() {
		frstnode = null;
		lastnode = null;
	}
	// creating linked list
	// Insert node at Beggining
	void insert_front(int value) {
		linkedlist node = new linkedlist(value);
		if(frstnode == null) {
			node.prev = node.next = null;
			frstnode = lastnode = node;
			System.out.println("Linkedlist is Created..");
			System.out.println(" ");
		}
		else {
			node.prev = null;
			node.next = frstnode;
			frstnode.prev = node;
			frstnode = node;
			System.out.println("Node is Inserted at the beggining..");
			System.out.println(" ");
		}
	}
	
	// creating linked list
	// Insert node at the end
	void insert_end(int value) {
		linkedlist node = new linkedlist(value);
		if(frstnode == null) {
			node.prev = node.next = null;
			frstnode = lastnode = node;
			System.out.println("Linkedlist is Created..");
			System.out.println(" ");
		}
		else {
			node.next = null;
			node.prev = lastnode;
			lastnode.next = node;
			lastnode = node;
			System.out.println("Node is Inserted at the End..");
			System.out.println(" ");
		}
	}
	
	// Deleting node
	void delete() {
		int count = 0,num,i;
		linkedlist node,node1,node2;
		Scanner sc = new Scanner(System.in);
		for(node = frstnode;node != null;node = node.next) {
			count++;
		}
		display();
		node = node1 = node2 = frstnode;
		System.out.println("Enter the node which you want to delete from ascending order : ");
		num = Integer.parseInt(sc.nextLine());
		System.out.println(" ");
		if(num != 1) {
			if(num < count && num > 0) {
				for(i=2;i<=num;i++) {
					node = node.next;
				}
				for(i=2;i<=num-1;i++) {
					node1 = node1.next;
				}
				for(i=2;i<=num+1;i++) {
					node2 = node2.next;
				}
				node2.prev = node1;
				node1.next = node2;
				node.prev = null;
				node.next = null;
				node = null;
			}
			else if(num == count) {
				node = lastnode;
				lastnode = node.prev;
				lastnode.next = null;
				node = null;
			}
			else {
				System.out.println("Invalid !");
			}
		}
		else {
			node = frstnode;
			frstnode = node.next;
			frstnode.prev = null;
			node = null;
		}
		System.out.println("Node has been deleted..");
		System.out.println(" ");
	}
	
	// Display 
	void display() {
		linkedlist node = frstnode;
		System.out.println("Nodes in Ascending Order : ");
		while(node != null) {
			node.display();
			node = node.next;
		}
		System.out.println(" ");
		node = lastnode;
		System.out.println("Nodes in Descending Order : ");
		while(node != null) {
			node.display();
			node = node.prev;
		}
		System.out.println(" ");
	}
}

public class Doublylinkedlist {
	public static void main(String args[]) {
		linked list = new linked();
		Scanner sc = new Scanner(System.in);
		int op = 0;
		while(op != 5) {
			System.out.println("1.Insert at front   2.Insert at end   3.Delete   4.Display   5.Exit");
			System.out.print("Enter ur choice : ");
			op = Integer.parseInt(sc.nextLine());
			switch(op) {
				case 1:
					System.out.print("Enter the node to be Inserted : ");
					list.insert_front(Integer.parseInt(sc.nextLine()));
					break;
				case 2:
					System.out.print("Enter the node to be Inserted : ");
					list.insert_end(Integer.parseInt(sc.nextLine()));
					break;
				case 3:
					list.delete();
					break;
				case 4:
					list.display();
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice !!");
			}
		}
	}
}
