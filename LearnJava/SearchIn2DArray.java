class Solution {
  public static void main(String[] args) 
  {
    int [][] accounts = {{1,2,3},
                         {3,2,1}
                        };
    int [] result= maximumWealth(accounts);
    System.out.println(result);
  }

  static int[] maximumWealth(int[][] arr)
  {
    for( int []num : arr)
    {
      for( int num1 : num)
      {
        System.out.println(num1);
      }
    }
    return new int[0]; // Placeholder return, replace with actual logic
  }
}