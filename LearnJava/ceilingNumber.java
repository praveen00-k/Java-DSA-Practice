public class ceilingNumber {
  static int ceiling(int[] arr, int target)
  {
    int start = 0;
    int end = arr.length -1;
    if(target > arr[end]){
      return -1;
    }
    while(start <= end){
      int mid = start + (end - start) /2;
      if( arr[mid] == target){
        return arr[mid];
      }
      else if( target > arr[mid])
      {
        start = mid+1;
      }
      else
      {
        end = mid - 1;
      }
    }
    return arr[start];
    
  }
  public static void main(String[] args){
    int [] arr = {2,4,6,8,10,12,14,16};
    int target = 11;
    int ans = ceiling(arr, target);
    System.out.println("ceiling numbe of "+ target + " is: " + ans);
  }
}