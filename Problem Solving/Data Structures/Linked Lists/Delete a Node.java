

    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode node=head;
        if(position==0)
            return node.next;
        while(--position>0){
            node=node.next;
        }
        node.next=node.next.next;
        return head;

    }

