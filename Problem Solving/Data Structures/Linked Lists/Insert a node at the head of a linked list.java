    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode n=new SinglyLinkedListNode(data);
        
        if(llist==null){
            // llist=n;
            return n;
        }    
        else{
            n.next=llist;    
        }
        return n;
    }
