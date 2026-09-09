public class homeWork {

  //declaring outside the method
  // static int age = 10;
  public static void main(String[] args) {
    // assingment 

    // area of triangle

    // int breath = 10;
    // int height = 20;
    // double area = (0.5) * (breath * height);

    // System.out.println(area);

    // // //circumference of circle

    // int radius = 20;
    // float pi = 3.14728f;
    // double A = (2 * pi * radius);
    // System.out.println(A);

    // //avg marks of student and percentage
    // int english = 85;
    // int maths = 90;
    // int science = 85;
    // int kannada = 75;
    // int socialScience = 65;
    // int totalmarks = english + maths + science + kannada + socialScience /5;

    // double percentage = totalmarks *100 /500;

    // System.out.println("total marks of student = " +totalmarks);
    // System.out.println("total percentage of marks = " + percentage);

    // c to f and f to c
    // double celsius  = 32;
    // double Fahrenheit  = (celsius * (9.0/5)+32);
    // System.out.println("fahrenite = " + Fahrenheit );

    // double f = 63;
    // double c = (( f-32)*5/9);
    // System.out.println("celsius = " + c);


    // to find ascii value 
    // char a = 'A';
    // int ascii = a;
    // System.out.println(a);
    // System.out.println("A it's ascii value is = " + ascii );

    // to find uniqu code

    // char ch = 'C';
    // int unicode = ch;
    // System.out.println("Character = " + ch);
    // System.out.println("Unicode value = " + unicode);



        // Using literals
        // int age = 22;
        // double salary = 25000.50;
        // char grade = 'A';
        // boolean passed = true;
        // String name = "Praveen";

        // Using variables
        // System.out.println("Name = " + name);
        // System.out.println("Age = " + age);
        // System.out.println("Salary = " + salary);
        // System.out.println("Grade = " + grade);
        // System.out.println("Passed = " + passed);
    


        // Integer division
        // int a = 10;
        // int b = 3;

        // int result1 = a / b;

        // System.out.println("Integer division = " + result1);

        // Floating-point division
        // double x = 10;
        // double y = 3;

        // double result2 = x / y;

        // System.out.println("Floating division = " + result2);

        //declaring the using the static and inside method

        // int age1 = 30;

        // System.out.println(age);
        // System.out.println(age1);

        //what happens if the variable is instance
        // students s1 = new students();
        // students s2 = new students();
        // s2.age= 25;
        // System.out.println(s1.age);
        // System.out.println(s2.age);


        //convert the seconds to hours,min and seconds

        // int seconds = 3600;

        // int hours = seconds /3600;    // 1 hours -> 60min ,1min -> 60sec 60*60=3600sec
        // int remainingsec = seconds % 360;
        // int mintues = remainingsec / 60;
        // int second = remainingsec % 60;


        // System.out.println("hours = " + hours + " ,mintues = " + mintues + " ,second = " + second);


        //reverse a 3 digit number

        // int digit = 527;
        // int rev = 0;
        // while (digit != 0) {
        //   int number = digit % 10;
        //   rev = rev * 10 + number;
        //   digit = digit / 10;
        // }
        // System.out.println("reverse number is = " + rev);
        
        //extract number from the digit

        // int number = 786;
        // while (number != 0) {
        //   int digit = number % 10;
        //   System.out.println(digit);
        //   number = number /10;
        // }

        //add digit -> (482)
        // int digit = 482;
        // int sum =0;
        // while (digit != 0) {
        //   int number =digit % 10;
        //   sum += number;
        //   digit /= 10;
        // }
        // System.out.println(sum);


        //convert days to years and months
        // int days = 550;
        // int years = days / 365;
        // int remainindays = days % 365;

        // int months = remainindays / 30;
        // int day = remainindays % 30;
        // // int months =remainingdays / 12;

        // System.out.println("years = " + years +" ,moths = " + months + " ,day = " + day);

        // cinema seating Arrangment
        // int totalAudience = 121;
        // int seatsPerRow = 12;

        // int completeRows = totalAudience / seatsPerRow;
        // int lastRow = totalAudience % 12;

        // System.out.println("complete rows = " + completeRows + " ,People in last row = " + lastRow);
        ///
        /// 
        //

        // //increment by 3
        // for(int i = 1 ; i <=10 ; i+=3){
        //   System.out.println(i);
        // }

        // //increment by 5
        // for(int i = 1 ; i <=20 ; i+=5){
        //   System.out.println(i);
        // }

        // //reverse alphabets
        // for( char ch = 'z' ; ch >= 'a'; ch--){
        //   System.out.println(ch);
        // }

        // //print 1 to 100
        // for (int i =1 ; i<=100; i++){
        //   System.out.println(i);
        // }

        //print multipication table
        // for(int i = 1; i <=10 ; i++){
        //   System.out.println("5 * "+ i + " = " +5 * i);
        // }

        // //square of first 10 number
        // for(int i = 1; i<10; i++){
        //   System.out.println("Square of  10 = " + i*i);
        // }

        // //cude of first 10 number
        // for(int i = 1; i <=10; i++){
        //   System.out.println(i*i*i);
        // }

        // //sum of first N number
        // int num =10;
        // int sum = 0;
        // for(int i = 1; i<=num; i++){
        //   sum = sum + i;
        // }
        // System.out.println("Total sum is "  + sum);

  }
}
// class students{
//   int age = 20;
// }