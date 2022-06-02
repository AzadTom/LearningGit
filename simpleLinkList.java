package com.azad;

public class simpleLinkList {


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

        Node head  = null;

        head = insertAtBegin(head,10);
        head = insertAtBegin(head,20);
        head = insertAtBegin(head,30);


        printlist(head);



    }

    private static Node insertAtBegin(Node head, int i) {

        
        Node temp = new Node(i);
        temp.next =head;
        return  temp;



    }

    private static void printlist(Node head) {



         if (head == null)
         {
             return;
         }
        System.out.println(head.data+" ");
         printlist(head.next);



         }

    }

