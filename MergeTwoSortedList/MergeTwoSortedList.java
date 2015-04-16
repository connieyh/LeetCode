/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class MergeTwoSortedLists{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newhead = new ListNode(0);
        ListNode a = l1;
        ListNode b = l2;
        ListNode n = newhead;
        while(a!=null && b!=null) {
            if(a.val < b.val) {
                n.next = a;
                a = a.next;
            }else {
                n.next = b;
                b = b.next;
            }
            n = n.next;
        }
        if(a!=null) {
            n.next = a;
        }
        if(b!=null) {
            n.next = b;
        }
        return newhead.next;
    }
}