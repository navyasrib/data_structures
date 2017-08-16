class Stack {
    private Element head;
    private int length;

    Stack() {
        this.head = null;
        this.length = 0;
    }

    void push(int value) {
        Element element = new Element(value);
        if (length != 0)
            element.setNext(head);
        head = element;
        length++;
    }

    int pop() {
        if (length == 1)
            head = null;
        else
            head = head.getNext();

        return head != null ? head.getValue() : 0;
    }

}
