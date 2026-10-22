public class varArgs
{
  // static int countEven(int...a){
  //   int count= 0;
  //   for(int x :a){
  //     if( x % 2 == 0){
  //       count++;
  //     }
  //   }
  //   return count;
  // }
  // static void show(int...a){
  //   for(int i =0; i<a.length; i++){
  //     System.out.print(a[i]);
  //     if( i != a.length-1)
  //   {
  //     System.out.print(",");
  //   }
  //   }
    
  // }
  // static void show()
  // {
  //   System.out.println("No Args" );
  // }
  // static void show(int a){
  //   System.out.println("One Args");
  // }
  // static void show(int a, int b){
  //   System.out.println("Two Args");
  // }

  // static int countKey(int key,int...a){
  //   int count = 0;
  //   for(int x : a){
  //     if(key == x){
  //       count ++;
  //     }
  //   }
  //   return count;
  // }

  // static void showNames(String...name){
  //   for(String n : name){
  //     System.out.println(n);

  //   }
  // }
  // static void objectShow(Object...values)
  // {
  //   // for(Object value : values){
  //   //   System.out.print(value + ",");
  //   // }
  //   for(int i =0; i <values.length ; i++){
  //     System.out.print(values[i] + ", ");
  //   }

  // }

  public static void main(String[] args)
  {
    int  n = 789456;
    int rev = 0;
    while(n > 0){
      int digit = n % 10;
      rev = rev * 10 + digit;
      n = n/10;
    }
    System.out.println(rev);

    // objectShow("ram");
    // objectShow(10,20,30.5f,40);
    // objectShow(10,"java",true);
    // showNames("pravankumar","adrash", "guja");
    // System.out.println(countKey(20,10,20,15,13,16,20,19,20,142));
    // // show(15,16,17,18,19);
    // show();
    // show(15);
    // show(15,16);
    
    // System.out.println(countEven(10,20,15,13,16,19,142));
  }
}
