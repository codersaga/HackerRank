

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode th=head;
        SinglyLinkedListNode n=new SinglyLinkedListNode(data);
        while(position-1>0){
            head=head.next;
            (position)--;
        }
        n.next=head.next;
        head.next=n;
        return th;
    }

