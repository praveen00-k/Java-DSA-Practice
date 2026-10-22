import java.util.*;
public class dsaArray {
  static void printLeftToRight(int[] a){
    System.out.println("left to right");

    for(int i=0; i<a.length; i++){
      System.out.print(a[i]+" ");
      if( i != a.length-1){
        System.out.print("->");
      }
    }
    System.out.println();
  }
  static void printRightToLeft(int[] a){
    System.out.println("right to left");
    for(int i=6; i >= 0; i--){
      System.out.print(a[i]+" ");
      if( i != a.length){
        System.out.print("->");
      }
    }
    System.out.println();
  }
  static void twoPoniter(int []a){
    System.out.println("two pointers");
    int left =0;
    int right = a.length-1;
    while (left <= right) {
      System.out.print(a[left++]);
      if(left <= right){
        System.out.print("->" +a[right --]);
      }
      if(left < a.length -1){
        System.out.print("->");
      }
    }
    System.out.println();
  }
  
  static void printfromCenterToend(int[]a)
  {
    System.out.println("print from Center To end");
    int n = a.length;
    if(n % 2 !=0)
    {
      int left = n/2;
      int right = n/2;
      System.out.print(a[left]+ " ");
      left --;
      right++;
      while(left >=0 || right <n)
      {
        if(left >=0)
        {
          System.out.print(a[left]+" ");
          left--;
        }
        if( right <n)
        {
          System.out.print(a[right] + " ");
          right++;
        }
      }
    }
    else
    {
      int left = (n/2)-1;
      int right = (n/2);
      while(left >=0 || right < n)
      {
        if(left >=0){
          System.out.print(a[left]+" ");
          left--;
        }
        if(right < n){
          System.out.print(a[right] + " ");
          right++;
        }
      }
    }

  }
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int []a = {10,20,30,40,50,60,70};
    printLeftToRight(a);
    printRightToLeft(a);
    twoPoniter(a);
    printfromCenterToend(a);
    sc.close();
  }
  
}