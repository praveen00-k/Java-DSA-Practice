public class patterns {
  public static void main(String[] args){

    System.out.println("===== PATTERN MENU =====");

    System.out.println("1. Square");

    for(int i = 1;i <= 4; i++){
      for(int j = 1; j<=4; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
          System.out.println();

    for(int i = 1;i <= 4; i++){
      for(int j = 1; j<=4; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
          System.out.println();

    int count = 0;
    for(int i = 1; i<= 4; i++){
      for(int j = 1; j<= 4; j++){
        count++;
        System.out.format("%02d"+ " ", count );
      }
      System.out.println();
    }
          System.out.println();

    for(int i = 1; i<= 4; i++){
      for(int j = 1;j <=4; j++){
        System.out.print(i+ " ");
      }
      System.out.println();
    }
      System.out.println();

    for(int i = 1; i<=4; i++){
      for(int j = 4; j>=1; j--){
        System.out.print(j+" ");
      }
    System.out.println();
    }

    System.out.println();

    for(int i = 4; i>= 1; i--){
      for(int j = 1; j<=4;j++){
        System.out.print(i+" ");
        
      }
     System.out.println();
    }

    System.out.println();

    for(int i = 1; i<=4; i++){
      char ch = 'A';
      for(int j = 1; j<=4; j++){
        System.out.print(ch + " ");
        ch++;
      }
    System.out.println();
    }
         System.out.println();

    for(int i = 1; i<=4; i++){
      char ch = 'A';
      for(int j = 1; j<=4; j++){
        System.out.print(ch + " ");
        ch++;
      }
    System.out.println();
    }
         System.out.println();


    System.out.println("2. Right Triangle");
    for(int i = 1; i<=5; i++){
      for (int j= 1; j<=i; j++){
        System.out.print(j);
      }
      System.out.println();
    }

    for(int i = 1; i<=5; i++){
      for (int j= 1; j<=i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }

          System.out.println();

    for(int i = 5; i>= 1; i--){
      // for(int k =1; k<=5;k--){

      //   System.out.println(" ");
      // }

      for (int j= 1; j<=i ; j++){
         System.out.print("* ");
      }
      System.out.println();
    }


    for(int i = 1; i<=5; i++){
      //space
      for (int k =1 ;k <= 5-i; k++){
        System.out.print(" ");
      }
      //star
      for (int j= 1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    int n =5;
    for(int i = 1; i<=n; i++){
      for (int k =1 ;k < i; k++){
        System.out.print(" ");
      }
      for (int j= n; j>=i; j--){
        System.out.print("*");
      }
      
      System.out.println();
    }

          System.out.println();
System.out.println("============<<==>>=============");

    System.out.println("3. Inverted Triangle");
    System.out.println();

    for(int i = 1; i<=5; i++){
      for (int j= 1; j<=5-i+1; j++){
        System.out.print(j);
      }
      System.out.println();
    }

    System.out.println("4. Pyramid");
    System.out.println();
    for(int i = 1; i<=5; i++){
      for(int j= 1; j<=5-i; j++ ){
        System.out.print(" ");
      }
      for(int k =1 ; k<=2*i-1; k++){
        System.out.print("*");
      }
      System.out.println();
    }

    for(int i =5;i>=1;i--){
      for(int j = 1; j<=5-i;j++){
        System.out.print(" ");
      }
      for(int k = 1; k<=2*i-1;k++){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("5. Number Triangle");
    System.out.println("6. Character Triangle");
    System.out.println("7. Exit");
  }
}
