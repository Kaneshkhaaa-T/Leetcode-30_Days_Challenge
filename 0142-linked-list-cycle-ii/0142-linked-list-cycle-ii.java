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

    public ListNode loopLL(ListNode head,ListNode fast){
            ListNode Slow1 = head;
            ListNode Fast1 = fast;
            while(Slow1!=Fast1){
                Slow1 = Slow1.next;
                Fast1 = Fast1.next;
            }
            return Slow1;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return loopLL(head,fast);
            }
        }
        return null;
    }
}