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
    public void reorderList(ListNode head) {
        
    int lengthSlow = 0;
    ListNode cur = head;
    //1->2->3->4
    //find the length of the list
    ListNode slow = head;
    ListNode fast = head.next;
    
    while(fast!=null){
        slow = slow.next;
        lengthSlow++;
        if(fast.next!=null){
           fast = fast.next.next;  
        }else{
            fast = null;
        }
    }
  
    //push nodes after middle nodes to the stack
    Stack<ListNode> nodeStack = new Stack<>();
    
    while(slow!=null){
        nodeStack.push(slow);
        slow = slow.next;
    }
          
    cur = head;
        
    //reorder nodes
    for(int j = 1; j<=lengthSlow; j++){
        ListNode nxt = cur.next;
        ListNode node = nodeStack.pop(); 
        cur.next = node;
        node.next = nxt;
        cur = nxt;
    }
    
    cur.next = null;

    }
}
