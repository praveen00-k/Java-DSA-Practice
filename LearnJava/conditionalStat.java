import java.util.*;
public class conditionalStat {
  public static void main(String[] args) {

    //if statement
    // if(true){
    //   System.out.println("this is if statement");
    // }

    //if-else statement
    Scanner sc =new Scanner(System.in);
    // System.out.print("enter your age= ");
    // int age =sc.nextInt();
    // if (age >= 18) {
    //   System.out.println("you are eligible to vote");
    // } else {
    //   System.out.println("you are not eligible to vote");
    // }


    // if else if statement
    // System.out.print("enter your marks = ");
    // int marks =sc.nextInt();
    // if(marks >= 90){
    //   System.out.println("grade A");
    // }else if(marks >= 80){
    //   System.out.println("grade B");
    // }else if(marks   >= 70){
    //   System.out.println("grade C");
    // }else{
    //   System.out.println("grade D");
    // }

    //nested if else statement
    // System.out.println("enter your age = ");
    // int age1 =sc.nextInt();
    // System.out.println("India citizenship : true or false");
    // boolean citizenship = sc.nextBoolean();
    // if(age1 >= 18){
    //   if(citizenship){
    //     System.out.println("your are eligibale to vote");
    //   }
    //   else{
    //     System.out.println("your are not eligibale to vote");
    //   }
    // }else{
    //   System.out.println("yours age is less than 18, you are not eligibale to vote");
    // }
    //switch statement
    // System.out.println("enter days number from  1 to 7 = " );
    // int day = sc.nextInt();
    // switch (day) {
    //   case 1:
    //     System.out.println("Monday");
    //     break;
    //   case 2:
    //   System.out.println("Tuesday");
    //     break;
    //   case 3:
    //     System.out.println("Wednesday");
    //     break;
    //   case 4:
    //     System.out.println("Thursday");
    //     break;
    //   case 5:
    //     System.out.println("Friday");
    //     break;
    //   case 6:
    //     System.out.println("Saturday");
    //     break;
    //   case 7:
    //     System.out.println("Sunday");
    //     break;
    //   default:
    //     System.out.println("Invalid day number");
    //     break;
    // }


    // switch using ternary operator
    // System.out.println("Enter your age = ");
    // int age =sc.nextInt();
    // String result = (age >= 18)? "yes": "No";
    // switch(result){
    //   case "yes":
    //     System.out.println("Your are eligible to vote");
    //     break;
    //   case "No":
    //     System.out.println("you are not eligible to vote");
    //     break;
    //   default:
    //     System.out.println("Invalid input");
    //     break;
    // }
    

    //home work
    // college admission eligibale for admission using switch
    // System.out.println("enter your mark = ");
    // int marks = sc.nextInt();
    // Boolean passed =true;
    // String result = (marks >= 85 && passed == true) ? "true" : "false";
    // switch(result){
    //   case "true":
    //     System.out.println("your are eligible for admission");
    //     break;
    //   case "false":
    //   System.out.println("your are not eligible for admission");
    //   default:
    //     System.out.println("Invalid input");
    //     break;
    // }

    //college admission eligibale for admission using if else
    // int marks1 = 90;
    // boolean passed1 =true;
    // if(marks1 >= 85 && passed1 == true){
    //   System.out.println("your are eligible for admission");
    
    // }else{
    //   System.out.println("your are not eligible for admission");
    // }

    //to check sunday is hoiday and saturday is working day using switch
    // System.out.println("enter the day number day= ");
    // String day = sc.nextLine();
    // String result2 = (day.equals("Sunday") || day.equals("Saturday")) ? "holiday" : "working day";
    // switch(result2){
    //   case "holiday":
    //     System.out.println("It's a holiday!");
    //     break;
    //   case "working day":
    //     System.out.println("It's a working day.");
    //     break;
    //   default:
    //     System.out.println("Invalid input.");
    //     break;
    // }

    //login check using if else
    // System.out.println("enter your username = ");
    // String username = sc.nextLine();
    // System.out.println("enter your password = ");
    // String password = sc.nextLine();
    // if(username.equals("Admin") && password.equals("1234")){
    //   System.out.println("Login successfull !");
    // }else{
    //   System.out.println("Invalid Username or passwords");
    // }

    //check if the number is positive or not 
    // System.out.println("enter the number = ");
    // int number = sc.nextInt();
    // if (number > 0){
    //   System.out.println("the number is positive");
    // }else if (number <0){
    //   System.out.println("the number is negative");
    // }else{
    //   System.out.println("the number is zero");
    // }


    //check uppercase or not using if else
    // char ch = 'A';
    // if (Character.isUpperCase(ch)){
    //   System.out.println("the character is uppercase");
    // }else{
    //   System.out.println("the character is not uppercase");
    // }


    // check number is even or odd using if else
    // System.out.println("enter the number = ");
    // int num = sc.nextInt();
    // if( num % 2 == 0){
    //   System.out.println("the number is even ");
    // }else{
    //   System.out.println("the number is odd ");
    // }

    //largest of two number using if else
    //   System.out.println("enter the 1st number = ");
    // int num1 = sc.nextInt();
    // System.out.println("enter the 2nd number = ");
    // int num2 = sc.nextInt();
    // if(num1 > num2){
    //   System.out.println("the largest number is  = " + num1);
    // }else{
    //   System.out.println("the largest number is = " + num2);
    // }

    //largest of three number using if else if
    // System.out.println("enter the 1st number = ");
    // int  n1 = sc.nextInt();
    // System.out.println("enter the 2nd number = ");
    // int n2 =sc.nextInt();
    // System.out.println("enter the 3rd number = ");
    // int n3 = sc.nextInt();
    // if(n1 > n2 && n1 > n3){
    //   System.out.println("the largest number is = " + n1);
    // }else if (n2 > n1 && n2> n3){
    //   System.out.println("the largest number is = " + n2);
    // }else{
    //   System.out.println("the largest number is = " + n3);
    // }


    //to check age categeory using if else(child, adult, senior citizen)
    // System.out.println("enter the age = ");
    // int age = sc.nextInt();
    // if (age < 18){
    //   System.out.println("you are a child");
    // }else if( age >= 18 && age <= 60){
    //   System.out.println("you are an adult");
    // }else{
    //   System.out.println("you are a senior citizen");
    // }

    //scholorship eligibility using if else
    // System.out.println("enter the income = ");
    // int income = sc.nextInt();
    // System.out.println("enter your marks = ");
    // int marks2 = sc.nextInt();
    // if (income < 250000){
    //     if(marks2 >=80){
    //       System.out.println("your are eligible for scholorship");
    //     }else{
    //       System.out.println("your are not eligible for scholorship");   
    //     } 
    // }else{
    //   System.out.println("your are not eligible for scholorship");
    // }
    
  


    //build the calculator using switch

    // System.out.println("enter the digit1 = ");
    // int digit1 = sc.nextInt();
    // System.out.println("enter the digit2 = ");
    // int digit2 = sc.nextInt();
    // System.out.println("enter the operator (+ , - , * , /) = ");
    // char operator =sc.next().charAt(0);
    // int answer;
    // switch(operator){
    //   case '+':
    //     answer =digit1 + digit2;
    //     System.out.println("the sum is = " + answer );
    //     break;
    //   case '-':
    //     answer =digit1 - digit2;
    //     System.out.println("the difference is = " + answer);
    //     break;
    //   case '*':
    //     answer =digit1 * digit2;
    //     System.out.println("the product is = " + answer);
    //     break;
    //   case '/':
    //     answer =digit1 / digit2;
    //     System.out.println("the quotient is = " + answer);
    //     break;
    //   default:
    //     System.out.println("Invalid operator");
    //     break;
    // }



    // compare the == operator and equals() method using if else
    // int num1 = 10;
    // int num2 = 10;
    // if( num1 == num2){
    //   System.out.println("true");
    // }else{
    //   System.out.println("false");
    // }

    // output will be  true because num1 and num2 are equal. The == operator compares the values of the two variables,
    //  and since 10 is equal to 10, the condition evaluates to true, and the if block is executed, printing "true" to the console.


    // if( num1.equals(num2)){
    //   System.out.println("true");
    // }else{
    //   System.out.println("false");
    // }
    // output will be false because num1 and num2 are primitive data types (int), and the equals() method is not applicable to primitive types.
    // The equals() method is used to compare objects, and since num1 and num2 are not objects, the condition evaluates to false, and the else block is executed, printing "false" to the console.


    // int day ="saturday"; // wrong method
    // incorrect code, it will give error because day is declared as int but assigned a string value.
    // The correct way to declare a string variable is to use the String data type, like

    // String day1 = "saturday";
    // if(day1.equals("saturday")){
    //   System.out.println("holiday");
    // }else{
    //   System.out.println("working day");
    // }

    // to find the two largest number and two smallest number in an array using the if else statement
    
    int [] arr = {5, 2, -9, 8, -1, 6};
    int maxFirst = arr[0];
    int maxSecond = arr[0];
    int minFirst = arr[0];
    int minSecond = arr[0];
    for (int i =0 ; i <arr.length; i++) {
      int newNumber = arr[i];
      if(newNumber > maxFirst){
         maxSecond = maxFirst;   
         maxFirst = newNumber;
      }else if (newNumber > maxSecond){
         maxSecond = newNumber;
      }
      if(newNumber < minFirst){
         minSecond = minFirst;
         minFirst = newNumber;
      }else if (newNumber < minSecond){
         minSecond = newNumber;
      }
    }
    System.out.println("the largest number is = " + maxFirst);
    System.out.println("the second largest number is = " + maxSecond);
    System.out.println("the smallest number is = " + minFirst);
    System.out.println("the second smallest number is = " + minSecond);


    //give two string we need to find if the characters they have and count of characters are same or not using if else statement
    String str1 = "hello";
    String str2 ="llohe";
    if(str1.length() != str2.length()){
      System.out.println("the string count are not same");
    }else{
      boolean same = true;
      for(int i = 0 ; i <str1.length(); i++ ){
        char ch = str1.charAt(i);
        int count1 = 0;
        int count2 = 0;
        
        //count character for 1st string 
        for(int j = 0; j < str1.length(); j++){
          if(str1.charAt(j) == ch){
            count1++;
          }
        }

        //count character for 2nd string
        for (int j =0 ; j< str2.length(); j++){
          if(str2.charAt(j) == ch){
            count2++;
          }
        }
        if(count1 != count2){
          same = false;
          break;
        }
      }
      if(same){
        System.out.println("characters and count are same");
      }else{
        System.out.println("characters and coutn are not same");
      }

    }

    // leap year to check
    System.out.println("enter the the year = ");
    int year = sc.nextInt();
    if( year % 400 ==0 ){
      System.out.println(year + " is a leap year ");
    }else if(year % 100 == 0){
      System.out.println(year + "year is not a leap year");
    }else if(year % 4 ==0){
      System.out.println(year + "is a leap year");
    }else{
      System.out.println(year + "is a not leap year");
    }
    sc.close();
  }
}