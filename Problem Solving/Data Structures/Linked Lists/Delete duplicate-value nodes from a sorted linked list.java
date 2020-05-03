

    // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode th=head;
        if(head==null){
            return null;
        }
        while(head.next!=null){
            if(head.data==head.next.data){
                head.next=head.next.next;
            }
            else{
                head=head.next;
            }
        }
        return th;
    }

