public class BubbleLL {
    public static void bubble(Node head){
        Node j,i=head;
        while(i!=null){
            int temp;
            j=head;
            while (j.next!=null){
                if(j.data>j.next.data){
                    temp=j.data;
                    j.data=j.next.data;
                    j.next.data=temp;
                }
                j=j.next;
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
        bubble(head);
        t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
}
