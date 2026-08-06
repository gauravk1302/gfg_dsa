/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/delete-alternate-nodes/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        if(head == null){
            return;
        }
        
        Node prev = head;
        Node node =head.next;
        
        while(prev !=null && node != null){
            prev.next = node.next;
            node = null;
            prev = prev.next;
            if(prev != null){
                node = prev.next;
            }
        }
    }
}
