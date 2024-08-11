public class SelectionLL {

    public static void insertion(Node head){
        int temp;
        Node min,j,i=head;
        while(i!=null){
            min=i;
            j=i.next;
            while(j!=null){
                if(j.data<min.data)
                    min=j;
                j=j.next;
            }
            if(min!=i){
                temp=i.data;
                i.data=min.data;
                min.data=temp;
            }
            i=i.next;
        }

    }
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(0);
        head.next.next.next.next = new Node(11);
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println("\n");
        insertion(head);
        t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
}
