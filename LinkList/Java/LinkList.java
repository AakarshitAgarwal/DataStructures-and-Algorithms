public class LinkList {
    
    Node head;

    public void insert(int data){

        Node node=new Node();
        node.data=data;
        node.next=null;

        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null){

                n=n.next;
            }
            n.next=node;
        }

    }


    public void insertAtStart(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;

        node.next=head;
        head=node;
    }

    public void insertAt(int index,int data){
        Node node=new Node();
        node.data=data;
        node.next=null;

        if(index==0){
            insertAtStart(data);
        }
        else{
        Node n=head;  //start with head node
        for(int i=0;i<index-1;i++) // used index -1 because index itself is pointing to next node and we have to subtract 1 so that to stay at that node
        {
            n=n.next;  //that is why used n.next
        }
        node.next=n.next;   // n is previous node  //make a NODE link to n next node
        n.next=node;       // n link to new NODE not next anymore
        }
    }

    public void deleteAt(int index){
        if(index==0){
            head=head.next;
        }
        else{
            Node n=head;
            Node temp=null;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            temp=n.next;
            n.next=temp.next;
            temp=null;
        }
    }

    public void show(){

        Node node =head;

        while(node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
}
