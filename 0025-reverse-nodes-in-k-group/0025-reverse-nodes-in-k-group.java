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

    public ListNode findkthnode(ListNode temp, int k) {

        ListNode dummy = temp;
        while(dummy != null && k>1){
            dummy=dummy.next;
            k--;
        }
        return dummy;
    }

    public ListNode reverseLL(ListNode temp) {
        ListNode reverse = temp;
        ListNode prev = null;
        while(reverse!=null){
            ListNode front = reverse.next;
            reverse.next=prev;
            prev = reverse;
            reverse=front;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        ListNode prevnode = null;
        ListNode nextnode = null;

        while(temp!=null){
            ListNode kthnode = findkthnode(temp,k);
            if(kthnode == null){
                if(prevnode != null) {
                    prevnode.next=nextnode;
                    break;
                }
            }
            nextnode = kthnode.next;
            kthnode.next = null;
            reverseLL(temp);
            if(temp==head) head=kthnode;
            else prevnode.next=kthnode;
            prevnode = temp;
            temp = nextnode;    
        }
        return head;
    }
}