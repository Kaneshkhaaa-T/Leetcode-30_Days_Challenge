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
    public ListNode rotateRight(ListNode head, int k) {
         if (head == null || head.next == null || k == 0)
            return head;
        ListNode temp = head;
        int total = 1;
        while(temp.next!=null){
            temp=temp.next;
            total++;
        }
        if(k%total==0) return head;
        temp.next = head;
        int mod = k%total;
        int sum = total - mod;
        temp = head;
        while(sum>1){
            temp = temp.next;
            sum--;
        }
        head =temp.next ;
        temp.next = null;
        return head;
    }
}