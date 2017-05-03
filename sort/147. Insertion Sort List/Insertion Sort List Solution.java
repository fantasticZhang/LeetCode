/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null) return head;
       	ListNode current = head.next;
       	head.next = null;
       	ListNode pre,tmp;
       	while(current != null){
       		if(current.val <= head.val){
       			tmp = current;
       			current = current.next;
       			tmp.next = head;
       			head = tmp;
       		}else{
       			pre = head;
       			while((pre.next != null) && (pre.next.val < current.val)) pre = pre.next;
       			tmp = current;
    			current = current.next;
    			tmp.next = pre.next;
    			pre.next = tmp;
       		}
       	}
           
       	return head;
    }
}