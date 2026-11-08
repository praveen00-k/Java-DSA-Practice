public class TestArray{
  static void compareNumberInSortedArray(int [] arr, int number){
    if (arr == null || arr.length == 0) {
        System.out.println("array is empty");
        return;
    }
      for(int x : arr)
      {
        if(number == x)
        {
          System.out.println(number + " = " + x);
        }
        else if(number < x)
        {
          System.out.println(number + " < " + x);
        }
        else
        {
          System.out.println(number + " > " + x);
        }
      }

  }

  static void CompareNumberInUnsortedArray(int[] num, int number)
  {

    if (num == null || num.length == 0) {
        System.out.println("array is empty");
        return;
    }
      for(int x : num)
      {
        if(number == x)
        {
          System.out.println(number + " = " + x);
        }
        else if(number < x)
        {
          System.out.println(number + " < " + x);
        }
        else
        {
          System.out.println(number + " > " + x);
        }
      }
  }

      //accepts math experssion as string retrun true if braces are balanced else false
  static boolean checkBracesBalance(String expression) {
    int balance = 0;
    for (char c : expression.toCharArray()) {
      if (c == '(') {
        balance++;
      } else if (c == ')') {
        balance--;
        if (balance < 0) {
          return false;
        }
      }
    }
    return balance == 0;
  }

  public static void main(String[] args) {
    System.out.println("sorted array");
    int arr[] = {10,20,-30,40,50};
    int number = 30;
    compareNumberInSortedArray(arr, number);

    System.out.println();
    System.out.println("unsorted array");
    int num [] ={40,-20,30,50,10,60};
    CompareNumberInUnsortedArray(num , number);


    //accepts math experssion as string retrun true if braces are balanced else false
    String expression = "((a+b)*(c-d))";
    boolean isBalanced = checkBracesBalance(expression);
    System.out.println("The expression '" + expression + "' has balanced braces: " + isBalanced);

  }
}
