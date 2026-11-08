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
  }
  
  
}
