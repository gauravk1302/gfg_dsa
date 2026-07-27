/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/node-at-a-given-index-in-linked-list/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public int GetNth(Node head, int index) {
        // Code here
        int count = 1;

        while (head != null) {

            if (count == index) {
                return head.data;
            }

            head = head.next;
            count++;
        }

        return -1;
    }
}
