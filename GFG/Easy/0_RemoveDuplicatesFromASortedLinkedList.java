/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // code here
        HashSet<Integer> st = new HashSet<>();

        // Initialize pointers for traversing
        // the original list and building the new
        // list without duplicates
        Node temp = head;
        Node newHead = null;
        Node tail = null;

        // Traverse the original list
        while (temp != null) {
          
            // Check if the current node's data is not in
            // the set
            if (!st.contains(temp.data)) {
              
                // Create a new node for the unique data
                Node newNode = new Node(temp.data);

                // If newHead is null, this is the first
                // unique node
                if (newHead == null) {
                    newHead = newNode;
                    tail = newHead;
                }
                else {
                    // Append the new node to the
                    // end of the new list
                    tail.next = newNode;
                    tail = newNode;
                }

                // Mark this data as encountered
                st.add(temp.data);
            }
            // Move to the next node in the original list
            temp = temp.next;
        }
      
        // Return the head of the new list with
        // duplicates removed
        return newHead;
    }
}
