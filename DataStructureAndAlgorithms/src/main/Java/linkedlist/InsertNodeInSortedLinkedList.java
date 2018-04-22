//Java program to add node in sorted linked list
package linkedlist;

public class InsertNodeInSortedLinkedList {

    private ListNode head;
    public InsertNodeInSortedLinkedList()
    {
        head=null;
    }

    public void addNode(int data)
    {
        ListNode new_node=new ListNode(data);
        if(head==null)
        {
            head=new_node;
        }
        else if(head.data>data)
        {
            new_node.next=head;
            head=new_node;
        }
        else {
            ListNode ptr = head;
            while (ptr.next != null) {
                if (ptr.next.data >= data)
                    break;
                ptr=ptr.next;
            }

            //Adding node at location
            ListNode temp = ptr;
            new_node.next = temp.next;
            ptr.next = new_node;
        }
    }

    public void display(ListNode ptr)
    {
        while (ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }
    public static void main(String[] args)
    {
        InsertNodeInSortedLinkedList obj=new InsertNodeInSortedLinkedList();
        obj.head=new ListNode(2);
        obj.head.next=new ListNode(5);
        obj.head.next.next=new ListNode(10);

        System.out.print("\nInitial Linked List\n");
        obj.display(obj.head);

        //Adding node at first position
        obj.addNode(1);

        //Adding node at middle
        obj.addNode(7);

        //Adding node at last
        obj.addNode(15);

        System.out.print("\nFinal Linked List\n");
        obj.display(obj.head);
    }
}
