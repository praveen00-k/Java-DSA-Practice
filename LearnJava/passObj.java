public class passObj {
  // static void update(int b[]){
  //   b[0] = 100;
  //   System.out.println("inside update= "+ b[0]);
  // }

  static int[] update()
  {
    int a[] = {10,20,30,40};
    return a;
  }
  // public static void main(String[] args) {
  //   int a[] = {10,20,30};
  //   System.out.println("before method call= " + a[0]);
  //   update(a);

  //   System.out.println("after method call= "+ a[0]);
  // }

  public static void main(String[] args) {
    int b[] =update();
    System.out.println("before modification");
    // System.out.println(b[0] +" "+ b[1] +" "+b[2] +" "+b[3]);
    for( int i =0; i<b.length;i++){
      System.out.print(b[i] + " ");
    }
     System.out.println();
    b[0]=100;
    System.out.println();
    System.out.println("after modification");
    for( int i =0; i<b.length;i++){
      System.out.print(b[i] + " ");
    }
    
  }
}
