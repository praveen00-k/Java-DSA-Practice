public class waysofMethods 
{

  //1.no args , no return
  static void greet()
  {
    System.out.println("hi");
  }

  // 2.args but no return
  static void num(int x, int y)
  {
    System.out.println("sum = " + (x+y) );
  }

  //3.no args but return
  static int getNumber()
  {
    return 100;
  }

  //4.args and return
  static int max(int x , int y )
  {
    if(x > y){
      return x;
    }else{
      return y;
    }
  }
  public static void main(String[] args)
  {
    //1
    System.out.println("method 1 ->");
    greet();
    //2
    System.out.println("method 2 ->");

    int a =10 ; int b =20;
    num(a,b);

    //3
    System.out.println("method 3 ->");
    int get =getNumber();
    System.out.println(get);

    //4
    System.out.println("method 4 ->");

    int d=10; int e =20;
    int f =max(d,e);
    System.out.println(f);

  }
}
