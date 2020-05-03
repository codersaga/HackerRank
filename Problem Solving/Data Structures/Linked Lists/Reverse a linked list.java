

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode tail=null;
        while(head != null) {
            SinglyLinkedListNode temp = head.next;
            head.next = tail;
            tail = head;
            head = temp;
        }
        return tail;

    }

