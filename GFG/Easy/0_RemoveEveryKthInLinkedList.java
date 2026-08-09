/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/remove-every-kth-node/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/* structure for link list node
class Node {
    Node next;
    int data;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node deleteK(Node head, int k) {
        // Your code here
         
      
        // If list is empty or k is 0, return the head
        if (head == null || k <= 0)
            return head;

        Node curr = head;
   
        Node prev = null;
      
        int count = 0;

        // Traverse the linked list
        while (curr != null) {
          
            // Increment the counter for each node
            count++;

            // If count is a multiple of k, remove 
            // current node
            if (count % k == 0) {
              
                // skip the current node
                if (prev != null) {
                    prev.next = curr.next;
                } 
               else {
                 
                    // If removing the head node
                    head = curr.next;
                }
            } 
           else {
             
                // Update previous node pointer only if
                // we do not remove the node
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }
}
