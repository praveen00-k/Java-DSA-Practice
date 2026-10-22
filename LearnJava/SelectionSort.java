import java.util.Arrays;
public class SelectionSort {
  public static void selection(int[]arr)
  {
    for(int i = 0; i< arr.length; i++)
    {
        int last = arr.length-i-1;
        int maxIndex = getMaxIndex(arr, 0, last);
        swapElements(arr,maxIndex, last);
    }
  }

  public static int getMaxIndex(int[] arr, int start, int end)
  {
    int max = start;
    for(int i = start; i<=end; i++)
    {
      if(arr[max] < arr[i])
      {
        max = i;
      }
    }
    return max;
  }

  public static void swapElements(int[]arr, int first, int last)
  {
    int temp = arr[first];
    arr[first] = arr[last];
    arr[last] = temp;
  }
  public static void main(String[] args) {
    int arr[] ={4,2,1,5,6,9,3,7};
    selection(arr);
    System.out.println(Arrays.toString(arr));
  }
}
