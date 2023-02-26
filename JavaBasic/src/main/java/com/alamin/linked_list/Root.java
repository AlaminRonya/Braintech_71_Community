package com.alamin.linked_list;
class Node{
    int data;
    Node next;

    public Node() {
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedListImplementations{
    public static Node insertFirst(int data, Node head){
        return new Node(data, head);
    }
    public static Node insertNumberOfPosition(int data, Node head, int pos){
        if (pos == 1){
            return new Node(data, head);
        }
        if (pos < 1 || head == null){
            return head;
        }
        while ( --pos > 1 && head.next != null){
            head = head.next;
        }
        if (pos > 1){
            return head;
        }
        head.next = new Node(data,head.next);
        return head;
    }

    public static Node insertLastPosition(int data, Node head){
        Node lastNode = head;
        Node pre = lastNode;
        if (head == null){
            return new Node(data, head);
        }
        while (lastNode != null){
            pre = lastNode;
            lastNode = lastNode.next;
        }
        pre.next = new Node(data, null);
        return head;
    }

    public static void show(Node head){
        while (head != null){
            System.out.print(head.data+",");
            head = head.next;
        }
        System.out.println();
    }

    public static Node reverse(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node newNode = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }
    public static Node reverseIt(Node head){
        Node newNode = null;
        while (head != null){
            Node temp = head.next;
            head.next = newNode;
            newNode = head;
            head = temp;
        }
        return newNode;
    }
//    public static Node addTwoListOneDigit(Node n1, Node n2){
//        if (n1 == null && n2 == null){
//            return null;
//        }
//        if (n1 == null){
//            return n2;
//        }
//        if (n2 == null){
//            return n1;
//        }
//
//
//    }

    public static Node deleteAnyPosition(Node head, int pos){
        if (head == null || pos < 1){
            return head;
        }
        if (pos == 1){
            return head.next;
        }
        Node temp  = head;
        while (--pos > 1 && temp.next != null){
            temp = temp.next;
        }
        if (temp.next != null){
            temp.next = temp.next.next;
        }
        return head;

    }
}
public class Root {
    public static void main(String[] args) {
        Node head = null;
        head = LinkedListImplementations.insertNumberOfPosition(3, head, 1);
        LinkedListImplementations.insertNumberOfPosition(1, head, 2);
        LinkedListImplementations.insertNumberOfPosition(2, head, 2);
        LinkedListImplementations.show(head);
        Node node1 = LinkedListImplementations.reverseIt(head);
        Node node = LinkedListImplementations.deleteAnyPosition(head, -1);


//        Node reverse = LinkedListImplementations.reverse(head);
        LinkedListImplementations.show(node1);

//        head = LinkedListImplementations.insertNumberOfPosition(4, head, 1);
//        LinkedListImplementations.insertNumberOfPosition(5, head, 5);
//        head = LinkedListImplementations.insertNumberOfPosition(2, head, 2);
//        head = LinkedListImplementations.insertNumberOfPosition(4, head, 4);
//        head = LinkedListImplementations.insertLastPosition(2, head);
//        head = LinkedListImplementations.insertLastPosition(1, head);
//        head = LinkedListImplementations.insertFirst(1, head);

//        LinkedListImplementations.show(head);
    }
}
