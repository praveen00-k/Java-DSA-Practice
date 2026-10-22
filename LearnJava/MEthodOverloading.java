public class MEthodOverloading 
{
  int max(byte x ,byte y)
  {
    if(x > y)
      {
      return x ;
    }
    else
    {
      return y;
    }
  }
  int max(int x ,int y)//parameter are cannot be same datatype for while using the same method
  {
    if(x > y)
      {
      return x ;
    }
    else
    {
      return y;
    }
  }

  float max(float x ,float y)//when int is not called floating is called widing
  {
    if(x > y)
      {
      return x ;
    }
    else
    {
      return y;
    }
  }

  //max of three number
  int max(int x ,int y , int z)
  {
    if(x > y && x> z)
    {
      return x;
    }
    else if( y > x && y >z)
    {
      return y;
    }
    else
    {
      return z;
    }
  }
  public static void main(String[] args) 
  {
    MEthodOverloading method = new MEthodOverloading();
    System.out.println(method.max(10,20));
    System.out.println(method.max(10,20,30));
  }
}
