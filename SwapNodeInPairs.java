class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode p = head;
        ListNode q = null;
        ListNode r = null;
        ListNode resHead = null;
        ListNode prev = null;
        
        while(p!=null){
            q = p.next;
            
            if(q!=null){
                r = q.next;
                q.next = p;
            }
            
            p.next = r;
            
            if(resHead == null){
                resHead = q;
            }else{
                if(q!=null){
                    prev.next = q;
                }  
            }
            
            prev = p;
            p = r;
            r = null;
        }
        
        return resHead;
    }
}
