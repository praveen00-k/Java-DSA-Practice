public class a2 {
  public static void main(String[] args) {
    ball ba = new ball();
    ba.name= "blue";
    ba.max=12;
    System.out.println(ba.name+ ", " + ba.max);
  }

}
class ball{
  String name;
  int max;
}
