public class InsertionSort {
  public static int[] insertionSort(int[] arr)
  {
    for(int i = 0; i< arr.length- 1; i++)
    {
      for(int j = i+1; j > 0; j--)
      {
        if(arr[j] < arr[j-1])
        {
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
        }
        else{
          break;
        }
      }
    }
    return arr;
  }
  public static void main(String[] args) {
    int [] arr = {9,2,6,1,4,4,3,1};
    insertionSort(arr);
    for(int i =0; i<arr.length ; i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}
