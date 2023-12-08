package ListNode;

public class deleteDuplicates {
    //  #83. Remove Duplicates from Sorted List
    public static ListNode deleteDuplicates(ListNode head) {
        // null check or single node
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        ListNode prev = head;

        while (prev != null) {
            while (prev.next != null && prev.val == prev.next.val) {
                prev = prev.next; // Skip duplicates
            }
            cur.next = prev; // Add the distinct node to the new list
            cur = cur.next;
            prev = prev.next; // Move to the next distinct node
        }
        cur.next = null; // Set the next of the last distinct node to null
        return newHead.next;
    }
}
