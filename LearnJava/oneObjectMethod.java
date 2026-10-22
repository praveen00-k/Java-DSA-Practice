public class oneObjectMethod {

  // ONE OBJECT for all the method
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

  ////////////////////////////////////////////////////////////////////

  //homework of method*

  ////////////////////////////////////////////////////////////////////

  // add two number using the static non-void method
  static int add(int x , int y)
  {
    return x+y;
  }

  // add two number using the static void method 

  static void addnum(int x , int y)
  {
    System.out.println("sum =" + (x+y));
  }

  ////////////////////////////////////////////////////////////////////

 // add two number using the instance non-void method
  int add1(int x ,int y){
    return x+y;
  }

 // add two number using the instance void method
  void addnum1(int x ,int y)
  {
    System.out.println("Sum = " + (x+y));
  }

  ////////////////////////////////////////////////////////////////////

  // square number using the static non-void method
  static int square(int x)
  {
    return x*x;
  }

  // square number using the static void method
  static void squareStatic(int x)
  {
    System.out.println("square= "+(x*x));
  }

  ////////////////////////////////////////////////////////////////////

  //square number using the instance Non-void method

  int square1(int x){
    return x*x;
  }

  //square number using the instance void  method
  void squareInst(int x)
  {
    System.out.println( "square= " + (x*x));
  }

  ///////////////////////////////////////////////////////////////////
  
  //even or odd number using the static void method
  static void evenOdd(int x)
  {
    if( x % 2 == 0){
      System.out.println("even") ;
    }else
    {
      System.out.println("odd") ;

    }
  }

  //even or odd number using the static Non- void method
  static boolean IsEvenOdd(int x)
  {
    
      return x % 2== 0;
  }

  //even or odd number using the instance void method
  void evenOdd1(int x )
  {
    if(x % 2 == 0)
    {
      System.out.println("even");
    }else
    {
      System.out.println("odd");
    }
  }

  //even or odd number using the instance non-void method
  boolean isEvenOdd(int x )
  {
    return x % 2==0;
  }

  //max of three number using the static method
  static int max3(int x, int y, int z)
  {
    if( x > y)
    {
      if(x > z)
      {
        return x;
      }else{
        return z;
      }
    }else{
      if( y > z){
        return y;
      }else{
        return z;
      }
    }
  }

  //max of three number using the instance method
  int max1(int x, int y, int z)
  {
    if(x > y){
      if(x > z){
        return x;
      }else{
        return z;
      }
    }else{
      if( y >z){
        return y;
      }else{
        return z;
      }
    }
  }

  //count digit in number using the static method
  static int countDigit(int num)
  {
    int count = 0;
    while(num >0){
      count++;
      num = num /10;
      
    }
    return count;
  }

  //count digit in number using the instance method
  int countDigit1(int num){
    int count1 = 0;
    while(num > 0){
      count1 ++;
      num = num / 10;
    }
    return count1;
  }

  //palindrome or not using the static method
  static void pali(int num)
  {
    int original =num;
    int rev = 0;
    while(num > 0){
      int digit = num % 10;
      rev =rev * 10 + digit;
      num /= 10;
    }
    if(original == rev){
      System.out.println("the give number is palindrome");
    }else{
      System.out.println("the give number is not palindrome");
    }
  }

  //palindrome or not using the instance method
  void pali1(int num)
  {
    int original =num;
    int rev = 0;
    while(num > 0){
      int digit = num % 10;
      rev =rev * 10 + digit;
      num /= 10;
    }
    if(original == rev){
      System.out.println("the give number is palindrome");
    }else{
      System.out.println("the give number is not palindrome");
    }
  }

  public static void main(String[] args) {
    oneObjectMethod obj = new oneObjectMethod();
    obj.greet();
    obj.num(10,20);
    int c = obj.getNumber();
    System.out.println("c" +c);
    int max = obj.max(10,30);
    System.out.println("max = " + max);
    System.out.println();

    //homework of method
    System.out.println("//homework of method" );

    ////////////////////////////////////////////////////////////////////
    
    // add two numbers
    System.out.println();
    System.out.println("add two number using the static void method");
    addnum(25, 50);

            System.out.println("////////////////////////////////////////////////");

    System.out.println();
    System.out.println("add two number using the static non-void method ");
    int sum =add(10,20);
    System.out.println("sum= " +sum);

            System.out.println("////////////////////////////////////////////////");


    /////////////////////////////////////////////////////////////////////////////
    
    System.out.println();
    System.out.println("add two number using the instance Non-void method= ");
    int sum1 =obj.add1(20,30);
    System.out.println("sum= "+sum1);

            System.out.println("////////////////////////////////////////////////");


    System.out.println();
    System.out.println("add two number using the instance void method= ");
    int su = obj.add1(20,30);
    System.out.println("sum= "+ su);

            System.out.println("////////////////////////////////////////////////");


    ////////////////////////////////////////////////////////////////////////////
    
    //square number 
    System.out.println();
    System.out.println("square number using the static Non-void method= ");
    int squ = square(12);
    System.out.println("Suqare= " + squ);

            System.out.println("////////////////////////////////////////////////");


    /////////////////////////////////////////////////////////////////////////////
    
    System.out.println();
    System.out.println("square number using the static void method= ");
    squareStatic(15);

            System.out.println("////////////////////////////////////////////////");


    //////////////////////////////////////////////////////////////////////////////
    
    System.out.println();
    System.out.println("square number using the instance Non- void method= ");
    int squInst = obj.square1(10);
    System.out.println("Suqare= " + squInst);

            System.out.println("////////////////////////////////////////////////");


    ///////////////////////////////////////////////////////////////////////////////
    
    System.out.println();
    System.out.println("square number using the instance void method= ");
    obj.squareInst(25);

            System.out.println("////////////////////////////////////////////////");

     ///////////////////////////////////////////////////////////////////////////////
    
     //even odd number
    System.out.println();
    System.out.println("even and odd number using the static void method= ");
    evenOdd(11);

            System.out.println("////////////////////////////////////////////////");

    System.out.println();
    System.out.println("even and odd number using the static non-void method= ");
    boolean result = IsEvenOdd(11);
    if(result){
      System.out.println("even");
    }else{
      System.out.println("odd");
    }

          System.out.println("////////////////////////////////////////////////");

    ///////////////////////////////////////////////////////////////////////////////
    

    System.out.println();
    System.out.println("even and odd number using the instance void method= ");
    obj.evenOdd1(12);

            System.out.println("////////////////////////////////////////////////");

    System.out.println();
    System.out.println("even and odd number using the instance non-void method= ");
    boolean result1 = IsEvenOdd(19);
    if(result1){
      System.out.println("even");
    }else{
      System.out.println("odd");
    }

            System.out.println("////////////////////////////////////////////////");


    //max of three number
    System.out.println();
    System.out.println("max of three number using the static method= ");
    int large = max3(40, 30, 20);
    System.out.println(large);

    System.out.println();
    System.out.println("max of three number using the instance method= ");
    int large1 = obj.max1(40, 30, 20);
    System.out.println(large1);



    //count digit in number
    System.out.println();
    System.out.println("count digit in number using the static method =");
    int digit = countDigit(123456);
    System.out.println("coutn digit= " + digit);

    System.out.println();
    System.out.println("coutn digit in number using the instance method= ");
    int digit1 = obj.countDigit1(4569328);
    System.out.println("count digit= " + digit1);

    //check the give number is palindrome or not
    System.out.println();
    pali(12321);

    System.out.println();
    obj.pali1(1231);
  }
}
