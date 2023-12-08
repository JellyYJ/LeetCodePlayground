package ListNode;

// #21. Merge Tow Sorted Lists
public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;

        while (l1 != null && l2 != null) {
            System.out.println(cur);
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            System.out.println(cur.val);
            cur = cur.next;
        }
        // Handle remaining nodes in l1 or l2, if any
        cur.next = l1 != null ? l1 : l2;
        System.out.println(newHead);
        return newHead.next;
        }
}




