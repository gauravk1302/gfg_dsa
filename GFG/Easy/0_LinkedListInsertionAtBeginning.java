/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/linked-list-insertion-at-beginning/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtFront(Node head, int x) {
        // code here
                // Create a new node
        Node newNode = new Node(x);

        // New node points to the current head
        newNode.next = head;

        // Update head to the new node
        head = newNode;

        // Return the new head
        return head;

    }
}
