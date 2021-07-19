class Solution {
    //gc-> globalCurrent, gn-> globalNext, gh-> globalHead, fn-> firstNode
    ListNode gc = null;
    ListNode gn = null;
    ListNode gh = null;
    ListNode fn = null;
    
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(k == 1){
            return head;
        }
        
        int length = 0;
        ListNode p = head;
        
        //count length of the list
        while(p!=null){
            length++;
            p = p.next;
        }
                
        ListNode node = head;
        while(k<=length){
            reverse(node,null,k);
            
            if(gh == null){
                gh = gc;
            }
            
        node = gn;
        length = length - k;
        }
        
        return gh;
    }
    
    public void reverse(ListNode node, ListNode prev, int k){
    
    if(k == 1){
        gc = node;
        gn = node.next;
        node.next = prev;
        return;
    }
    
    reverse(node.next, node, k-1);
    
    if(prev == null){
        node.next = gn;
        if(fn!=null){
            fn.next = gc;
        }
        fn = node;
    }else{
        node.next = prev;
    }
    
}
}
