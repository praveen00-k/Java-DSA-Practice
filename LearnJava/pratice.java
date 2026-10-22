class pratice {
  //1.print hello
  static void print(){
    System.out.println("Hello world");
  }
  //2.printing details
  static void details(String name , int age , String college){
    System.out.println("Name= " + name);
    System.out.println("Age= " + age);
    System.out.println("College = " + name);
  }

  //3. declare and print variable of all primitive data type
   static void printDataTypes(){
    byte b = 10;
    short s = 100;
    int i = 1000;
    long l = 10000000l;
    float f = 123.235f;
    double d = 20.5;
    char c = 'A';
    boolean x = true;
    System.out.println("Byte= " + b);
    System.out.println("short= " + s);
    System.out.println("int= " + i);
    System.out.println("long= " + l);
    System.out.println("float= " + f);
    System.out.println("double= " + d);
    System.out.println("char= " + c);
    System.out.println("boolean= " + x);
   }

   //4.arithmetic operation of two number
   static int add(int x, int y){
     return x + y;
   }
   static int sub(int x, int y){
     return x - y;
   }
   static int mul(int x, int y){
     return x * y;
   }
   static int div(int x, int y){
     return x / y;
   }

   //5. remainder of two number
   static int remainder(int x , int y){
    return x % y;
   }
  
   // area of circle and rectangle and traingle
   static double circle(int r){
    double area = 3.147*(r*r);
     return area;
   }

   static double rectangle(double base,double height){
    double area = base * height;
     return area;
   }

   static double trianle(double base, double height){
    double area = 0.5 * base*height;
     return area;
   }

   

  

  public static void main(String[] args) {
    //print hello
    print();

    //printing details
    System.out.println();
    details("Praveenkuamr", 23, "BEC");

    //print primitive data types
    System.out.println();
    printDataTypes();

    //arithemetic opertion of  two number
    System.out.println();
    int sum =add(10,20);
    System.out.println("sum= "+ sum);

    System.out.println();
    int diff =sub(10,20);
    System.out.println("diff= "+ diff);

    System.out.println();
    int mul =mul(10,20);
    System.out.println("mul= "+ mul);

    System.out.println();
    int div =div(100,20);
    System.out.println("div= "+ div);

    //remainder of two number
    System.out.println();
    int rem = remainder(120, 45);
    System.out.println("remainder of two number= "+ rem);

    //area of circle
    System.out.println();
    double area = circle(45);
    System.out.println("area of circle= "+ area);

    //area of rectanlge
    System.out.println();
    double area1 = rectangle(15,45);
    System.out.println("area of rectangle= "+ area1);

    //area of trianlge
    System.out.println();
    double area2 = trianle(45,25);
    System.out.println("area of trianlge= "+ area2);


  }
}
