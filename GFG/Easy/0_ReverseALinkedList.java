/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/* Structure of Linked List Node
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
    Node reverseList(Node head) {
        // code here
        Node curr = head, prev = null, next;
        
        while( curr != null){
            next = curr.next;
            
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
