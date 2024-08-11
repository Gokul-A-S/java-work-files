class NodeLL{
    NodeLL next;
    int val;
    NodeLL(int data) {
        this.next = null;
        this.val = data;
    }
}
public class MiddleLL {

    public static void main(String[] args) {
        NodeLL root=new NodeLL(1);
        root.next=new NodeLL(2);
        root.next.next=new NodeLL(3);
        root.next.next.next=new NodeLL(4);
        root.next.next.next.next=new NodeLL(5);
        root.next.next.next.next.next=new NodeLL(6);
        root.next.next.next.next.next.next=new NodeLL(7);
        root.next.next.next.next.next.next.next=new NodeLL(8);
        NodeLL pre=null;
        NodeLL t=root;
        NodeLL mid=root;
        int count=0;
        while (t!=null && t.next!=null){
//            System.out.println(t.val);
            count++;
            pre=mid;
            mid=mid.next;
            t=t.next.next;

        }
        if(count%2==0)
            System.out.println( (float) (mid.val+pre.val)/2);
        else
            System.out.println(mid.val);

        System.out.println(count);

    }
}
