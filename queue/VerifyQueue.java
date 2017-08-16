public class VerifyQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(2);
        queue.enqueue(7);

        int length = queue.getLength();
        for (int i = 0; i < length; i++) {
            System.out.println(queue.dequeue());
        }
        System.out.println(queue.getLength());
        System.out.println(queue.isEmpty());
    }
}
