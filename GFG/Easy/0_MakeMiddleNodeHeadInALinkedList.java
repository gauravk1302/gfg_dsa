// Java program to make middle node 
// as head of Linked list
public class GFG 
{     
    /* Link list node */
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    
    static Node head;
    
    /* Function to get the middle and 
    set at beginning of the linked list*/
static int getLength(Node head) {
    int length = 0;

    while (head != null) {
        length++;
        head = head.next;
    }

    return length;
}

static void setMiddleHead() {

    if (head == null || head.next == null)
        return;

    int len = getLength(head);
    int midIndex = len / 2;

    Node curr = head;
    Node prev = null;

    while (midIndex > 0) {
        prev = curr;
        curr = curr.next;
        midIndex--;
    }

    prev.next = curr.next;
    curr.next = head;
    head = curr;
}
     
    // To insert a node at the beginning of
    // linked list.
    static void push(int new_data)
    {
        /* allocate node */
        Node new_node = new Node(new_data);
     
        /* link the old list of the new node */
        new_node.next = head;
     
        /* move the head to point to the new node */
        head = new_node;
    }
     
    // A  function to print a given linked list
    static void printList(Node ptr)
    {
        while (ptr != null) {
            System.out.print(ptr.data+" ");
            ptr = ptr.next;
        }
        System.out.println();
    }
     
    /* Driver function*/
    public static void main(String args[])
    {
        // Create a list of 5 nodes
        head = null;
        int i;
        for (i = 5; i > 0; i--)
            push(i);
        
        System.out.print(" list before: ");
        printList(head);
     
        setMiddleHead();
     
        System.out.print(" list After:  ");
        printList(head);
    
    }
}
