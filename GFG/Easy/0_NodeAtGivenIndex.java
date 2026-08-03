/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/node-at-a-given-index-in-linked-list/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public static int getNode(Node head, int k) {
        Node curr = head;
        int count = 1;
        
        while(curr !=  null){
            if(count == k){
                return curr.data;
                
            }
            curr = curr.next;
            count++;
        }
        
        return -1;
    }
}
