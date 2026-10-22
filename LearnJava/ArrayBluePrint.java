public class ArrayBluePrint {
  public static void main(String[] args) {
    MyArray myarray = new MyArray();
    System.out.println("initial array");
    myarray.printArray();

    //insert at end
    myarray.insertAtEnd(10);
    myarray.insertAtEnd(20);
    myarray.insertAtEnd(30);
    myarray.insertAtEnd(40);
    myarray.insertAtEnd(50);
    System.out.println("after inserting ");
    myarray.printArray();

    //================deletion================
    myarray.deletFromAnyPosition(2);
    System.out.println("after deleting from anywhere");
    myarray.printArray();
    myarray.deletFromEnd();
    System.out.println("after deleting from end");
    myarray.printArray();
    myarray.deletFromStart();
    System.out.println("after deleting from start");
    myarray.printArray();

    // //insert at start
    // myarray.insertAtStart(10);
    // myarray.insertAtStart(20);
    // System.out.println("after inserting at start");
    // myarray.printArray();
    

    // System.out.println("after inserting at index 2");
    // myarray.printArray();
    // myarray.insertAtIndex(200, 2);
    // System.out.println("after inserting at index 2 again");
    // myarray.printArray();
  }
  
}
