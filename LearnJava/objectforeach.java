public class objectforeach {
  //1.no args , no return
   void greet()
  {
    System.out.println("hi");
  }

  // 2.args but no return
   void num(int x, int y)
  {
    System.out.println("sum = " + (x+y) );
  }

  //3.no args but return
   int getNumber()
  {
    return 100;
  }

  //4.args and return
   int max(int x , int y )
  {
    if(x > y){
      return x;
    }else{
      return y;
    }
  }
  public static void main(String[] args) {
    //1.
    objectforeach obj1 =new objectforeach();
    obj1.greet();

    //2.
    objectforeach obj2 =new objectforeach();
    obj2.num(10,20);

    //3.
    objectforeach obj3 = new objectforeach();
    int a = obj3.getNumber();
    System.out.println("a = "+ a);

    //4.
    objectforeach obj4 = new objectforeach();
    int c =obj4.max(10,20);
    System.out.println("c = " +c );

  }
}
