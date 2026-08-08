/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/* Structure of linked list Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
};*/
class Solution {
    public Node pairwiseSwap(Node head) {
        // code here
        Node curr = head;

        // Traverse the list and swap data in pairs
        while (curr != null && curr.next != null) {
            // Swap data of current node and the next node
            int temp = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;

            // Move to the next pair
            curr = curr.next.next;
        }
        return head;
    }
}
