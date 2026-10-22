public class PeakMountainArray {
  //162 and 852 peak index and peak element to find
  static int peakIndexInMountainArray(int[] arr  )
  {
    int start = 0;
    int end = arr.length -1;
    while (start < end)
    {
      int mid = start+ (end - start)/2;
      if(arr[mid] > arr[mid+1])
      {
        //your in decreasing order of the order ,but look at left
        //this is why end !=mid-1;
        end = mid;
      }
      else 
      {
        //your in ascending array 
        start = mid + 1;//become we know that mid+1 element > mid element
      }
    }
    //in the end, start ==end and pointing to the last largest number
    //  becoz of the 2checks above.
    //start and end are always trying to find max elements in the above 2 checks
    //hence, when they are pointing to join one elemts, 
    //that is the max one becoz that is what the check say
    return start; // or end
  }
  public static void main(String[] agrs)
  {

    int arr[] = {0,1,2,3,4,3,2};
    
    System.out.println(peakIndexInMountainArray(arr));
  }
}
