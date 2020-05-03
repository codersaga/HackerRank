

    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode n1 = head1;
        SinglyLinkedListNode n2 = head2;
        int count1=0,count2=0,count=0;
        while(n1!=null){
            count1++;
            n1 = n1.next;
        }   
        while(n2!=null){
            count2++;
            n2=n2.next;
        }
        if(count1 != count2)
            return false;
        else{
            while(head1!=null || head2!=null){
                if(head1.data == head2.data){
                    count++;
                }
                head1=head1.next;
                head2=head2.next;
            }
            if(count == count1)
                return true;
            else
                return false;
        }
    }

