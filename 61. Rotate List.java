/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        ListNode val= head;
      if(head == null|| head.next== null || k==0){
          return head;
      }
       
        int n=1;
        while(temp.next != null){
            n++;
           temp=temp.next;
          }
         temp.next=head;
         k = n-k%n;
          for(int i =0;i<k-1;i++){
            val=val.next;
          }
         head= val.next;
         val.next = null;
        
        return head;
    }
}
