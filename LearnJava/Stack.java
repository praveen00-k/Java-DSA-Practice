public class Stack {

    int[] arr;
    int size;
    int top;

    // Constructor
    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Push - add element
    void push(int value) {

        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = value;
    }

    // Pop - remove element
    int pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = arr[top];
        top--;

        return value;
    }

    // Peek - see top element
    int peek() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    // Display stack
    void display() {

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Removed: " + stack.pop());

        System.out.println("Stack after pop:");
        stack.display();
    }
}