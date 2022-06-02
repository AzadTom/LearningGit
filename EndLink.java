package com.azad;

public class EndLink {


    public static class Node1{

        int data;
        Node1 next;
        Node1(int x){
            this.data =x;
            this.next =null;

        }


    }


    public static void main(String[] args)
    {
        Node1 head =null;

        head = ATEnd(head,10);
        head = ATEnd(head,20);
        head = ATEnd(head,30);

        printlist(head);




    }

    private static Node1 ATEnd(Node1 head, int i) {

        Node1 temp = new Node1(i);
        if (head==null)
        {
            head = temp;
            return  head;

        }

        Node1 cur =head;
        while (cur.next != null)
        {

            cur =cur.next;


        }
        cur.next =temp;

      return head;

    }

    private static void printlist(Node1  head) {



        if (head == null)
        {
            return;
        }
        System.out.println(head.data+" ");
        printlist(head.next);



    }
}
