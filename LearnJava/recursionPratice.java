import java.util.Scanner;

public class recursionPratice {

  // //work after call
  // public static void fun(int n )
  // {
  //   if(n > 0)
  //   {
  //       fun(n-1);//call
  //       System.out.println(n);// work
        
  //   }
    
  // }

  // //before work call
  // public static void fun1(int n )
  // {

  //   if(n > 0)
  //   {
  //       System.out.println(n);// work
  //       fun1(n-1);//call
  //   }
  // }

  //before call after call work
  // public static void fun2(int n )
  // {
  //   if(n > 0)
  //   {
  //       System.out.println(n);// work
  //       fun2(n-1);//call
  //       System.out.println(n);// work
  //   }
    
  // }

  // public static void print(int n )
  // {
  //   if(n > 5)
  //   {
  //       return ;
  //   }
  //   System.out.println(n);
  //   print(n+1);
  // }

  //count functioncalls
  static int count = 0;
  public static int printNumber(int N)
  {
    count++;
    if(N ==0)
    {
      return count;
    } 
      printNumber(N-1);
      return count;
  }

  //sum of 1st n number
  static int sum = 0;
  public static int sumNumber(int n)
  {
    if( n == 0)
    {
      return sum;
    }
    sum += n;
    return sumNumber(n-1);
    
  }
  
  //factorial of n number
  public static int factorial(int n) 
  {
      if (n <= 1) 
      {
          return 1;
      }
      return n * factorial(n - 1);
  }

  //power of a num
  public static int power(int base, int exponent) {
    if (exponent == 0) {
        return 1;
    }

    return base * power(base, exponent - 1);
}

//sum of digit
  static int sum1 = 0;
  public static int sumOfDigit(int n)
  {
    if(n ==0)
    {
      return sum1;
    }
    sum1 += n % 10;
    sumOfDigit (n/10);
    return sum1;
    
  }

  //reverse a digit
  static int digit = 0;
  public static int reverseDigit(int n)
  {
    if(n == 0)
    {
      return digit;
    }
    digit = digit *10 + n %10;
    return reverseDigit(n / 10);
    

  }

  public static void message()
  {
    System.out.println("Hello World");
    message1();
  }
  static void message1()
  {
    System.out.println("Hello World");
    message2();
  }
  static void message2()
  {
    System.out.println("Hello World");
    message3();
  }
  static void message3()
  {
    System.out.println("Hello World");
    message4();
  }
  static void message4()
  {
    System.out.println("Hello World");
  }

  public static void PrintNumber(int num)
  {
    if(num == 5)
    {
      System.out.println(5);
      return;
    }
    System.out.println(num);
    PrintNumber(num+1);
  }

  //fibonaci series
  static int fibo(int n)
  {
    if(n < 2)
    {
      return n;
    }
    return fibo(n-1)+fibo(n-2);
  }
  public static void main(String[] args) {

    // fun(3);
    // fun1(3);
    // fun2(3);
    // System.out.println(printNumber(8));
    // System.out.println(sumNumber(5));
    // System.out.println(factorial(4));
    // System.out.println(sumOfDigit(121));
    // System.out.println(reverseDigit(4856));
    // message();

    //print a function that takes in a number and print it
    //print first 5 number: 1 2 3 4 5
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter your Number: ");
    // int num = sc.nextInt();
    // PrintNumber(num);

    System.out.println(fibo(50));
    // sc.close();
  }
}
