public class TWODArray {
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

  //uisng for each loop to print 2d array
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

  //add two 2d array and store result in 3rd array
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

  // multiple two array and store in 3rd array
  public static int [] [] multiplyTwo2DArray( int [] [] arr1, int [] [] arr2)
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

  //print element row by row
  public static void printArrayRowByRow(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  // wwrite a function to print a 3*3 2d array
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
  // print the paticluar row in 2d array
  public static void printParticularRow(int[][] arr, int row)
  {
     int rowIndex = row - 1; // Adjust for 0-based indexing
    if(row <= 0 || row > arr.length) {
      System.out.println("Invalid row index.");
      return;
    }
    for(int i = 0 ; i < arr[rowIndex].length; i++)
    {
      System.out.print(arr[rowIndex][i] + " ");
    }
    System.out.println();
  }

  //print particular colum in 2d array
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
  // print diagonal elements of 2d array
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

  public static void main(String[] args)
  {
    int [] [] arr = 
    {
      {11,12,13,14,15},
      {21,22,23,24,25},
      {31,32,33,34,35},
      {41,42,43,44,45},
      {51,52,53,54,55}
    };
    print3x3Array(arr);
    System.out.println();

    System.out.println("Printing particular row");
    printParticularRow(arr,5);
    System.out.println();

    System.out.println("Printing particular column");
    printParticularColumn(arr,5);
    System.out.println();

    System.out.println("Printing diagonal elements");
    printDiagonalElements(arr);
    System.out.println();

    // printParticularColumnJagged(arr);
    
    // printArray(arr);
    // System.out.println();

    // printArrayUsingForEach(arr);
    // System.out.println();

    int [] [] arr1 = 
    {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };
    int [] [] arr2 = 
    {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };
    // int [] [] result = addTwo2DArray(arr1, arr2);
    // printArray(result);
    // System.out.println();

    // int [] [] result2 = multiplyTwo2DArray(arr1, arr2);
    // printArray(result2);
  }
}
