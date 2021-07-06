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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> arrayList = new ArrayList<>();
        ListNode head = null;
        ListNode p = l1;
        while(p!=null){
            arrayList.add(p.val);
            p=p.next;
        }
        
        p=l2;
        while(p!=null){
            arrayList.add(p.val);
            p=p.next;
        }
        
        Collections.sort(arrayList);
        List<Integer> result = new ArrayList<>();
        
        for(Integer num : arrayList){
            if(head == null){
                ListNode node = new ListNode(num);
                head = node;
            }else{
                ListNode temp = head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                ListNode node = new ListNode(num);
                temp.next = node;
            }
        }
        return head;
    }
}
