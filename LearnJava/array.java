// import java.util.*;
public class array 
{

  static void A(){// when it will rech to A method then it will go inside search for operation
    B();
  }
  static void B(){
    C();
  }
  static void C(){
    System.out.println("Hello everyone");
  }


  public static void main(String[]args) // 1st the main method will call then
  {
    //Stack Frames
    A(); // 1st  it will search for the A method then it will go to its  A method
    //int arr[5]; wrong method
    // int arr [] = new int[5]; //crct method
    // System.out.println("arr = " + arr);
    // System.out.println("arr =  " + Arrays.toString(arr));

    // int arr1[] = {10,20,30,40,50,60};
    // System.out.println("arr1 = "+ arr1);
    // System.out.println("arr1 = " + Arrays.toString(arr1));
  }
}
