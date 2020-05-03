

    // Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        int count=0;
        SinglyLinkedListNode th=head;
        while(th!=null){
            th=th.next;
            count++;
        }
        count-=positionFromTail;
        while(count-1>0){
            head=head.next;
            count--;
        }
        return head.data;
    }

