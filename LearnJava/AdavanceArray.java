public class AdavanceArray {
  public static int longestRisingStretch(int [] arr)
  {
    int maxLong = 0;
    int Long = 0;
    for(int i = 1 ; i< arr.length;i++)
    {
      if(arr[i] > arr[i-1])
      {
        Long++;
      }
      else
      {
        Long = 1;
      }

      if(Long > maxLong)
      {
        maxLong = Long;
      }
    }
    return maxLong;
  }
  public static void main(String[] args) {
    int[] arr = {3, 4, 5, 2, 3, 4, 5, 6, 1};
    System.out.println(longestRisingStretch(arr));
  }
}
