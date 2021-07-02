public class Runner {
    public static void main(String args[]){
        Queue q=new Queue();
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(7);
        q.enQueue(3);

        q.enQueue(8);
        // q.enQueue(6);

        q.deQueue();
        q.deQueue();

        // q.enQueue(9);
        // q.enQueue(1);
        // q.enQueue(4);
        
        // System.out.println(q.isFull());

        System.out.println("size of Queue: "+q.getSize());
        q.show();
    }
}
