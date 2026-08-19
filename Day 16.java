// Day 16 - Linked List Practice
// 5 Singly Linked List programs and 5 Circular Linked List programs.

public class Day16 {

    // ==================== SINGLY LINKED LIST ====================

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // 1. Traverse a Singly Linked List
    static void singlyTraverse(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // 2. Insert a Node at the Beginning
    static Node singlyInsertBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    // 3. Insert a Node at the End
    static Node singlyInsertEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    // 4. Delete a Node by Value
    static Node singlyDelete(Node head, int key) {
        if (head == null) {
            return null;
        }

        if (head.data == key) {
            return head.next;
        }

        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
        return head;
    }

    // 5. Search for an Element
    static boolean singlySearch(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // ==================== CIRCULAR LINKED LIST ====================

    static class CircularNode {
        int data;
        CircularNode next;

        CircularNode(int data) {
            this.data = data;
        }
    }

    // 6. Traverse a Circular Linked List
    static void circularTraverse(CircularNode head) {
        if (head == null) {
            return;
        }

        CircularNode current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    // 7. Insert a Node at the Beginning
    static CircularNode circularInsertBeginning(CircularNode head, int data) {
        CircularNode newNode = new CircularNode(data);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        CircularNode current = head;
        while (current.next != head) {
            current = current.next;
        }

        newNode.next = head;
        current.next = newNode;
        return newNode;
    }

    // 8. Insert a Node at the End
    static CircularNode circularInsertEnd(CircularNode head, int data) {
        CircularNode newNode = new CircularNode(data);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        CircularNode current = head;
        while (current.next != head) {
            current = current.next;
        }

        current.next = newNode;
        newNode.next = head;
        return head;
    }

    // 9. Delete a Node by Value
    static CircularNode circularDelete(CircularNode head, int key) {
        if (head == null) {
            return null;
        }

        CircularNode current = head;
        CircularNode previous = null;

        do {
            if (current.data == key) {
                if (current == head) {
                    if (current.next == head) {
                        return null;
                    }

                    CircularNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                    return head;
                }

                previous.next = current.next;
                return head;
            }

            previous = current;
            current = current.next;
        } while (current != head);

        return head;
    }

    // 10. Search for an Element
    static boolean circularSearch(CircularNode head, int key) {
        if (head == null) {
            return false;
        }

        CircularNode current = head;
        do {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        } while (current != head);

        return false;
    }

    public static void main(String[] args) {
        // Singly Linked List example
        Node head = null;
        head = singlyInsertEnd(head, 10);
        head = singlyInsertEnd(head, 20);
        head = singlyInsertEnd(head, 30);
        System.out.print("Singly Linked List: ");
        singlyTraverse(head);

        // Circular Linked List example
        CircularNode circularHead = null;
        circularHead = circularInsertEnd(circularHead, 10);
        circularHead = circularInsertEnd(circularHead, 20);
        circularHead = circularInsertEnd(circularHead, 30);
        System.out.print("Circular Linked List: ");
        circularTraverse(circularHead);
    }
}
