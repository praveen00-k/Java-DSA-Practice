public class instanceMethod {
  int max(int x , int y)
  {
    //demo of instace method (create object and access)
    if(x > y){
      return x ;
    }else{
      return y ;
    }
  }
  public static void main(String[] args) {
    int a = 10 ; int b = 20;
    instanceMethod i = new instanceMethod();
    int c = i.max(a,b);
    System.out.println("c = " + c);
  }
}
