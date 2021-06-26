public class Runner {
    
    public static void main(String args[]){
        LinkList list=new LinkList();
        list.insert(18);
        list.insert(23);
        list.insert(31);
        list.insert(45);

        // list.insertAtStart(24);

        // list.insertAt(2,20);
        // list.insertAt(0,70);

        list.deleteAt(2);

        list.show();
    }

}
