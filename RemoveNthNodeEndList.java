class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        //iterate to the nth element to delete
        ListNode prev = null;
        ListNode current = head;
        //lets find out the length of the list
        int length = 1;
        //1->2->3->4
        while(current.next!=null){ //o(n)
            length++;
            current = current.next;
        }
        
        n = length-n; //4-2 = 2
        current = head;
        for(int i = 0 ; i<n; i++){// o(n)
            prev = current;
            current = current.next;
        }
        
        if(prev!=null){
             prev.next = current.next;
        }else{
            head = current.next;
        }
        
        return head;

        }
}
