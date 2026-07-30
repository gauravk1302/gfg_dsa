/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/move-last-element-to-front-of-a-linked-list/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/*
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    public static Node moveToFront(Node head) {
        // code here
        if (head == null || head.next == null){
            return head;
        }
        
        Node secLast = null;
        Node last = head;
        
        while (last.next != null){
            secLast = last;
            last = last.next;
        }
        
        secLast.next = null;
        
        
        last.next = head;
        head = last;
        
        return head;
    }
}

