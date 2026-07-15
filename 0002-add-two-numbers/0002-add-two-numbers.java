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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (l1 != null || l2 != null || carry != 0) {

            int digit1 = 0;
            int digit2 = 0;

            if (l1 != null) {
                digit1 = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                digit2 = l2.val;
                l2 = l2.next;
            }

            int sum = digit1 + digit2 + carry;

            carry = sum / 10;
            sum = sum % 10;

            temp.next = new ListNode(sum);
            temp = temp.next;
        }

        return dummy.next;
    }
}