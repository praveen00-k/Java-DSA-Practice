public class TestArray{
  static void compareNumberInSortedArray(int [] arr, int number){
    if (arr == null || arr.length == 0) {
        System.out.println("array is empty");
        return;
    }
      for(int x : arr)
      {
        if(number == x)
        {
          System.out.println(number + " = " + x);
        }
        else if(number < x)
        {
          System.out.println(number + " < " + x);
        }
        else
        {
          System.out.println(number + " > " + x);
        }
      }

  }

  static void CompareNumberInUnsortedArray(int[] num, int number)
  {

    if (num == null || num.length == 0) {
        System.out.println("array is empty");
        return;
    }
      for(int x : num)
      {
        if(number == x)
        {
          System.out.println(number + " = " + x);
        }
        else if(number < x)
        {
          System.out.println(number + " < " + x);
        }
        else
        {
          System.out.println(number + " > " + x);
        }
      }
  }
  public static void main(String[] args) {
    System.out.println("sorted array");
    int arr[] = {10,20,-30,40,50};
    int number = 30;
    compareNumberInSortedArray(arr, number);

    System.out.println();
    System.out.println("unsorted array");
    int num [] ={40,-20,30,50,10,60};
    CompareNumberInUnsortedArray(num , number);




  }
}
