import java.util.*;
public class TWODArray {
  //1st method to print 2d array
  public static int [] [] printArray(int[] [] arr)
  {
    for(int i = 0; i < arr.length; i++)
    {
      for(int j = 0; j < arr[i] .length; j++)
      {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    return arr;
  }

  // 2nd method using for each loop to print 2d array
  public static int [] [] printArrayUsingForEach(int[] [] arr)
  {
    for(int [] num : arr)  //passed refernce to num
    {
      for(int num1 : num) //num1 will fetch elements
      {
        System.out.print(num1 + " ");
      }
      System.out.println();
    }
    return arr;
  }

  //3rd method to add two 2d array and store result in 3rd array
  public static int [] [] addTwo2DArray(int [] [] arr1, int [] [] arr2)
  {
    int [] [] result = new int[arr1.length][arr1[0].length];
    for(int i = 0; i < arr1.length; i++)
    {
      for(int j = 0; j < arr1[i].length; j++)
      {
        result[i][j] = arr1[i][j] + arr2[i][j];
      }
    }
    return result;
  }

  //4th method to multiply two 2d array and store result in 3rd array
  public static int [][] multiplyTwo2DArray( int [] [] arr1, int [] [] arr2)
  {
    
    int result[][] = new int[arr1.length][arr2[0].length];
    for(int i = 0; i< arr1.length; i++)
    {
      for(int  j = 0; j< arr2[0].length; j ++)
      {
        for( int k = 0; k < arr1[0].length; k++)
        {
          result[i][j] += arr1[i][k] * arr2[k][j];
        }
      }
    }
    return result;
  }

  //5th method to print element row by row
  public static void printArrayRowByRow(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  // 6th method to print a 3*3 2d array
  public static void print3x3Array(int[][] arr)
  {
    
    for(int  i = 0; i < arr.length; i++)
    {
      for(int  j = 0; j < arr[i].length; j++)
      {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
  // 7th method to print the particular row in 2d array
  public static int[] printParticularRow(int[][] arr, int row)
  {
     int rowIndex = row - 1; // Adjust for 0-based indexing
    if(row <= 0 || row > arr.length) {
      System.out.println("Invalid row index.");
      return null;
    }
    for(int i = 0 ; i < arr[rowIndex].length; i++)
    {
      System.out.print(arr[rowIndex][i] + " ");
    }
    System.out.println();
    return arr[rowIndex];
  }

  // 8th method to print the particular column in 2d array
  public static void printParticularColumn(int[][] arr, int col)
  {
    int colIndex = col - 1; // Adjust for 0-based indexing
    if(col <= 0 || col > arr[0].length) {
      System.out.println("Invalid column index.");
      return;
    }
    for(int i = 0; i < arr.length; i++)
    {
      if(colIndex < arr[i].length) {
        System.out.print(arr[i][colIndex] + " ");
      } else {
        System.out.print("N/A ");
      }
    }
    System.out.println();
  }
  // 9th method to print diagonal elements of 2d array
  public static void printDiagonalElements(int[][] arr)
  {
    System.out.println("left to right Diagonal Elements:");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (i == j) {
          System.out.print(arr[i][j] + " ");
        }
      }
    }
    System.out.println();

    System.out.println("right to left Diagonal Elements:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i][arr.length - 1 - i] + " ");
    }
    System.out.println();
  }


  // 10th method to find sum of elements of 2d array
  public static int sumOfElements(int[][] arr)
  {
    int sum = 0;
    for(int i = 0; i < arr.length; i++)
    {
      for( int j = 0; j < arr[i].length; j++)
      {
        sum += arr[i][j];
      }
    }
    return sum;
  }

  // 11th method to find maximum element in 2d array
  public static int maxElements(int [][] arr)
  {
    int max = arr[0][0];
    for(int i = 0; i < arr.length; i++)
    {
      for(int  j = 0; j < arr[i].length; j++)
      {
        if(arr[i][j] >= max)
        {
          max = arr[i][j];
        }
      }
    }
    return max;
  }

  // 12th method to find minimum element in 2d array
  public static int minElements(int[][] arr)
  {
    int min = arr[0][0];
    for(int i = 0; i < arr.length; i++)
    {
      for(int j = 0; j < arr[i].length; j++)
      {
        if(arr[i][j] < min)
        {
          min = arr[i][j];
        }
      }
    }
    return min;
  }

  // 13th method to return evenCount and oddCount
  public static int[] evenOddCount(int[][] arr)
  {
    int evenCount = 0;
    int oddCount = 0;
    for(int  i = 0; i < arr.length; i++)
    {
      for( int  j = 0; j<arr[i].length; j++)
      {
        if( arr[i][j] % 2 == 0)
        {
          evenCount++;
        }else
        {
          oddCount++;
        }
      }
    }
    return new int[]{evenCount,oddCount};
  }

  // 14th method to search element in an matrix
  public static boolean searchElement(int[][] arr, int num)
  {
    // boolean found = false;
    for(int i = 0; i < arr.length; i++)
    {
      for(int j = 0; j < arr[i].length; j++)
      {
        if(arr[i][j] == num)
        {
          return true;
        }
      }
    }
    return false;
  }

  // 15th method for scalar multiplication
  public static void scalarMultiplication(int[][] arr, int scalar)
  {
    for( int i = 0; i < arr.length; i++)
    {
      for(int j = 0; j < arr[i].length; j++)
      {
        arr[i][j] = arr[i][j] * scalar;
      }
    }
  }

  //16th method to find sum of elements greater than 50 in 2d array
  public static int sumOfElementsGreaterThan50(int[][] arr)
  {
    int sum = 0;
    for(int i = 0; i < arr.length; i++)
    {
      for(int j = 0; j < arr[i].length; j++)
      {
        if(arr[i][j] > 50)
        {
          sum += arr[i][j];
        }
      }
    }
    return sum;
  }

  //17th method to find max present in every row and store it in an array
  public static int[] maxInEeveryRow(int[][] arr)
  {
    int[] maxInRows = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      int max = arr[i][0];
      for (int j = 1; j < arr[i].length; j++) {
        if (arr[i][j] > max) {
          max = arr[i][j];
        }
      }
      maxInRows[i] = max;
    }
    return maxInRows;
  }

  //18th method to find min even present in 2d array
  public static int minEven(int[][] arr)
  {
    int min = arr[0][0];
    for(int i = 0; i < arr.length; i++)
    {
      for( int j = 0 ; j< arr[i].length; j++)
      {
        if( arr[i][j] % 2== 0 && arr[i][j] < min)
        {
          min = arr[i][j];
        }
      }
    }
    return min;
  }

  //19th method to multiply matrix by -1
  public static int[] multiplication(int[][] arr)
  {
    for(int  i = 0; i <arr.length; i++)
    {
      for( int j = 0; j < arr[i].length; j++)
      {
        arr[i][j] = arr[i][j] * -1;
      }
    }
    return new int[]{arr.length, arr[0].length};
  }

  //20th method to multiply only the main diagonal elements of 2d array by 10
  public static void multiplyMainDiagonalBy10(int[][]arr)
  {
    for( int i = 0 ; i < arr.length; i++)
    {
      for(int  j = 0; j < arr[i].length; j++)
      {
        if(i == j)
        {
          arr[i][j] = arr[i][j] *10;
        }
      }
    }
  }

  //21th method to count elments occurs
  public static int countElementOccurns(int[][] arr, int target)
  {
    int count = 0;
    for( int i = 0; i < arr.length; i++)
    {
      for( int j = 0; j <arr[i].length; j++)
      {
        if(arr[i][j] == target)
        {
          count ++;
        }
      }
    }
    return count;
  }

  //22nd method to sarch element only in main diagonal
  public static boolean elmentExitInDiagonal(int[][] arr, int element)
  {

    for(int i = 0; i < arr.length; i++)
    {
      for(int  j = 0; j < arr[i].length; j++)
      {
        if(arr[i][j] == element)
        {
          return true;
        }
      }
    }
    return false;
  }

  //23th matrix diagonal sum
  public static int diagonalSum(int[][] mat)
  {
      int sum =0;
      for(int  i = 0; i < mat.length; i++)
      {
        sum += mat[i][i];
        if(i != mat.length -1-i)
        {
          sum += mat[i][mat.length -1-i];
        }
      }
      return sum;
  }

  // 1572 leetcode problem (matrix diagonal sum)
  public static int matrixdiagonalSum(int[][] mat)
  {
    int sum = 0;
    for( int i = 0; i <mat.length; i++)
    {
      sum += mat[i][i];
      if( i != mat.length-1-i)
      {
        sum += mat[i][mat.length-1-i];
      }
    }
    return sum;
  }

  //867 leetcode problem (transpose of matrix)
  public static int[][] transpose(int[][] matrix)
  {
    int row = matrix.length;
    int col = matrix[0].length;
    int result[][] = new int[col][row];
    for( int i = 0; i < row;i++)
    {
      for( int j = 0; j <col; j++)
      {
        result[j][i] = matrix[i][j];
      }
    }
    return result;
  }

  //566 leetcode problem (reshape the matrix)
  public static int[][] reshapeMatrix(int[][] mat, int r, int c)
  {
    int row = mat.length;
    int col = mat[0].length;

    if( row * col != r*c)
    {
      return mat;
    }

    int k = 0;
    int l = 0;
    int result[][] = new int [r][c];
    for( int i = 0; i < row; i++)
    {
      for( int j = 0; j < col; j++)
      {
        result[k][l] = mat[i][j];
        l++;
        if( l == c)
        {
          l=0;
          k++;
        }
      }
    }
    return result;
  }

  //832. Flipping an Image
  public static int[][] flipAndInvertImage(int[][] arr)
  {
    for( int i = 0; i <arr.length; i++)
    {

      int start = 0;
      int end = arr[i].length-1;

      while(start <= end)
      {
        // swap element
        int temp = arr[i][start];
        arr[i][start] = arr[i][end];
        arr[i][end] = temp;

        //invers the elements
        if(arr[i][start] == 0)
        {
          arr[i][start] = 1;
        }
        else{
          arr[i][start] = 0;
        }
        if(start != end)
        {
            if(arr[i][end] == 0)
          {
            arr[i][end] = 1;
          }
          else{
            arr[i][end] = 0;
          }
        }

        

        start++;
        end--;
      }
    }
    return arr;
    
  }


  //1351. Count Negative Numbers in a Sorted Matrix
  public static int CountNegativeNumber(int[][] matrix)
  {
    int count = 0;
    for( int i = 0; i < matrix.length; i++)
    {
      
      for(int j = 0; j < matrix[0].length; j++)
      {
        if(matrix[i][j] < 0)
        {
          count++;
        }
      }
    }
    return count;
  }

  // print the boundary elements in an 2D array
  public static void boundaryElements(int[][]arr)
  {
    for(int i = 0; i < arr.length; i++)
    {
      for(int j = 0; j < arr[i].length; j++)
      {
        if(i == 0 || j == 0 || i == arr.length-1 || j == arr[i].length-1)
        {
          System.out.print(arr[i][j] + "  ");
        }
        else{
          System.out.print("   ");
        }
      }
      System.out.println();
    }
  }

  //1380 leetcode problem lucky number in a matrix
  public static List<Integer> luckyNumbers(int[][] matrix)
  {
    List<Integer> ans = new ArrayList<>();
        for(int  i = 0; i < matrix.length; i++)
        {
          int min = matrix[i][0];
          int col =0;

          //find minmum in a row
          for(int j = 1; j < matrix[i].length; j++)
          {
            if(matrix[i][j] < min)
            {
              min = matrix[i][j];
              col = j;
            }
          }

          //find whether it is max in it col
          boolean islucky = true;
          for(int k = 0; k < matrix.length; k++)
          {
            if(matrix[k][col] >min)
            {
              islucky = false;
              break;
            }
          }
          if(islucky)
          {
            ans.add(min);
          }
        }
        return ans;
  }

  //74 leetcode problem: search a 2D matrix
   public static boolean searchMatrix(int[][] matrix, int target)
   {
        for(int i = 0; i < matrix.length; i++)
        {
          for(int j =0; j < matrix[i].length; j++)
          {
            if( matrix[i][j] == target)
            {
              return true;
            }
            
          }
        }
        return false;
   }
  
  public static void main(String[] args)
  {
    int [] [] arr = 
    {
      {11,12,13,14,44},
      {21,22,23,24,25},
      {31,44,33,44,35},
      {41,42,43,44,45},
      {51,52,53,44,55}
    };

    
    int [] [] arr1 = 
    {
      {1,2,3},
      {4,10,6},
      {7,8,9}
    };

    int [] [] arr2 = 
    {
      {1,2,3},
      {4,10,6},
      {7,8,9}
    };

      // 1st method to print 2d array
    printArray(arr);
    System.out.println();

    // 2nd method using for each loop to print 2d array
    printArrayUsingForEach(arr);
    System.out.println();

    // 3rd method to add two 2d array and store result in 3rd array
    int [] [] result3 = addTwo2DArray(arr1, arr2);
    printArray(result3);
    System.out.println();

    // 4th method to multiply two 2d array and store result in 3rd array
    int [] [] result2 = multiplyTwo2DArray(arr1, arr2);
    printArray(result2);
    System.out.println();

    // 5th method to print element row by row
    System.out.println("Printing particular row");
    printParticularRow(arr,5);
    System.out.println();

    // 6th method to print a 3*3 2d array
    print3x3Array(arr);
    System.out.println();

    // 7th method to print the particular row in 2d array
    System.out.println("Printing particular row");        
    System.out.println(Arrays.toString(printParticularRow(arr, 1)));
    System.out.println();

    // 8th method to print the particular column in 2d array
    System.out.println("Printing particular column");
    printParticularColumn(arr,5);
    System.out.println();

    // 9th method to print diagonal elements of 2d array
    System.out.println("Printing diagonal elements");
    printDiagonalElements(arr);
    System.out.println();

    // 10th method to find sum of elements of 2d array
    int result = sumOfElements(arr);
    System.out.println("sum of elements: "+result);
    System.out.println();

    // 11th method to find maximum element in 2d array
    int ans = maxElements(arr1);
    System.out.println("Maximum element in arr1: " + ans);
    System.out.println();

    // 12th method to find minimum element in 2d array
    int ans1 = minElements(arr1);
    System.out.println("Minmum element in arr1: " + ans1);
    System.out.println();

    // 13th method to return evenCount and oddCount
    int[] off = evenOddCount(arr1);
      System.out.println("evencount : "+off[0]);
      System.out.println("oddcount : "+off[1]);
      System.out.println();

    //14th method to search element in an matrix
    boolean found = searchElement(arr,2);
    if(found)
    {
      System.out.println("Element found in the array.");
    }
    else
    {
      System.out.println("Element not found in the array.");
    }
    System.out.println();

    // 15th method for scalar multiplication
    scalarMultiplication(arr1,2);
    for(int i = 0; i < arr1.length; i++)
    {
      for(int j = 0; j < arr1[i].length; j++)
      {
        System.out.print(arr1[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();

    //16th method to find sum of elements greater than 50 in 2d array
    int sumGreaterThan50 = sumOfElementsGreaterThan50(arr);
    System.out.println("Sum of elements greater than 50: " + sumGreaterThan50);
    System.out.println();

    //17th method to find max present in every row and store it in an array
    int[] maxInRows = maxInEeveryRow(arr);
    System.out.println("Maximum elements in each row: " + Arrays.toString(maxInRows));
    System.out.println();

    //18th method to print min even
    System.out.println("min even: " + minEven(arr));
    System.out.println();

    //19th method to multiply matrix by  -1;
    // multiplication(arr);
    for(int i = 0; i < arr.length; i++)
    {
      for(int j = 0; j < arr[i].length; j++)
      {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();

    //20th method to multiply only the main diagonal elements of 2d array by 10
    multiplyMainDiagonalBy10(arr);
    for(int i = 0; i < arr.length; i++)
    {
      for(int j = 0; j < arr[i].length; j++)
      {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println();

    //21st method to count element occurs in 2d array
    int countans = countElementOccurns(arr,44);
    System.out.println("number of time element occurs: " + countans);
    System.out.println();

    //22nd method to sarch element only in main diagonal
    System.out.println(elmentExitInDiagonal(arr,56));
    System.out.println();

    //1572 leetcode problem (matrix diagonal sum)
    int[][] mat = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    System.out.println("Diagonal sum: " + matrixdiagonalSum(mat));
    System.out.println();

    //867 leetcode problem (transpose of matrix)
    int[][] matrix = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    
    int[][] transposed = transpose(matrix);
    System.out.println("Transposed matrix:");
    for (int[] row : transposed) {
      System.out.println(Arrays.toString(row));
    }
    System.out.println();

    //566 leetcode problem (reshape the matrix)
    int[][] mat1 = {
      {1, 2},
      {3, 4}
    };
    System.out.println("Reshaped matrix:");
    int[][] reshaped = reshapeMatrix(mat1, 1, 4);
    for (int[] row : reshaped) {
      System.out.println(Arrays.toString(row));
    }
    System.out.println();

    //832 flipping the image
    int[][] image = {
        {1, 1, 0},
        {1, 0, 1},
        {0, 0, 0}
      };

      int[][] result1 = flipAndInvertImage(image);

        for (int i = 0; i < result1.length; i++) {
          for (int j = 0; j < result1[i].length; j++) {
              System.out.print(result1[i][j] + " ");
          }
          System.out.println();
      }

      //1351 count negative numbers in sorted matrix
      int [][] matrix1 = {
        {4,3,2,1},
        {3,2,1,1},
        {1,1,1,2},
        {1,1,2,3}
      };

      int ans3 = CountNegativeNumber(matrix1);
      System.out.println(ans3);


      //boundary element print
      boundaryElements(matrix1);


      //lucky number in matrix
      System.out.println(luckyNumbers(matrix));

      //74 leetcode problem: search a 2d matrix
      System.out.println(searchMatrix(matrix,-1));

  }
}
