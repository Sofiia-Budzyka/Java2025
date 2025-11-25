package LinkedList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        //Example 1
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result1 = solution.mergeTwoLists(list1, list2);
        printList(result1);
        //Example 2
        ListNode list3 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list4 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result2 = solution.mergeTwoLists(list1, list2);
        printList(result2);
        //Example 3
        ListNode list5 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list6 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result3 = solution.mergeTwoLists(list1, list2);
        printList(result3);
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}