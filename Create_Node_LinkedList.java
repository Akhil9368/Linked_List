public class Remove_first {
    public static class node{
        int data;
        node next;
    }
    public static class LinkedList{
        node head;
        node tail;
        int size;
        // Add Element in Last
        void addLast(int elem){
            node temp = new node();
            temp.data = elem;
            temp.next= null;
            if(size ==0){
                head = tail =temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
     size++;
        }
        // Display Data
        void display(){
            node n =head;
            while(n != null){
                System.out.print(n.data + " ");
                n = n.next;
            }
        }
        // Count Size
        int size(){
            System.out.println();
            System.out.println(size);
            return  size;
        }
        // Remove first From linked list
        void removeFirst(){
            node n = head;
            if(size==1){
                head = null;
                tail = null;
            }

            if(size == 0){
                System.out.println("List is Empty");
            }
            else
            head =n.next;
            size--;
        }
        void getFirst(){
            node n = head;
            System.out.println();
            System.out.println("The First Value Of Linked List");
            System.out.println(n.data);
        }
        void getLast(){
            node n = tail;
            System.out.println("The Last Value Of Linked List");
            System.out.println(n.data);
        }
        void getAtIndex(int indx){
            if(indx == 0){
                System.out.println("Invalid Arguments...");

            }
            node n= head;
            if(indx >size){
                System.out.println("Invalid Index ");
            }
            else
                for(int i=0;i<indx;i++){
                    n= n.next;
                }
            System.out.println("The value at index " + indx);
            System.out.println(n.data);
        }

    }

    public static void main(String[] args) {
        LinkedList ln = new LinkedList();
        //Add elements in linked list
        ln.addLast(30);
        ln.addLast(40);
        ln.addLast(50);
        ln.addLast(60);
        ln.addLast(70);
        ln.display();
        //Display the Size of linked list
        ln.size();
        //First element will be Remove
        ln.removeFirst();
        //After First Element is deleted
        ln.display();
        //Get The First Value of Linked list
        ln.getFirst();
        //Get The Last value of LinkedList
        ln.getLast();
        // Get the value at Given Index
        ln.getAtIndex(3);
    }

}
