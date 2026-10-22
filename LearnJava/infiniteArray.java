public class infiniteArray {
   public static void main(String[] args)
   {
    int arr[] = {
    10,20,30,40,50,60,70,75,80,90,
    100,110,120,130};
    int target = 10;
    System.out.println(findRange(arr, target));
   }
  
  static int findRange(int [] nums , int target)
  {
    //find the range
    //first start with a box of size 2

    int start = 0;
    int end = 1;

    //condition for the target to lie in the grp
    while(target > nums[end])
    {
      int temp = end + 1;//this is my new start
      //double the box value
      //end = previous end sizeofbox *2;
      end = end + (end - start + 1) * 2;
      start = temp;
    }
    return binarySearch(nums, start, end, target );
  }
  static int binarySearch(int nums[] , int start , int end, int target)
  {
    while (start <= end) {
      int mid = start + (end - start) / 2;

      if( target > nums[mid])
      {
        start = mid +1;
      }
      else if(target < nums[mid])
      {
        end = mid -1;
      }
      else
      {
        return mid;
      }
    }
    return  -1;
  }
  
}