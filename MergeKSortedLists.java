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
    
    // List<Integer> array = new ArrayList<>();
    PriorityQueue<Integer> array = new PriorityQueue<>();
    
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length==0){
            return null;
        }
        
        if(lists.length==1){
            return lists[0];
        }
        
        for(int i = 0; i<lists.length; i++){//O(m*n)
                if(lists[i]!=null){
                     mergeList(lists[i]);
                }
        }
       
        ListNode res = null;
        if(array.size()>0){
            ListNode node = new ListNode(array.remove());
            res = node;
            ListNode currentNode = node;
            
            while(!array.isEmpty()){
                 ListNode newNode = new ListNode(array.remove());
                currentNode.next = newNode;
                currentNode = newNode;
            }
        }
       
        return res;
    }
    
    public void mergeList(ListNode list){
        ListNode current = list;
        
            while(current!=null){
                array.add(current.val);
                current = current.next;
                }
            }
    

}
