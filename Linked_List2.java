public class Add_First {
    public static class node {
        int data ;
        node next;

    }
    private static class LinkedList{
        node head;
        node tail;
        int size;
        void addFirst(int elem){
            node temp =new node();
            temp.data= elem;
            temp.next =head;
            if(size == 0){
                tail=temp;
            }
            head=temp;
            size++;
        }
        void addAtIndex(int elem ,int n){
            node temp = new node();
            node n1 = head;
            temp.data = elem;

            if(n<0 || n>size){
                System.out.println("Invalid Argument....");
            }
            else
                for (int i = 0; i <n-1 ; i++) {
                  n1 = n1.next;
                }
                temp.next  = n1.next;
                n1.next=temp;
                size++;
        }void display(){
            node n = head;
            while(n != null){
                System.out.println(n.data+" ");
                n=n.next;
            }
        }
        void removeLast(){
            node t1 = head;
            if(size ==0){
                System.out.println("List is Empty.....");
            }
            else if(size==1){
                head= null;
                tail =null;
                size=0;
            }
            else {
                for (int i = 0; i < size - 2; i++) {
                    t1 = t1.next;
                }
                tail = t1;
                t1.next = null;
                size--;
            }
        }
        private node getIndex(int indx){
            node n= head;
                for(int i=0;i<indx;i++){
                    n= n.next;
                }
            return n;
        }
        void reverse(){
        int li =0;
        int ri = size -1;

        while(li<ri){
            node left = getIndex(li);
            node right = getIndex(ri);

             int temp = left.data;
             left.data = right.data;
             right.data = temp;

             li++;
             ri--;
         }
        }
        void anotherReverse(){
            node prev = null;
            node curr = head;
            while(curr !=null){
                node next =  curr.next;
                curr.next =prev;
                prev= curr;
                curr = next;
            }
          node temp = head;
            head = tail;
            tail=temp;

        }
        void RemoveAt(int indx){
            node temp = head;
            for(int i=0;i<indx-1;i++){
                temp= temp.next;

            }
            temp.next = temp.next.next;
            size--;
        }

        void KthLast(int k){
            if(k>=size){

                System.out.println("Invalid Input...");
                return;
            }
            node l= head;
            node j=head;
            for(int i=0;i<k;i++){
                j=j.next;
            }
            while(j != null){
                l=l.next;
                j=j.next;
            }

            System.out.println(l.data);
        }
        void middle(){
            node one = head;
            node second =head;
            while(second != null && second.next.next != null){
                second = second.next.next;
                one  =one.next;
            }
            System.out.println(one.data);
        }
    }
    public static void main(String[] args) {
        LinkedList ln =new LinkedList();
        ln.addFirst(30);
        ln.addFirst(40);
        ln.addFirst(50);
        ln.addFirst(60);
        ln.addFirst(70);

        ln.display();
        System.out.println("***********");
        ln.reverse();
        ln.display();
        System.out.println("***********");
        ln.anotherReverse();
        ln.display();
        System.out.println("**************");
        ln.RemoveAt(3);
        ln.display();
        System.out.println("****************");
        ln.KthLast(3);
        System.out.println("*************");
        ln.middle();

    }
}
