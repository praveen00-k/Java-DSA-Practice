public class FloorNumber {
  
  static int floornumber(int[] arr, int target)
  {
    int start = 0;
    int end = arr.length -1;
    if(target < arr[start] ){
      return -1;
    }
    while(start <= end){
      int mid = start + (end - start) /2;
      if( arr[mid] == target){
        return arr[mid];
      }
      else if( target > arr[mid])
      {
        start = mid + 1;
      }
      else
      {
        end = mid - 1;
      }
    }
    return arr[end];
    
  }
  public static void main(String[] args){
    int [] arr = {2,4,6,8,10,12,14,16};
    int target = 3;
    int ans = floornumber(arr, target);
    System.out.println("floor numbe of "+ target + " is: " + ans);
  }
}