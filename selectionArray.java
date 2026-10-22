public class selectionArray {

  public static void arrageAscending( int[] arr)
  {
    
    for(int i = 0; i<arr.length-1; i++)
    {
      int minVlaue = arr[i];
      int minIndex =i ;
      for(int j=i+1; j <arr.length;j++)
      {
        if( arr[j] < minVlaue )
        {
          minVlaue = arr[j];
          minIndex = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }
  public static void main(String[] args) {
    int[] arr= {9,2,16,6,13};
    arrageAscending(arr);
    for(int i =0; i<arr.length; i++)
    {
      System.out.print(arr[i] + " ");
    }
  }
}
