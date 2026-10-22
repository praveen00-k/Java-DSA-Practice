public class SinglyLinkedList {
  public static Node insertAtStart(int value, Node currentHead)
  {
    //creation of new node and set the values
    Node newNode = new Node();
    newNode.data = value;
    newNode.next = null;

    // //test case 1 head is null or list is empty
    // if(currentHead == null)
    // {
    //     return newNode;
    // }
    // else
    // {
    //   //test case 2-> list is not empty or there are one or more nodes
    //   newNode.next = currentHead;
    //   return newNode;
    // }

    //or one or more node exist in the list
    if(currentHead != null){
      newNode.next =currentHead;
    }
    return newNode;
  }
  static Node insertAtEnd(int value, Node head)
  {
    // create a new node
    Node lastNode = new Node();
    lastNode.data = value;
    lastNode.next = null;

    if(head == null)
    {
        return lastNode;
    }

    Node currentLastNode = head;

    while(currentLastNode.next != null){
        currentLastNode=currentLastNode.next;
    }
    currentLastNode.next = lastNode;
    return head;
  }

  static void insertAtMiddle(int key, int value, Node head){
    if(head == null){
      return ;
    }
    Node temp = head;
    while (temp != null && temp.data != key)
    {
      temp = temp.next;
    }

    if(temp == null){
      return ;
    }

    Node middlNode = new Node();
    middlNode.data = value;
    middlNode.next = temp.next;
    temp.next=middlNode;
  }

  //deletion of element in linkedList
  static void testDeletionOperation(){
    Node head = null;
    deletionAtStart(head);
    head = insertAtEnd(1000, head);
    printList(head);
    head = insertAtEnd(450, head);
    printList(head);
    head = insertAtEnd(550, head);
    printList(head);
    head = insertAtEnd(650, head);
    printList(head);
    // deletionAtEnd(head);
    // printList(head);
    deletionKeyNode(450,head);
    printList(head);
  }

  //deletion at start
  static Node deletionAtStart(Node head){
    if(head == null)
    {
      System.out.println("list is empty, no element present in the list");
      return null;
    }
      return head.next;
  }

  //deletion at end
  static Node deletionAtEnd(Node head)
  {
    if(head == null || head.next == null)
    {
      return null;
    }

    Node lastButOne = head;
    while(lastButOne.next.next != null)
    {
      lastButOne = lastButOne.next;
    }
   lastButOne.next = null;
   return head;
  }

  
  //deletion at the middle
  static Node deletionKeyNode(int key, Node head)
  {
    //when list is empty
    if(head == null)
    {
      return null;
    }
    //there is only two node and 1st head is equal to key and return head.
    // next and automaticaly 1st head will delete
    if(head.data == key)
    {
      return head.next;
    }
    else if(head.next == null)
    {
      return head;
    }
    Node temp1 = head.next;
    Node previous =head;
    while(temp1 != null )
    {
      if( temp1.data == key)
      {
        break;
      }
      previous = temp1;
      temp1 = temp1.next;
    }
    if(temp1 != null && temp1.data == key)
    {
      previous.next = temp1.next;
    }
    return head;
  }
  public static void printList(Node head)
    {
      Node monkey =head;
      System.out.print(" head-> ");
      while (monkey != null) 
      {
        System.out.print(monkey.data + "->");
        monkey = monkey.next;
      }
      System.out.print(" null");
      System.out.println();
    }
  public static void main(String[] args)
  {
    Node head = null;
    printList(head);

    //function invocation
    // head = insertAtStart(400, head);
    // // printList(head);

    // head = insertAtStart(300, head);
    // // printList(head);

    // head = insertAtStart(200, head);
    // // printList(head);

    // head = insertAtStart(100, head);
    // printList(head);

    // //print and assign value at end
    // head = insertAtEnd(500, head);
    // printList(head);

    // //print and assign value at middle
    // insertAtMiddle(100, 250, head);
    // printList(head);
    testDeletionOperation();
    printList(head);
  }
}