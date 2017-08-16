class Queue {
    private int length;
    private Element tail;
    private Element head;

    Queue() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    void enqueue(int value) {
        Element element = new Element(value);
        if (isEmpty()) {
            head = tail = element;
        } else {
            tail.setNext(element);
            tail = element;
        }
        length++;
    }

    int dequeue() {
        int result = head.getValue();
        head = head == tail? null : head.getNext();
        length--;
        return result;
    }

    int front() {
        return head.getValue();
    }

    boolean isEmpty() {
        return this.length == 0;
    }

    public int getLength() {
        return length;
    }
}
