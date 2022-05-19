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
    ListNode globalHead = null;
    public ListNode reverseList(ListNode head) {
        
        if(head == null){
            return head;
        }
        
        globalHead = head;
        
        recursion(globalHead,null);
        
        return globalHead;
    }
    
    
    public void recursion(ListNode node,ListNode prev){
      
        if(node.next!=null){
            recursion(node.next, node);
        }else{
            globalHead = node;
        }
        node.next = prev;
    }

}
