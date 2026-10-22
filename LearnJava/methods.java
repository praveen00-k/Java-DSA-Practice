public class methods 
{
  // static void display()
  // {
  //   System.out.println("Hello");
  // }

  //demo non-void return type

  static int max(int x, int y)
  {
    if(x > y)
    {
      return x;
    }else{
      return y;
    }

    //System.out.pritnln(a); we cannot call the a value in the max()method becoz it belongs to the different method 
  }
  public static void main(String[] args) {
    // display();

    int a = 10 ; int b = 20;
    int c = max(a,b);//call method
    System.out.println(c);

    //System.out.println(x);//we can not call the x value in the main method
  }
}



//how deleted file can be recovered from the laptop and mobile & read about the storage and get know about it.