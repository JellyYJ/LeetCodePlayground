package ListNode;

public class removeNthFromEnd {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode prev = newHead;

        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

            // Swap adjacent nodes
            prev.next = second;
            first.next = second.next;
            second.next = first;

            // Update pointers
            prev = first;
            head = first.next;
        }

        return newHead.next;
    }
    //    public static ListNode.ListNode ListNode.removeNthFromEnd(ListNode.ListNode head, int n) {
//        if(head == null){
//            return head;
//        }
//        ListNode.ListNode ptr = head;
//        int count = 0;
//        while(ptr != null){
//            count++;
//            ptr = ptr.next;
//        }
//
//        // if the original list only has n nodes, remove the first node
//        if(count == n){
//            head = head.next;
//            return head;
//        }
//
//        ptr = head; // points back to the head
//        n = count-n-1; // the node we want to remove
//        count = 0; // reset counter
//        while(ptr != null){
//            if(count == n){
//                ptr.next = ptr.next.next;
////                System.out.println(ptr.next); for testing
//            }
//            count++;
//            ptr = ptr.next;
//        }
//        return head;
//    }
}


//  Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
