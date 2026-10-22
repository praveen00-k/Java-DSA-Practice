class LinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at beginning
    void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert after a particular value
    void insertAfter(int value, int data) {

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;

        temp.next = newNode;
    }

    // Display
    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        list.insertAtEnd(40);
        list.insertAfter(20, 30);

        list.display();
    }
}