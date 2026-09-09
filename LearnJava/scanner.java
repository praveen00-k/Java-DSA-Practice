// import java.util.*;

public class scanner {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter the 1st number = ");
    // int a = sc.nextInt();
    // System.out.println("enter the 2nd number = ");
    // int b = sc.nextInt();
    // int c = a+b;
    // System.out.println("c: " + c);

    // // area of triangle
    // System.out.print("enter the base = ");
    // int base = sc.nextInt();
    // System.out.print("enter the height = ");
    // int height = sc.nextInt();
    // double area = 0.5 * (base * height);
    // System.out.println("area = " + area);
    // sc.close();


    //increment and decrement
    int count = 10;
    System.out.println("1st count++ = " + count++);//10
    System.out.println("count = " + count);//11
    System.out.println("2nd count++ = " + count++);//11 -> 12
    System.out.println("count = " + count);//12
    System.out.println("count++ = " + count++);//13
     
    System.out.println("==========post decrement==========");

    System.out.println("count-- = " + count);//13
    System.out.println("1st count-- = " + count--);//13 -> 12
    System.out.println("count-- = " + count);//12
    System.out.println("2nd count-- = " + count--);//12 -> 11
    System.out.println("count-- = " + count);//11

    System.out.println("===========pre increment=========");

    System.out.println("count = " + count);//11
    System.out.println("1st ++count = " + ++count);//11 -> 12
    System.out.println("++count = " + count);//12
    System.out.println("2nd ++count = " + ++count);//12 -> 13
    System.out.println("++count = " + count);//13

    System.out.println("===========pre decrement=========");

    System.out.println("count-- = " + count);//13
    System.out.println("1st --count = " + --count);//13 -> 12
    System.out.println("--count = " + count);//1
    System.out.println("2nd --count = " + --count);//12-> 11
    System.out.println("--count = " + count);//11

    int store = count;//11
    store++;//11 - >12
    System.out.println("strore= " + store);//12

    System.out.println("===========example=========");

    int count1 = 12;
    int count2 = count1++;
    System.out.println(count1);//12
    System.out.println(count2);//13

    System.out.println("===========example=========");
    int a = 12;
    int b = ++a;
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    System.out.println("===========example=========");

    int c =10;
    System.out.println( c++ + 5);//15
    System.out.println("c= " + c);//11
    System.out.println(++c + 5);//16
    System.out.println("c= " + c);//11 -> 12


    System.out.println("=====confusing behaviours=====");
    int num1 = 10;
    System.out.println(num1++ + ++num1);//10 + 12 =22
    int num2=11;
    System.out.println(num2++ + num2++);//11 + 12 =23
    int num3=11;
    System.out.println(num3++ - ++num3);//11 -> 12 , - 12-> 13 = 11 - 13 = -2
    int num4 = 20;
    System.out.println(++num4 + --num4);//21 + 20 = 41

    int x = 5;
    int y = 10;
    System.out.println(x++ + ++y);//5 (-> 6) + 11 = 16
    System.out.println(x);//6
    System.out.println(y);//11
    System.out.println(x++ + x++);//6(->7)+  7(-> 8) =6 + 7 =13
  }
}
