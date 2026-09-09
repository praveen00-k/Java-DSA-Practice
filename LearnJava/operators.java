// import javax.sound.midi.SysexMessage;

public class operators {
  public static void main(String[] args) {
    int a = 20;
    int b = 30;

    System.out.println("a = " + a);
    System.err.println("b = " + b);
    System.err.println();

    //Arithmetic operation
    System.out.println("======Arithmetic operation======");

    System.out.println("Addition = " + (a + b));
    System.out.println("Subtraction = " + (a - b));
    System.out.println("Multiplication = " + (a * b));
    System.out.println("Division = " + (a / b));
    System.out.println(" Modules = " + (a % b));

    //unary and binary operation
    System.out.println("======unary and binary operation======");
    
    System.out.println("before the pre ++a = " +a);
    ++a;//20
    System.out.println("after pre ++a = " + a);//21
    a++;//21
    System.out.println("after post a++ = " + a);
    a--;
    System.out.println("after a-- = "+ a);

    //int and float 
    System.out.println("======float and double uisng the modules adn division======");
        System.out.println();


    System.out.println("double % double = " + 20.23 % 2.1);
    System.out.println("double / double = " + 20.23 /2.1);

    System.out.println("double % float = " + 20.25 % 2.0f);
    System.out.println("double / float = " + 20.25 % 2.0f);

    System.out.println("float % float = " + 30.0f % 4.0f);
    System.out.println("float / float = " + 20.0f / 6.0f);

    System.out.println("int % int= " + 20 / 6);
    System.out.println("int / int = " + 20 / 6);



    //precedence
    System.out.println("======precedence======");
    System.out.println();
    System.out.println("sum = " + (20 - 5 + 2 * 3));
    System.out.println("sum = " + (20 - 5 / 2 * 3));
    System.out.println("sum = " + (20 - 5 * 2 / 3));
    System.out.println("sum = " + (20 - ( 5 + 2)));

    // //Boolean

    // boolean x = true;
    // boolean y = false;
    // // System.out.println("sum value = " + (x + y));



    double num = 8.1;

    // Integer part
    int integerPart = (int) num;
    double fractionalPart = num - integerPart;

    System.out.println("Integer part: " + integerPart);
    System.out.println("Fractional part: " + fractionalPart);

    // Convert integer part to binary
    System.out.print("Binary: ");

    System.out.print(Integer.toBinaryString(integerPart));
    System.out.print(".");

    // Convert fractional part to binary
    for (int i = 0; i < 20; i++) {
      fractionalPart = fractionalPart * 2;

      if (fractionalPart >= 1) {
        System.out.print("1");
        fractionalPart = fractionalPart - 1;
      } else {
          System.out.print("0");
        }
    }
    
  }
}
