/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/deletion-at-the-end-of-a-linked-list/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
        // code here
                // Empty list or single node
        if (head == null || head.next == null) {
            return null;
        }

        Node curr = head;

        // Traverse to the second last node
        while (curr.next.next != null) {
            curr = curr.next;
        }

        // Delete last node
        curr.next = null;

        return head;

    }
}
