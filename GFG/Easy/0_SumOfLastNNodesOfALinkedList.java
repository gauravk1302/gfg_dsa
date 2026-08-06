/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/find-the-sum-of-last-n-nodes-of-the-linked-list/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/* Structure for link list Node
class Node {
  public:
    int data;
    public Node next;
    public Node(int val) {
        data = val;
        next = null;
    }
}; */

class Solution {
    public int sumofNodes(Node head, int n) {
        // code here
        if ( n <= 0){
            return 0;
        }
        
        int sum = 0, len = 0;
        Node temp = head;
        
        while(temp != null){
            len++;
            temp = temp.next;
        }
        
        int c = len - n;
        temp= head;
        
        while( temp != null && c-- >0){
            temp = temp.next;
        }
        
        while(temp != null){
            sum += temp.data;
            temp = temp.next;
        }
        
        return sum;
    }
};
