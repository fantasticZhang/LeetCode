/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
       ListNode pre = null, mid = head, last = head;
		while(last != null && last.next != null){
			pre = mid;
			mid = mid.next;
			last = last.next.next;
		}
		pre.next = null;
		ListNode l1 = sortList(head);
		ListNode l2 = sortList(mid); 
		return mergeList(l1,l2); 
    }
    
    private ListNode mergeList(ListNode l1, ListNode l2){
		ListNode tmpHead = new ListNode(0);
		ListNode p = tmpHead;
		while(l1 !=null && l2 != null){
			if(l1.val < l2.val){
				p.next = l1;
				l1 = l1.next;
			}else{
				p.next = l2;
				l2 = l2.next;
			}
			p = p.next;
		}
		if(l1 != null)
			p.next = l1;
		if(l2 != null){
			p.next = l2;
		}
		return tmpHead.next;
	}
}