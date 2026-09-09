public class basicDataType {
  public static void main(String[] args){

    //demo of data type promtion

    //byte + byte -> int
    // byte b1 = 10;
    // byte b2 = 20;
    // // byte result1 = b1 + b2;   //lossy conversion from int to byte
    // int result1 = b1 + b2;      // CORRECt
    // System.out.println("byte + byte = " + result1);


    // //byte + short -> int
    // byte b = 10;
    // short s = 20;
    // // short result2 = b + s;   //lossy conversion
    // int result2 = b + s;        // CORRECT
    // System.out.println("byte + short = " + result2 );


    // //int + long -> long
    // int i = 100;
    // long l = 200L;
    // // int result3 = i + l;     //lossy conversion
    // long result3 = i + l;       // CORRECT
    // System.out.println("int + long = " + result3 );


    // //int + float -> float
    // int x = 10;
    // float f = 20.5f;
    // // int result4 = x + f;     //lossy conversion
    // float result4 = x + f;      // CORRECT
    // System.out.println("int + float = " + result4);


    // //float + double -> double
    // float f1 = 10.5f;
    // double d = 20.5;
    // // float result5 = f1 + d;  //lossy conversion
    // double result5 = f1 + d;    // CORRECT
    // System.out.println("float + double = " + result5);


    // //char + char -> int
    // char c1 = 'A';
    // char c2 = 'B';
    // // char result6 = c1 + c2;  //lossy conversion
    // int result6 = c1 + c2;     // CORRECT
    // System.out.println("char + char = " + result6);


    // //char + int -> int
    // char c = 'A';
    // int number = 10;
    // int result7 = c + number;   // CORRECT
    // System.out.println("char + int = " + result7);


    // //short + short -> int
    // short s1 = 10;
    // short s2 = 20;
    // // short result8 = s1 + s2; //lossy conversion
    // int result8 = s1 + s2;     // CORRECT
    // System.out.println("short + short = " + result8);


    // //long + float -> float
    // long l1 = 100L;
    // float f2 = 20.5f;
    // float result9 = l1 + f2;    // CORRECT
    // System.out.println("long + float = " + result9);


    // //double + anything -> double
    // double d1 = 10.5;
    // int n = 20;
    // double result10 = d1 + n;   // CORRECT
    // System.out.println("double + int = " + result10);
          
    // //short + char -> int

    // short z1 = 30;
    // char y1 = 'A';
    // //char x1 = z1 + y1;    //lossy conversion
    // int x1 = z1 + y1;      //CORRECT 
    // System.out.println("short + char = " + x1);


    // //class loader
    // int a = 10;
    // int b = 20;
    // int c = a+b;
    // String str = new String("sum" + c);
    // System.out.println(str + c);

    // long timeMs = System.currentTimeMillis();
    // System.out.println("Time: " + timeMs + " ms");
  }
}