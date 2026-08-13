/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {

    static int addWithCarry(Node head) {
        if (head == null) {
            return 1;
        }

        int res = head.data + addWithCarry(head.next);

        head.data = res % 10;
        return res / 10;
    }

    static Node addOne(Node head) {
        int carry = addWithCarry(head);

        if (carry > 0) {
            Node newNode = new Node(carry);
            newNode.next = head;
            return newNode;
        }

        return head;
    }
}
