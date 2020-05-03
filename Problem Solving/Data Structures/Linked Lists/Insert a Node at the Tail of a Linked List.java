
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data){
        SinglyLinkedListNode n=new SinglyLinkedListNode(data);
        SinglyLinkedListNode th=head;  
        if (head == null){
            head=n;
            return head;
        }  
        while(head.next!=null){
            head=head.next;
        }
        head.next=n;
        n.next=null;
        return th; 
    }  


