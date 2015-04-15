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
public class IntersectionOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        if((a==null && b==null) || (a==null ^ b==null)) {
            return null;
        }
        while(a!=null && b!=null) {
            a = a.next;
            b = b.next;
        }
        if(a==null && b==null) {
            a = headA;
            b = headB;
        }
        if(a==null) {
            a = headB;
        }else if(b==null) {
            b = headA;
        }
        while(a!=null || b!=null) {
            if(a == b) {
                return a;
            }
            a = a.next;
            b = b.next;
            if(a!=null && b==null) {
                b = headA;
            }else if(a==null && b!=null){
                a = headB;
            }
        }
        return null;
    }
}
