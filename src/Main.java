import ListNode.removeNthFromEnd;

//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<nums.length; i++){
//            int complement = target-nums[i];
//            System.out.println(complement);
//            if(map.containsKey(complement)){
//                return new int[]{map.get(complement),i};
//            }
//            map.put(nums[i],i);
//        }
//        return new int[]{};
//    }
//}

//class Solution {
//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 1; i++) {
//            System.out.println(nums[i]);
//
//            if (nums[i] == nums[i+1]) {
//                return true;
//            }
//        }
//        return false;
//    }
//}



// #160
// Definition for singly-linked list.
//class ListNode.ListNode {
//      int val;
//      ListNode.ListNode next;
//      ListNode.ListNode(int x) {
//          val = x;
//          next = null;
//     }
//}

//class Solution {
//    public ListNode.ListNode getIntersectionNode(ListNode.ListNode headA, ListNode.ListNode headB) {
//        // null check
//        if(headA == null || headB == null){
//            return null;
//        }
//
//        ListNode.ListNode a = headA;
//        ListNode.ListNode b = headB;
//        //if a & b have different len, then we will stop the loop after second iteration
//        while( a != b){
//            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
//            a = a == null? headB : a.next;
//            b = b == null? headA : b.next;
//        }
//        return a;
//    }
//}


public class Main {
    public static void main(String[] args) {

        // 1. Two sum
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        Solution sol = new Solution();
//        int[] result = sol.twoSum(nums, target);

        // 217. Contains Duplicate
//        int[] nums ={1,3,2,14};
//        Solution sol = new Solution();
//        boolean duplicate = sol.containsDuplicate(nums);
//        System.out.println(duplicate);


        // 160. Intersection of Two Linked Lists
        // create the first linked list: 1 -> 2 -> 3 -> 4 -> 5
//        ListNode.ListNode nodeA = new ListNode.ListNode(1);
//        ListNode.ListNode node2 = new ListNode.ListNode(2);
//        ListNode.ListNode node3 = new ListNode.ListNode(3);
//        ListNode.ListNode node4 = new ListNode.ListNode(4);
//        ListNode.ListNode node5 = new ListNode.ListNode(5);
//        nodeA.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//
//        // create the second linked list: 9 -> 8 -> 4 -> 5 -> 6
//        ListNode.ListNode nodeB = new ListNode.ListNode(9);
//        ListNode.ListNode node8 = new ListNode.ListNode(8);
//        nodeB.next = node8;
//        node8.next = node4;
//
//        // create a Solution object
//        Solution solution = new Solution();
//
//        // test the getIntersectionNode() method
//        ListNode.ListNode intersectionNode = solution.getIntersectionNode(nodeA, nodeB);
//        if (intersectionNode == null) {
//            System.out.println("The two linked lists do not intersect.");
//        } else {
//            System.out.println(intersectionNode.next.val);
//            System.out.println("The intersection point is: " + intersectionNode.val);
//        }

//        #21
//        // Create the first sorted linked list: 1 -> 3 -> 5 -> null
//        ListNode.ListNode l1 = new ListNode.ListNode(1);
//        l1.next = new ListNode.ListNode(3);
//        l1.next.next = new ListNode.ListNode(5);
//
//        // Create the second sorted linked list: 2 -> 4 -> 6 -> null
//        ListNode.ListNode l2 = new ListNode.ListNode(2);
//        l2.next = new ListNode.ListNode(4);
//        l2.next.next = new ListNode.ListNode(6);
//
//        // Merge the two linked lists
//        ListNode.ListNode mergedList = ListNode.MergeTwoSortedLists.mergeTwoLists(l1, l2);
//
//        // Print the merged list to verify the result
//        System.out.print("Merged List: ");
//        while (mergedList != null) {
//            System.out.print(mergedList.val + " ");
//            mergedList = mergedList.next;
//        }

////      #83
////      Create the first sorted linked list: 1 -> 3 -> 5 -> null
//        ListNode.ListNode l1 = new ListNode.ListNode(1);
//        l1.next = new ListNode.ListNode(1);
//        l1.next.next = new ListNode.ListNode(2);
//        l1.next.next.next = new ListNode.ListNode(3);
//        l1.next.next.next.next = new ListNode.ListNode(3);
//
////      Merge the two linked lists
//        ListNode.ListNode removeDuplicates = ListNode.deleteDuplicates.ListNode.deleteDuplicates(l1);
//        System.out.print("Duplicated remove: ");
//        while (removeDuplicates != null) {
//            System.out.print(removeDuplicates.val + " ");
//            removeDuplicates = removeDuplicates.next;
//        }

////        #19
////      Create the first sorted linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
//        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(3);
//        l1.next.next.next = new ListNode(4);
////        l1.next.next.next.next = new ListNode.ListNode(5);
//
//        ListNode removeFromEnd = removeNthFromEnd.swapPairs(l1);
//        System.out.print("Duplicated remove: ");
//        while (removeFromEnd != null) {
//            System.out.print(removeFromEnd.val + " ");
//            removeFromEnd = removeFromEnd.next;
//        }

    }

}

