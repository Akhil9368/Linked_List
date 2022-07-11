//concept behind dobly linkedlist :- this is also a linear data structure but in additional there is one more part in the node that is previous 
// which hold the address of previous node and the the deletion of last element in the linkedlist is constant time because we know the address of previous data

 class DoublyLinkedList {
    //A node class for doubly linked list
    class Node {
        int item;
        Node previous;
        Node next;

        public Node(int item) {
            this.item = item;

        }
    }

    //Initially, heade and tail is set to null
    Node head, tail = null;
   public  void addLast(int elem){
        Node newNode = new Node(elem);
        newNode.next=null;
        if(head == null){
            head= tail=newNode;
            head.previous=null;

        }
        else
        {
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
        }
    }
    void deleteLast(){
      tail  =tail.previous;
        tail.next=null;

    }
    void addFirst(int elem){
       Node newone = new Node(elem);
       newone.next=null;
       newone.previous=null;
       if(head==null){
           head=tail=newone;
       }
       else
       {
           newone.next=head;
           head=newone;
       }
    }

//
    //print all the nodes of doubly linked list
    public void printNodes() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }

        while(current != null) {
            //Print each node and then go to next.
            System.out.print(current.item + " ");
            current = current.next;
        }
    }

//}
}
class Main{
    public static void main(String[] args) {
        //create a DoublyLinkedList object
        DoublyLinkedList dl_List = new DoublyLinkedList();
        dl_List.addLast(10);
        dl_List.addLast(20);
        dl_List.addLast(30);
        dl_List.addLast(40);
        dl_List.printNodes();
        dl_List.deleteLast();

        dl_List.printNodes();
        dl_List.addFirst(100);
        System.out.println("********");
        dl_List.printNodes();


    }
}  
