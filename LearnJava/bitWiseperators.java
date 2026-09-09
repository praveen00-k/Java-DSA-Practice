public class bitWiseperators {
  public static void main(String[] args) {

    //bitwise operators

    int x = 10;
    int y = 6;
    System.out.println("AND = "  + (x & y));
    System.out.println("OR = "  + (x | y));
    System.out.println("XOR = "  + (x ^ y));
    System.out.println("NOR"  + (~x));
    System.out.println("NOR"  + (~ y));

    int  a =10;
    System.out.println("left shift by 1 = "  + (a << 1));
    System.out.println("left shift by 2 = "  + (a << 2));
    System.out.println("right shift by 1 = "  + (a >> 1));
    System.out.println("right shift by 2 = "  + (a >> 2));

    int g = -10;
    System.out.println("right shift by 1= "  + (g >>> 1));
    System.out.println("right shift by 2= "  + (g >>> 2));
    System.out.println("right shift by 3= "  + (g >>> 3));

    //relational operation
    int j = 10;
    int k = 20;

    System.out.println(j == k);  // false
    System.out.println(j != k);  // true
    System.out.println(j < k);   // true 
    System.out.println(j > k);   // false

    //logical operation
    int age = 25;
    System.out.println(age >= 18 && age <= 60);
    System.out.println(age < 18 || age > 60);
  }
}
