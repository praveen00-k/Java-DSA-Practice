import java.util.List;
import java.util.ArrayList;
public class CyclicSort {
  public static int missingNumber(int[] nums)
  {
    if(nums == null || nums.length == 0)
    {
      return -1;
    }

     int i = 0;
        while(i < nums.length)
        {
            int correct = nums[i];
            if( nums[i]< nums.length && nums[i] != nums[correct])
            {
               int temp = nums[i];
               nums[i]  = nums[correct];
               nums[correct] = temp;
    
            }
            else
            {
                i++;
            }
        }

        //search for 1st missing number
        for( int j = 0; j < nums.length; j++)
        {
            if(nums[j] != j)
            {
                return j;
            }
        }
        //case 2
        return nums.length;
  }

  public static List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> result = new ArrayList<>();
    if(nums == null || nums.length == 0)
    {
      return result;
    }

     int i = 0;
        while(i < nums.length)
        {
            int correct = nums[i] - 1;
            if(nums[i] < nums.length &&nums[i] != nums[correct])
            {
               int temp = nums[i];
               nums[i]  = nums[correct];
               nums[correct] = temp;
    
            }
            else
            {
                i++;
            }
        }

        //search for 1st missing number
        for( int j = 0; j < nums.length; j++)
        {
            if(nums[j] != j + 1)
            {
                result.add(j + 1);
            }
        }
        
        return result;
  }

  public static int duplicateNumber(int [] number)
  {
    if(number == null || number.length == 0)
    {
      return -1;
    }

    int i = 0;
    while(i < number.length)
    {
      if(number[i] != i + 1)
      {
        int correct = number[i] - 1;
        if(number[i] != number[correct])
        {
          int temp = number[i];
          number[i] = number[correct];
          number[correct] = temp;
        }
        else
        {
          return number[i];
        }
      }
      else
      {
        i++;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] nums = {4,6,3,1,3};
    // System.out.println(missingNumber(nums));
    System.out.println(findDisappearedNumbers(nums));
    System.out.println(duplicateNumber(nums));
  }
}
