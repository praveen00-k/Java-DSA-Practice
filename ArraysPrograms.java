import java.util.Arrays;

public class ArraysPrograms {

  //1st question
  public static int printTargetIndex(int[] arr, int target)
  {
    if(arr == null || arr.length == 0)
    {
      return -1;
    }
    for(int  i = 0; i<arr.length ; i++)
    {
      if(arr[i] == target)
      {
        return i;
      } 
    }
    return -1;
  }

  //2nd question
  public static boolean checkTarget(int [] arr, int target)
  {
    if(arr == null || arr.length == 0)
    {
      return false;
    }
    for(int i = 0; i<arr.length; i++)
    {
      if(arr[i] == target)
      {
        return true;
      }
    }
    return false;
  }

  //3rd question
  public static int returnFirstIndex(int[] arr, int target)
  {
    if(arr == null || arr.length == 0)
    {
      return -1;
    }
    for( int i =0; i<arr.length ;i++)
    {
      if(arr[i] == target)
      {
        return i;
      }
    }
    return -1;

  }

  //4th question
  public static int returnLastIndex(int[] arr, int target)
  {
    if(arr == null || arr.length == 0)
    {
      return -1;
    }
    int ans = -1;
    for(int i = 0;i<arr.length; i++)
    {
      if(arr[i] == target)
      {
        ans = i;
      }
    }
    return ans;
  }

  //5th question
  public static int countOccurrence(int[]arr , int target)
  {
    if(arr == null || arr.length == 0)
    {
      return -1;
    } 
    int count = 0;
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] == target)
      {
        count++;
      }
    }
    return count;
  }

  //6th question
  public static int[] printOccurrencesIndex(int arr[], int target)
  {
    if(arr == null || arr.length == 0)
    {
      return new int[]{-1};
    } 

    int count=0;
    for(int i = 0; i<arr.length;i++)
    {
      if(arr[i] == target)
      {
        count++;
      }
    }

    int ans[] = new int[count];
    int idx = 0;
    for(int i = 0; i<arr.length; i++)
    {
      if(arr[i] == target)
      {
        ans[idx] = i;
        idx++;
      }
    }
    return ans;
  }

  //7th question
  public static int returnMinElement(int[] arr)
  {
    if(arr == null || arr.length == 0)
    {
      return -1;
    } 

    int min = arr[0];
    for(int i = 0; i<arr.length; i++)
    {
      if(arr[i] < min)
      {
        min = arr[i];
      }
    }
    return min;
  }

  //8th question
  public static int returnMaxElement(int[] arr)
  {
    if(arr == null || arr.length == 0)
    {
      return -1;
    } 

    int max = arr[0];
    for(int i = 0; i<arr.length; i++)
    {
      if(arr[i] > max)
      {
        max= arr[i];
      }
    }
    return max;
  }

  //9th question
  public static int printSecondMaxElement(int[] arr)
  {
    if(arr == null || arr.length == 0)
    {
      return -1;
    } 
    int max = arr[0];
    int SecondMax = arr[0];

    for(int i = 0; i < arr.length ; i++)
    {
      if(arr[i] > max)
      {
        SecondMax = max;
        max = arr[i];
      }
      else if(arr[i] > SecondMax && arr[i] !=max)
      {
        SecondMax = arr[i];
      }
    }
    if(SecondMax == arr[0])
    {
      System.out.println("SecondMax element doesn't exist");
    }
    return SecondMax;
  }

  //10th question
  public static int[] countEvenOddNumber(int[]arr)
  {
    if(arr == null || arr.length == 0)
    {
      return new int[]{-1};
    }
    int even = 0;
    int odd = 0;

    for(int i = 0; i < arr.length; i++)
    {
      if( arr[i] % 2 == 0)
      {
        even++;
      }
      else{
        odd++;
      }
    }
    return new int[]{even, odd};
  }

  //11th question
  public static int printIndex(int [] arr, int target)
  {
    for(int i = 0; i<arr.length; i++)
    {
      if(arr[i] > target)
      {
        return i;
      }
    }
    return -1;
  }

  //12th question
  public static boolean checkDuplicates(int [] arr)
  {
    for(int i = 0; i<arr.length;i++)
    {
      for(int j = i+1; j<arr.length;j++)
      {
        if(arr[i] == arr[j])
        {
          return true;
        }
      }
    }
    return  false;
  }

  //13th question
  public static int printMissingNumber(int [] arr, int n)
  {
    int expectedSum = n*(n+1)/2;
    int actualSum = 0;

    for( int i = 0; i<arr.length; i++)
    {
      actualSum += arr[i];
    }
    return expectedSum - actualSum;
  }

  //14th question
  public static int[] twoSum(int[] arr, int target)
  {
    int left = 0; int right = arr.length-1;
    while (left < right)
    {
      int sum = arr[left] + arr[right];
      if(sum == target)
      {
        return new int[]{left, right};
      }
      if(sum <target)
      {
        left++;
      }
      else{
        right--;
      }
    }
    return new int[]{-1,-1};
  }

  //15th question
  public static int returnTargetIndex(int[] arr, int target)
  {
    for(int i = 0; i < arr.length; i ++)
    {
      if(arr[i] == target)
      {
        return i;
      }
    }
    return -1;
  }

  //20th question

  public static int printFirstOccurrenceInedx(int[] arr, int target)
  {
     int last = -1;
    for( int i = 0 ; i < arr.length; i++)
    {
        if(arr[i] == target)
        {
          last = i;
        }
    }
    return last;
  }

  //22th question
  public static int printFloorNUmber(int []arr, int target)
  {
    int floor = -1;
    for(int i = 0; i < arr.length ; i++)
    {
      if(arr[i] < target && arr[i] > floor)
      {
        floor = arr[i];
      }
    }
    return floor;
  }

  //23th question
  public static int printCeilingNUmber(int []arr, int target)
  {
    int ceiling = 0 ;
    for(int i = 0; i < arr.length ; i++)
    {
      if(arr[i] > target && arr[i] < ceiling)
      {
        ceiling = arr[i];
      }
    }
    return ceiling;
  }

  //24th question
  public static int countTarget(int[] arr, int target)
  {
    int count = 0;
    for(int i = 0 ; i < arr.length ; i++)
    {
      if(arr[i] == target)
      {
        count++;
      }
    }
    return count;
  }

  //25th question
  public static int returnInsertionPosition(int[] arr, int target)
  {
    int start = 0;
    int end = arr.length-1;
    while (start <= end) 
    {
        int mid = start + (end - start)/2;
        if( arr[mid] == target)
        {
          return mid;
        }
        else if(arr[mid] < target)
        {
          start = mid + 1;
        }
        else
        {
          end  = mid -1 ;
        }
    }
    return start;
  }

  //26th question
  public static int search(int[] arr, int target)
  {
    if(arr == null)
    {
      return -1;
    }

    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] == -1)
      {
        break;
      }

      if(arr[i] == target)
      {
        return i;
      }
    }
    return -1;
  }

  //27th question find the integer square root
  public static int integerSquare(int x)
  {
    if( x < 2)
    {
      return x;
    }

    int start = 1;
    int end = x / 2;
    int ans = 0;
    
    while (start <= end)
    {
      int mid = start + (end - start)/2;
      if( mid <=  x / mid)
      {
        ans = mid;
        start = mid + 1;
      }
      else{
        end = mid -1;
      }
    }
    return ans;
  }

  //28th search a rotated sorted array
  public static int searchRotated(int[] arr, int target)
  {
    if(arr == null)
    {
      return -1;
    }
    int start = 0;
    int end = arr.length-1;

    while (start <= end)
    {
      int mid = start + (end - start)/2;

      if( arr[mid] == target)
      {
        return mid;
      }

      //left half is sorted
      if( arr[start] <= arr[mid])
      {
        if(target >= arr[start] && target < arr[mid])
        {
          end = mid -1 ;
        }
        else{
          start = mid + 1;
        }
      }
      //right half is sorted
      else
      {
        if(target > arr[mid] && target <=arr[end])
        {
          start = mid + 1;
        }
        else
        {
          end = mid - 1;
        }
      }
    }
    return -1;
  }

  //29 find the peak elments
  public static int peakelements(int [] arr)
  {
    if(arr== null || arr.length == 0)
    {
      return -1;
    }
    int start = 0; 
    int end =arr.length-1;

    while(start < end)
    {
      int mid = start + (end - start)/2;
      if( arr[mid] < arr[mid + 1])
      {
        start = mid +1;
      }
      else{
        end = mid;
      }
    }
    return start;
  }

  //30 th question find the minimum in rotated sorted array
  public static int minimumElements(int [] arr)
  {
    if(arr == null || arr.length == 0)
    {
      return -1;
    }

    int start = 0; 
    int end = arr.length-1;

    while (start < end)
    {
      int mid = start + (end - start)/2;

      if(arr[mid] > arr[end])
      {
        start = mid +1;
      }
      else 
      {
        end = mid;
      }
    }
    return arr[start];
  }

  //31st question
  public static void ascendingOrder(int[] arr)
  {
    if( arr == null || arr.length == 0)
    {
      return ;
    }

    for(int i = 0 ; i < arr.length-1; i++)
    {
      for(int j = 0; j <arr.length-1; j++)
      {
        if(arr[j] < arr[j+1])
        {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
  public static void main(String[] args) {
    int[] arr = {3, 4, 5, 1, 2};
    // System.out.println(peakelements(arr));
    // System.out.println(returnTargetIndex(arr, 2));
    ascendingOrder(arr);
    System.out.println(Arrays.toString(arr));

    // System.out.println(printTargetIndex(arr, 30));

    // System.out.println(checkTarget(arr,7));

    // System.out.println(returnFirstIndex(arr,5));

    // System.out.println(returnLastIndex(arr, 3));

    // System.out.println(countOccurrence(arr, 2));

    // System.out.println(Arrays.toString(printOccurrencesIndex(arr, 4)));

    // System.out.println(returnMinElement(arr));

    // System.out.println(returnMaxElement(arr));

    // System.out.println(printSecondMaxElement(arr));
    // int[] ans = countEvenOddNumber(arr);
    // System.out.println("even: " + ans[0]);
    // System.out.println("odd: " + ans[1]);

    // System.out.println(printIndex(arr, 5));
    // System.out.println(checkDuplicates(arr));

    // System.out.println(printMissingNumber(arr,6));

    // System.out.println(Arrays.toString(twoSum(arr, 7)));
  }
}
