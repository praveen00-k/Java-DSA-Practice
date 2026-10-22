class Solution {
    public int search(int[] nums, int target) 
    {
        int pivot = findPivot(nums, 0 , nums.length -1);
        if(pivot == -1)
        {
        return binarySearch(nums, target, 0, nums.length-1);
        }
        if(nums[pivot] == target)
        {
        return pivot;
        }
        if(target >= nums[0])
        {
        return binarySearch(nums, target, 0, pivot-1);
        }
      return binarySearch(nums, target, pivot +1, nums.length-1);

    }
  static int binarySearch(int [] arr, int target, int start, int end){
    
    while( start <= end)
    {
      int mid = start + ( end - start)/2;
      
      //if target number is less than middle then middle -1 stored in right
      if(target < arr[mid]){
        end = mid -1;
      }
      //if target value is max than middle then middle +1 is stored in left
      else if(target > arr[mid])
      {
        start = mid +1;
      }
      //if target is equal to middle value than return mid
      else{
        return mid;
      }
    }
    return -1;
  }
  static int findPivot(int[] arr , int start, int end){
    
    while(start <= end)
    {
      int mid = start +(end - start) /2 ;

      if(mid < end && arr[mid] > arr[mid+1])
      {
        return mid;
      }
      if( mid > start && arr[mid] < arr[mid-1])
      {
        return mid-1;
      }
      // if elements at middle, start, end are equal then just skip the duplicates
      if(arr[mid] == arr[start] && arr[mid] == arr[end])
      {
        if(arr[start] > arr[start +1])
        {
          return start;
        }
        start++;

        //check whether end is pivot
        if(arr[end] < arr[end-1])
        {
          return end-1;
        }
        end--;
      }
      // if( arr[mid] <= arr[start])
      // {
      //   end =mid-1;
      // }
      // else
      // {
      //   start = mid +1;
      // }
      
      //left side is sorted, so pivot should be right
      else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] >arr[end]))
      {
        start = mid -1;
      }
      else
      {
        end = mid -1;
      }
    }
    return -1;
  }
}