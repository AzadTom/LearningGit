package com.azad;



public class DeleteATend {

    public static class Node
    {

        int data;
        Node next;
        Node(int x)
        {
            this.data =x;
            this.next = null;
        }



    }

    public static void main(String[]args)
    {


        Node head =new Node(10);
        head.next =new Node(20);
        head.next.next =new Node(30);
        head.next.next.next =new Node(40);
        head.next.next.next.next =new Node(50);

        head = endAt(head);
        head =endAt(head);

        print(head);



    }

    private static Node endAt(Node head) {


        if (head==null)
        {
            System.out.println("null");
        }
        if (head.next ==null){
            System.out.println("null");
        }

             Node cur = head;
        while (cur.next.next != null)
        {
            cur =cur.next;
        }
        cur.next = null;


        return head;





    }

    private static void print(Node head) {

        Node cur = head;
        while (cur != null)
        {

            System.out.println(cur.data +" ");
            cur =cur.next;

        }
    }
}
