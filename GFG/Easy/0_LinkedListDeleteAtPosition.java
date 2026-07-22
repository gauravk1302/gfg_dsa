/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/linked-list-delete-at-position/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/* Node Structure
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
    public Node deleteAtPosition(Node head, int pos) {
        // code here
        Node temp = head;
        
        if(pos == 1){
            head = temp.next;
            return head;
        }
        
        Node prev = null;
        
        for(int i = 1 ; i < pos ; i++){
            prev = temp;
            temp = temp.next;
            
        }
        
        prev.next = temp.next;
        
        
        return head;
    }
}
