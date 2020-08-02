package edu.geek.study.linked;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MergeTwoSortedLists {

	public static void main(String[] args) {

	}

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
	// 方法1:递归
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 != null && l2 != null) {
        	if(l1.val < l2.val) {
        		l1.next = mergeTwoLists(l1.next, l2);
        		return l1;
        	} else {
        		l2.next = mergeTwoLists(l2.next, l1);
        		return l2;
        	}
        } else {
        	if(l1 != null) {
        		return l1;
        	} else {
        		return l2;
        	}
        }
    }
	
	// 方法2:循环
	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        while(l1 != null && l2 != null) {
        	
        	l1 = l1.next;
        	
        	l2 = l2.next;
        }
        
        return l1;
    }
	
	class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next;}
	}
}
