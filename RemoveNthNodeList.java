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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode p = head;
        
        int size = listLength(head);
        int t = size-n;
        
        int i = 1;
        
        if(t == 0){
            head = p.next;
            
            return  head;
        }
        
        while(i<t){
            p=p.next;
            i++;
        }
        
        if(p.next.next!=null){
            ListNode temp = p.next.next;
            p.next = temp;
        }else{
            p.next = null;
        }
        
        return head;
    
    }
    
    
    public int listLength(ListNode head){
        
        int length = 0;
        
        ListNode p = head;
        
        while(p!=null){
            length++;
            p=p.next;
        }
        
        return length;
    }
}
