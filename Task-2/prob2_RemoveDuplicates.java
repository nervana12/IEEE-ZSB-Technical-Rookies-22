



package ieee;

import java.util.LinkedList;
import java.util.Scanner;

public class prob2_RemoveDuplicates {
    Node head;
    class Node{
	int data;
	Node next;
	Node(int d) {data = d; next = null; }
    }
    public static void main(String args[]){
	LinkedList llist = new LinkedList();
        System.out.println("Enter the length of the sorted list:");
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        System.out.println("Enter the sorted list:");
        for (int i=0;i<l;i++){
            int a = input.nextInt();
            llist.push(a);
        }
        //llist.RemoveDuplicates();
	//llist.PrintList();
    }
    void RemoveDuplicates(){
	Node curr = head;
        while (curr != null) {
            Node temp = curr;
            while(temp!=null && temp.data==curr.data) {
		temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
	}
    }
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void PrintList(){
	Node temp = head;
	while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
	}
	System.out.println();
    }
}