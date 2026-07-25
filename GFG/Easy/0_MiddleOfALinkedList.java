/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/*
class Node {
	int data;
	Node next;
	
	Node(int x) {
		data = x;
		next = null;
	}
} */

class Solution {
	
	static int getLength(Node head) {
		
		int length = 0 ;
		
		while (head != null) {
			length++;
			head = head.next;
		}
		
		return length;
	}
	int getMiddle(Node head) {
		
		int length = getLength(head);
		
		int midIdx = length/2;
		
		while (midIdx > 0) {
			head = head.next;
			midIdx--;
		}
		
		return head.data;
	}
}

