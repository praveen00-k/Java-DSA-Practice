import java.util.Scanner;
public class LinearSearch {
  //linear search of number in an array
  // static void linearSearch(int key,int[] arr)
  // {
  //   boolean found = false; //key not found
  //   for(int i = 0; i<arr.length; i++){
  //     if(arr[i] == key){
  //       System.out.println(key + " is found at index " + i);
  //       found = true;
  //       break;
  //     }
  //   }
  //   if(found == false){
  //     System.out.println("element not found");
  //   }
  // }
  static int linearSearch1(int key,int size,int[] arr)
  {
    for(int i = 0; i<arr.length; i++)
    {
      if(arr[i] == key){
        System.out.println("key found at index: "+ i);
        return i;
      }
    }
    return -1;
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  
    System.out.println("enter the size: ");
    int size = sc.nextInt();
    System.out.println("enter the array element: ");
    int [] arr = new int[size];
    for(int i = 0; i<size; i++){
      
      arr[i] += sc.nextInt();
    }
    System.out.println("enter the key: ");
    int key =sc.nextInt();

    int ans = linearSearch1(key, size,arr);
    System.out.println(ans);
    sc.close();

  }
}
