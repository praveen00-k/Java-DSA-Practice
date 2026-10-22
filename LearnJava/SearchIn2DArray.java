class Solution {
  public static void main(String[] args) 
  {
    int [][] accounts = {{1,2,3},
                         {3,2,1}
                        };
    int [] result= maximumWealth(accounts);
    System.out.println(result);
  }

  static int[] maximumWealth(int[][] accounts)
  {
    int sum = 0;
    for(int []num : accounts){
      for(int count :num){
        sum +=count;
      }
      
    }
    return new int[]{sum};

    
  }
}