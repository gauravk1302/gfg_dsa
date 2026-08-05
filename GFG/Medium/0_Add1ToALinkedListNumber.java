/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {

    // Reverse function
    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Main function
    public Node addOne(Node head) {

        head = reverse(head);

        Node curr = head;
        Node prev = null;
        int carry = 1;

        while (curr != null && carry > 0) {
            int sum = curr.data + carry;

            curr.data = sum % 10;
            carry = sum / 10;

            prev = curr;
            curr = curr.next;
        }

        if (carry > 0) {
            prev.next = new Node(carry);
        }

        return reverse(head);
    }
}
