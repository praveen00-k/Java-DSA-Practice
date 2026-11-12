import java.util.Arrays;

public class StringPratice {

  public static boolean checkBracesBalanced(String expression)
  {
    if(expression == null)
    {
      return false;
    }

    MyStack stack = new MyStack(expression.length());
    boolean isBalanced = true;
    for(int i = 0; i < expression.length(); i++)
    {
      char ch = expression.charAt(i);
      if(ch == '(')
      {
        stack.push(ch);
        continue;
      }
      else if(ch == ')')
      {
        if(stack.peek() == -1)
        {
          isBalanced = false;
          break;
        }
        stack.pop();
      }
      if(stack.peek() != -1)
      {
        isBalanced = false;
      }
      
    }
    return isBalanced;
  }

  //check whether String is palindrome or not
  public static boolean checkPalindrome(String str)
  {
    str = str.toLowerCase();
    for(int i = 0; i <= str.length()/2; i++)
      {
        char start = str.charAt(i);
        char end = str.charAt(str.length()-1-i);

        if(start != end)
        {
          return false;
        }
      } 
      return true;
  }

  //valid palindrome
   public static boolean isPalindrome(String s)
   {
    if( s == null || s.length()==0)
    {
      return true;
    }
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        for(int i = 0; i < s.length()/2; i++)
        {
          char start = s.charAt(i);
          char end = s.charAt(s.length()-1-i);
          if(start != end)
          {
            return false;
          }
        }
        return true;
   }


   //valid palinrome II
    public boolean validPalindrome(String s)
    {
        int start = 0;
        int end = s.length()-1;

        while(start < end )
        {
          if(s.charAt(start) != s.charAt(end))
          {
            return isPalindrome(s, start+1, end) ||isPalindrome( s, start, end-1);
          }
          start++;
          end--;
        }
        return true;
    }
    public boolean isPalindrome(String s , int start, int end)
    {
      while(start < end )
      {
        if(s.charAt(start) != s.charAt(end))
        {
          return false;
        }
        start++;
        end --;
      }
      return true;
    }

    //reverse string
     public static void reverseString(char[] s)
     {
        int start = 0;
        int end = s.length-1;

        while(start < end)
        {
          char temp = s[start]; 
          s[start] = s[end];
          s[end] = temp;

          start++;
          end--;
        }
     }

     //two sum - II input array is sorted
     public int[] twoSum(int[] numbers, int target)
     {
        int start = 0;
        int end =numbers.length-1;

        while(start < end)
        {
          int sum = numbers[start] + numbers[end];
          if(sum == target)
          {
            return new int[]{start+1,end+1};
          }
          else if(sum < target)
          {
            start++;
          }
          else{
            end--;
          }
        }

        return new int[]{-1,-1};
     }

  // //26. Remove Duplicates from Sorted Array
  // public int removeDuplicates(int[] nums)
  // {
        
  // }

  //283. Move Zeroes
  public void moveZeroes(int[] nums)
  {
      int i = 0;
      for(int j = 1 ; j < nums.length; j++)
      {
        if(nums[j] != 0 )
        {
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;

          i++;
        }
      }
  }

  
  public static void main(String[] args)
  {
    String name = "Algorithms 365 technologies HSR Layout";
    char firstChar = name.charAt(0);
    int comparison = name.compareTo("A");
    char[] nameChar = name.toCharArray();
    String subString = name.substring(0, 10);
    boolean contains = name.contains("Algorithms");
    CharSequence subSequence = name.subSequence(0, 10);
    System.out.println("The first character of the string is: " + firstChar);
    System.out.println("The result of the comparison is: " + comparison);
    System.out.println("The first character of the string (using toCharArray) is: " + nameChar);
    System.out.println("The substring of the string is: " + subString);
    System.out.println("The string contains 'Algorithms': " + contains);
    System.out.println("The subsequence of the string is: " + subSequence);

    String expression = "((1+2)*(10/2)*(5-7)";
    boolean ans = checkBracesBalanced(expression);
    System.out.println("the give expression is : " + ans);

    String str ="praveenknevarp";
    System.out.println(checkPalindrome(str));

    String s = "A man, a plan, a canal: Panama";
    System.out.println(isPalindrome(s));
     char[] s1 = {'h', 'e', 'l', 'l', 'o'};

     reverseString(s1);
    System.out.println(Arrays.toString(s1));
  }
  
  
}
