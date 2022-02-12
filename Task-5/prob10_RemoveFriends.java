package ieee;

import java.util.*;

public class prob10_RemoveFriends {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    static Node head = null;

    public static void main(String[] args)throws Exception{
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        for (int i = 0; i < cases; i++) {
            int friends = s.nextInt();
            int delete = s.nextInt();
            head = null;
            Node p =null;
            for(int j=0;j < friends;j++){
                int temp = s.nextInt();
                if(head == null){
                    head = new Node(temp);
                    p = head;
                }
                else{
                    Node q = new Node(temp);
                    p.next = q;
                    p = q;
                }}
            delete_friend(head , delete);
            print_list(head);
        }
    }
    
    static void delete_friend(Node h, int delete){
        Node p = head;
        Node q = null;
        int flag = 0;
        for (int x = 1; x<=delete ; x++){
            p = head;
            flag = 0;
            q = p.next;
            while(p.next != null){
                q = p.next;
                if(p.data < q.data){
                    p.data = q.data;
                    p.next = q.next;
                    flag=1;
                    p = head;
                    break;
                }
                if (flag == 0 && q.next == null){
                    if (p.data >= q.data) {
                        p.next = null;
                        break;
                    }
                }
                p = p.next;
            }
        }
    }
    
    static void print_list(Node head){
        Node tnode = head;
        while (tnode != null){
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
        System.out.println();
    }
}
