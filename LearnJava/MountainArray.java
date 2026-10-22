public class MountainArray {
  // 1095 find the mountain array.
  int search(int arr[] , int target){
    int peak = peakIndexInMountainArray(arr);
    int firstTry = orderAgnosticBS(arr,  target ,0 ,peak);
    if(firstTry != -1)
    {
      return firstTry;
    }
    //try to search in second half
    return orderAgnosticBS(arr, target, peak+1, arr.length -1);
  }
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
    return start; // or end
  }
static int orderAgnosticBS(int [] arr, int target , int start , int end){
    
    boolean isAsc = arr[start] < arr[end] ;
    while (start <= end) {
      int mid = start + (end - start )/2;
      if(arr[mid] == target)
      {
        return mid;
      }
      if(isAsc){
        if(target < arr[mid])
        {
          end = mid -1;
        }else{
          start = mid +1;
        }
      }
      else{
        if(target > arr[mid])
        {
          end = mid -1;
        }else{
          start = mid +1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
  }
  
}
