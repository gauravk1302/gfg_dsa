/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
          Node curr = head;

        while (curr != null) {
            if (curr.data == key) {
                return true;
            }
            curr = curr.next;
        }

        return false;
    }
}
