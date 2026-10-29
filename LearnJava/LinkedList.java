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

    //return nth node from head of the singly linked list
    static Node nthFromHead(Node head, int n) {
    if (n <= 0) return null;

    int count = 1;
    while (head != null) {
        if (count == n) {
            return head;
        }
        head = head.next;
        count++;
    
    }
    return null; // If n is greater than the length of the list
    }  

    //return number of node in the singly linked list
    static int countNodes(Node head)
    {
        int count = 0;
        while(head != null)
        {
            count++;
            head = head.next;
        }
        return count;
    }


    //find sum all the values and return the sum of singly
    static int sumOfNodes(Node head)
    {
        int sum = 0;
        while(head != null)
        {
            sum += head.data;
            head = head.next;
        }
        return sum;
    }

    // find the sum of even nodes
    static int sumOfEvenNodes(Node head)
    {
        int count = 0;
        int sum = 0;
        while(head != null)
        {
            count++;
            if(count  % 2 == 0)
            {
                sum += head.data;
            }
            else
            {
                sum += 0;
            }
            head = head.next;
        }
        return sum;
    }

    // find the sum of odd nodes
    static int oddSumOfNodes(Node head)
    {
        int count = 0;
        int sum = 0;
        while(head != null)
        {
            count++;
            if(count % 2 != 0)
            {
                sum += head.data;
            }
            else{
                sum+=0;
            }
            head = head.next;
        }
        return sum;
    }

    //find the difference between the sum of odd nodes and even nodes
    static int differenceOfOddEven(Node head)
    {
        int oddSum = oddSumOfNodes(head);
        int evenSum = sumOfEvenNodes(head);
        return oddSum - evenSum;
    }

    // to join 2nd list at the end of 1st list
    static void joinLists(Node head1, Node head2)
    {
        if(head1 == null)
        {
            head1 = head2;
            return;
        }
        Node temp = head1;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = head2;
    }


    //which takes two singly linked list and create circular linked list from them
    static Node createCircularList(Node head1, Node head2)
    {
        if(head1 == null && head2 == null)
        {
            return null;
        }
        
        if(head1 == null)
        {
            head1 = head2;
            return head1;
        }
        Node temp = head1;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = head2;

        // Now make it circular
        Node lastNode = head2;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
        }
        lastNode.next = head1; // Making it circular

        return head1;
    }

    //to return value of the middle node of the signly linked list
    static int middleNodeValue(Node head)
    {
        //list is empty
        if(head == null)
        {
            return 0;
        }

        Node slow  = head;
        Node fast = head;

        //list has only one node
        if(head.next == null)
        {
            return head.data;
        }

        while(fast !=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    //to return the value of the 5th even number in the singly linked list
    static int fifthEvenValue(Node head)
    {
        int count = 0;
        while(head != null)
        {
            if(head.data % 2 == 0)
            {
                count++;
                if(count == 5)
                {
                    return head.data;
                }
            }
            head = head.next;
        }
        return -1; // If there are less than 5 even numbers
    }

    //return the decimal value of the list and every node has single digit number
    static int decimalValue(Node head)
    {
        int decimalValue = 0;
        while(head != null)
        {
            decimalValue = decimalValue* 10 + head.data;
            head = head.next;
        }
        return decimalValue;
    }

    //to find if list is palindrome or not
    static boolean ispalindrome(Node head)
    {
        if(head == null || head.next == null)
        {
            return true;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null;
        Node curr = slow;
        while(curr != null)
        {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        Node firstHalf = head;
        Node secondHalf = prev;
        while(secondHalf != null)
        {
            if(firstHalf.data != secondHalf.data)
            {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    //return true if two list has same vlaue and same order otherwise return false
    static boolean isEqual(Node head1, Node head2)
    {
        while(head1 != null && head2 != null)
        {
            if(head1.data != head2.data)
            {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1 == null && head2 == null;
    }

    //to remove duplicate node and value are sorted order
    static void removeDuplicates(Node head)
    {
        if(head == null)
        {
            return;
        }
        Node current = head;
        while(current != null && current.next != null)
        {
            if(current.data == current.next.data)
            {
                current.next = current.next.next;
            }
            else
            {
                current = current.next;
            }
        }
    }
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);
        list.insertAtBeginning(50);

    list.insertAtEnd(40);
        list.insertAfter(20, 30);

        list.display();
        System.out.println("Sum of all nodes: " + LinkedList.sumOfNodes(list.head));
        System.out.println("Sum of even nodes: " + LinkedList.sumOfEvenNodes(list.head));
        System.out.println("Sum of odd nodes: " + LinkedList.oddSumOfNodes(list.head));
        System.out.println("Difference between odd and even sum: " + LinkedList.differenceOfOddEven(list.head));
        System.out.println("Value of the middle node: " + LinkedList.middleNodeValue(list.head));
        System.out.println("Value of the 5th even number: " + LinkedList.fifthEvenValue(list.head));
        System.out.println("Decimal value of the list: " + LinkedList.decimalValue(list.head));
        System.out.println("Is the list a palindrome? " + LinkedList.ispalindrome(list.head));
        System.out.println("Are the two lists equal? " + LinkedList.isEqual(list.head, list.head));
    }
}