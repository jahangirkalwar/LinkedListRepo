public class LinkedList {

    ListNode head;
    ListNode tail;
    int length;

    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.append(11);
        list.append(100);
        list.append(88);
        list.append(22);
        list.append(33);


        System.out.println("original list: ");
        list.printList(list.head);


//        System.out.println("\nreversed list: ");
//        ListNode reversedHead = list.reverseList(list.head);
//        list.printList(reversedHead);

//        System.out.println("\nmiddle node: ");
//        ListNode middleNode = list.findMiddle(list.head);
//        System.out.println(middleNode.val);

        System.out.println("\n add node to start of the linked list ");
        list.preAppend(99);
        list.preAppend(111111);
        list.printList(list.head);




    }

    private void printList(ListNode node) {
        while(node!=null){
            System.out.print(node.val+ "->");
            node = node.next;
        }
        System.out.println("null");
    }


    public void preAppend(int data){
        ListNode newNode = new ListNode(data);
        if (head != null) {
            newNode.next = head;
        }
        head=newNode;
    }

    /** append node to end of the linked list 0(1) */
    public void append(int data){
        ListNode newNode = new ListNode(data);

        if(head==null){
            head=newNode;
        }else {
            tail.next=newNode;
        }
        tail=newNode;
        length++;
    }

    public  ListNode reverseList (ListNode node){

//        if(head==null || head.next==null){
//            return head;
//        }
//
//        ListNode newHead = reverseList(head.next);
//        ListNode nextHead = head.next;
//        nextHead.next=head;
//        head.next=null;
//
//        return newHead;


        ListNode prev=null;
        ListNode curr = node;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        };

        return prev;

    }

    public ListNode findMiddle(ListNode head){

        if(head==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;

        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


}
