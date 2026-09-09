public class Main {
    public static void main(String[] args) {
        // System.out.println(25);
        // System.out.println(3.14);
        // System.out.println(3.147258);
        // System.out.println("Hello World");
        // System.out.println('A');
        // System.out.println(true);

        // why variable even though we can print directly
        //because we can use variable to store the value and use it later in the program or if i want to change data then i cant change all 100 data ,
        //  so we use variable to store the value and use it later in the program or if i want to change data then i cant change all 100 data , 
        // so we can change the value of variable and it will be reflected in all the places where we have used that variable

        // int age = 25;
        // System.out.println("my age is : " + age);

        // interger type can be represented in 4 different ways
        // byte b1 = 10;//decimal value
        // byte b2 = 0b1010;//binary value
        // byte b3 = 012;//octal value
        // byte b4 = 0xA;//hexadecimal value
        
        // System.out.println("byte b1 = " + b1);
        // System.out.println("byte b2 = " + b2);
        // System.out.println("byte b3 = " + b3);
        // System.out.println("byte b4 = " + b4);

        // to check the default value of the data type 
        System.out.println("=====Default value of data type=====");
        System.out.println("Default value of byte = " + defaultValue.b);
        System.out.println("default value of short = " + defaultValue.s);
        System.out.println("default value of int = " + defaultValue.i);
        System.out.println("Default valur of long =" + defaultValue.l);
        System.out.println("Default value of float = " + defaultValue.f);
        System.out.println("Default value of double = " + defaultValue.d);
        System.out.println("Default value of char = " + defaultValue.c);
        System.out.println("Default value of boolean = " + defaultValue.bool);

    }
}
class defaultValue{
    static  byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bool;
}