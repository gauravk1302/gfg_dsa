/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
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
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        int count = 0 ;
        Node curr = head;
        
        while( curr != null){
            curr = curr.next;
            count++;
        }
        
        if( k> count){
            return -1;
        }
        
        curr = head;
        int n = 0;
        
        while( n != (count - k)){
            curr  = curr.next;
            n++;
        }
        
        return curr.data;
    }
}
