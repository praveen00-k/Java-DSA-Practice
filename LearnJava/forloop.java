// import java.util.*;

public class forloop {
  public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a number = ");
    // String num = sc.next();
    // boolean binary = true;
    // boolean octal = true;
    // boolean decimal = true;
    // boolean hexadecimal = true;

    // for (int i = 0; i < num.length(); i++)
    // {
    //   char ch = num.charAt(i);

    //   // Binary: 0-1
    //   if (ch < '0' || ch > '1') {
    //       binary = false;
    //   }

    //   // Octal: 0-7
    //   if (ch < '0' || ch > '7') {
    //       octal = false;
    //   }

    //   // Decimal: 0-9
    //   if (ch < '0' || ch > '9') {
    //       decimal = false;
    //   }

    //   // Hexadecimal: 0-9, A-F, a-f
    //   if (!((ch >= '0' && ch <= '9') ||(ch >= 'A' && ch <= 'F') ||(ch >= 'a' && ch <= 'f'))) {
    //       hexadecimal = false;
    //   }
    // }

    //   if (binary) {
    //     System.out.println("Number System = Binary");
    //     System.out.println("Radix = 2");
    //     System.out.println("Base = 2");

    //   } else if (octal) {
    //     System.out.println("Number System = Octal");
    //     System.out.println("Radix = 8");
    //     System.out.println("Base = 8");

    //   } else if (decimal) {
    //     System.out.println("Number System = Decimal");
    //     System.out.println("Radix = 10");
    //     System.out.println("Base = 10");

    //   } else if (hexadecimal) {
    //     System.out.println("Number System = Hexadecimal");
    //     System.out.println("Radix = 16");
    //     System.out.println("Base = 16");

    //   } else {
    //     System.out.println("Invalid number");
    //   }

    //   sc.close();

    
    // while (num >0) {
    //   int digit =  num % 10;
    //   num = num / 10;
    //   System.out.println("output is = " + digit);
    // }
    
    //count the number
    // int count = 0 ;
    // while(num > 0){
    //   int d1 = num % 10;
    //   count ++;
    //   num =num / 10;
    // }
    // System.out.println("total count is = " + count);

    //rever the number

  
    // int result = 0;
    // while(num < 0)
    // {
    //   int digit = num % 10;
    //   result = result * 10 + digit;
    //   num /= 10;
    // }
    // System.out.println(result);

    // int original =num;
    // int rev = 0;
    // while( num > 0){
    //   int digit = num % 10;
    //   rev = rev * 10 + digit;
    //   num = num / 10;
    // }
    // if(original == rev)
    //   {
    //   System.out.println("the give number is palindrome ");
    // }else{
    //   System.out.println("the give number is not a palindrome");
    // }

    //nested loops
    // for(int i = 1 ; i <= 3; i++)
    // {
    //     for(int j = 1 ; j <= 3 ; j++)
    //     {
    //         System.out.print(" ( " + i + "," + j +") " );
    //     }
    //     System.out.println();
    // }

    for(int i = 1; i <= 10; i++){
       if( i == 5){
        break;
       }
       System.out.println(i);
    }
    
    System.out.println("=================<<=>>=================");


    for (char ch = 'A' ; ch <= 'Z'; ch++){
      if(ch == 'M'){
        break;
      }
      System.out.println(ch);
    }
     System.out.println("=================<<=>>=================");

    for (int i = 1 ; i <=10; i++){
      if( i == 7){
        break;
      }
      System.out.println(i);
    }

   System.out.println("=================<<=>>=================");

   System.out.println("odd numbers =");
   for(int i =1; i<=20; i++){
    if(i % 2 !=0 ){
      System.out.print(i + " ");
    }
   }
   System.out.println();

   System.out.println("=================<<=>>=================");

   System.out.println("even numbers = ");

   for(int j = 1; j<=20 ; j++){
    if(j % 2 == 0 ){
      System.out.print(j + " ");
    }
   }
    System.out.println();

    System.out.println("=================<<=>>=================");


    for(int i = 1; i<= 1 ; i++){
      for(int j = 1 ; j<=3; j++){
        System.out.print("*");
      }
    }
    System.out.println();

    for(int i = 1; i<= 1 ; i++){
      for(int j = 1 ; j<=3; j++){
        System.out.print("A");
      }
    }
    System.out.println();
      
    for(int i = 1; i<= 1 ; i++){
      for(int j = 1 ; j<=3; j++){
        System.out.print(j);
      }
    }
    System.out.println();


    // to check the give number is armstrong or not
    int num = 370;
    int original = num;
    int result = 0;
    while(num > 0){
      int dig = num % 10;
      result += (dig * dig * dig);
      num /= 10;
    }
    if( original == result){
      System.out.println("the give number is armstrong");
    }else{
      System.out.println("the give number is not a armstrong");
    }

    // to write a fibonaci series

    int n = 10;
    int a = 0;
    int b = 1;
    int count = 0;
    while(count < n){
      System.out.println(a + " ");
      int c= a+b;
      a = b;
      b = c;
      count++;
    }
  }

}
