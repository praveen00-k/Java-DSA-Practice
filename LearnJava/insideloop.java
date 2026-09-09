// import java.util.Scanner;

public class insideloop 
{
  public static void main(String[] args) 
  {
    //while inside while
    // int i = 1;
    // while(i <= 3 ){

    //   int  j = 1;
    //   while(j<=4){
    //     System.out.print("* ");
    //     j++;
    //   }
    //   System.out.println();
    //   i++;
    // }

    //do while inside do while 

    // int i = 1;
    // do{
    //   int j = 1;
    //   do{

    //     System.out.print(j +" ");
    //     j++;
    //   }while(j<=3);

    //   System.out.println();
    //   i++;
    // }while(i <= 3);

    //for inside while
    // int i =1;
    // while(i <= 3){
    //   for(int j = 1; j <= 4; j++){
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    //   i++;
    // }

    //fibonaci series using the for loop
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter the number= ");
    // int num = sc.nextInt();
    // int a = 0;
    // int b = 1;
    // int c =0;
    // System.out.print(a +", "+ b + ", ");
    // for(int i = 0 ; i <num-2 ; i++ ){
      
    //   c =  a+b;
    //   System.out.print(c+ ", ");
    //   a = b;
    //   b = c;
      
    // }
    // System.out.println("sum "+ c);

    //for loop inside for loop
    // System.out.println(" pattern 1");
    // System.out.println();


    // for(int i = 1; i<=5; i++)
    // {
    //   for(int j = 1 ; j<=5; j++)
    //   {
    //     System.out.print(i+j +" ");
    //   }
    //   System.out.println();
    // }

    // System.out.println();
    // System.out.println(" pattern 2");
    // System.out.println();

    // // int count = 0;
    // for(int i = 1; i<=5; i++){
    //   for(int j = 1; j<=5 ;j++){
    //     count++;
    //     // System.out.print(count +" ");
    //     System.out.format("%02d"+ " ", count);
    //   }
    //   System.out.println();
    // }
    
    // System.out.println();
    // System.out.println(" pattern 3");
    // System.out.println();

    // for(int i = 1; i<=5;i++){
    //   for(int j =1; j<=i ; j++){
    //     System.out.print(j + "");
    //     System.out.print(  "* ");


    //   }
    //   System.out.println();
    // }
  
    // System.out.println();
    // System.out.println(" pattern 4");
    // System.out.println();

    // int count =0;
    // for(int i = 1; i<=5;i++){
    //   for(int j =1; j<=i ; j++){
    //     count ++;
    //     System.out.print(count+ " ");
    //     System.out.print( "*");
    //   }
    //   System.out.println();
    // }

    // System.out.println();
    // System.out.println(" pattern 5");
    // System.out.println();

    // for(int i = 1 ; i<=5 ; i++){
    //   for(int j = 1 ; j<=5-i+1 ;j++){
    //     System.out.print(j+ " ");
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // System.out.println();
    // System.out.println(" pattern 6");
    // System.out.println();

    // for(int i = 1; i <=5; i++ ){
    //   for(int j = 1; j<=5; j++){
    //     if(j>=i){
    //       System.out.print("* " );
    //     }else{
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();
    // }
    

    // do-while inside for loop
    // for(int i = 1; i<=5; i++){
    //   int j=1;
    //   do{
    //     System.out.print("* ");
    //     j++;
    //   }while(j<=5);
    //   System.out.println();
    // }

    //while inside the do-while
    // System.out.println("========<<==>>========");

    // int i = 1;
    // do
    // {
    //   int j = 1;
    //   while(j<=4){
    //     System.out.print("* ");
    //     j++;
    //   }
    //   System.out.println();
    //   i++;
    // }while(i<=4);
    
    System.out.println("========<<==>>========");

    // int i =1;
    // while(i<=5){

    //   int j =1;
    //   do{
    //     System.out.print("*");
    //     j++;
    //   }while(j<=5);
    //   System.out.println();
    //   i++;
    // }
    // System.out.println();

    //do while inside do while
    int i =1;
    do{

      int j =1;
      do{
        System.out.print("*");
        j++;
      }while(j<=5);
      System.out.println();
      i++;
    }while(i<=5);
  }
}
