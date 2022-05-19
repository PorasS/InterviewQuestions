/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    Set<ListNode> visited = new HashSet<>();
    boolean flag = false;
    public boolean hasCycle(ListNode head) {   
        detectCycle(head);
        return flag;
    }
    
    public void detectCycle(ListNode node){
       
        if(visited.contains(node)){
         flag = true;
            return;
        }
        visited.add(node);
        if(node!=null){
             detectCycle(node.next);
        }
        
    }

}
