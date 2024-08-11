class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next=null;
    }
}
public class QuicksortLL {
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(0);
        Node tail = head.next.next.next.next = new Node(11);
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println("\n");
        t=quicksort(head);

        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;

        }
    }

    public static Node getTail(Node head) {
        Node cur=head;
        while(cur.next!=null && cur!=null) {
            cur=cur.next;
        }
        return cur;
    }

    public static Node quicksort(Node head) {
        head= quickSortRecur(head,getTail(head));
        return head;
    }
    public static Node quickSortRecur(Node head, Node end) {
        if (head == null || head == end) {
            return head;
        }
        Node[] newHead = new Node[1];
        Node[] newEnd = new Node[1];

        Node pivot = partition(head, end, newHead, newEnd);

        if (newHead[0] != pivot) {
            Node tmp = newHead[0];
            while (tmp.next != pivot)
                tmp = tmp.next;
            tmp.next = null;

            newHead[0] = quickSortRecur(newHead[0], tmp);
            tmp = getTail(newHead[0]);
            tmp.next = pivot;
        }

        pivot.next = quickSortRecur(pivot.next, newEnd[0]);

        return newHead[0];


    }
    public static Node partition(Node head, Node end, Node[] newHead, Node[] newEnd) {
        Node pivot = end;
        Node prev = null, cur = head, tail = pivot;

        while (cur != pivot) {
            if (cur.data < pivot.data) {
                if (newHead[0] == null)
                    newHead[0] = cur;

                prev = cur;
                cur = cur.next;
            } else {
                if (prev != null)
                    prev.next = cur.next;
                Node tmp = cur.next;
                cur.next = null;
                tail.next = cur;
                tail = cur;
                cur = tmp;
            }
        }

        if (newHead[0] == null)
            newHead[0] = pivot;

        newEnd[0] = tail;
        return pivot;}
}
