public class BinarySearch {
  static int binarySearch(int [] arr, int target){
      if (arr == null || arr.length == 0) {
        System.out.println("array is empty");
        return -1;
    }
    int left = 0;
    int right = arr.length -1;
    while( left <= right)
    {
      int mid = left + ( right - left)/2;
      
      //if target number is less than middle then middle-1 stored in right
      if(target < arr[mid]){
        right = mid -1;
      }
      //if target value is max than middle then middle+1 is stored in left
      else if(target > arr[mid])
      {
        left = mid +1;
      }
      //if target is equal to middle value than return mid
      else{
        return mid;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[]arr = {0,2,3,4,15,16,18,22,45,89};
    int target = 45;
    int ans = binarySearch(arr,target);
    System.out.println(ans);
  }
}
