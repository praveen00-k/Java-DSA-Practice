import java.util.Arrays;

public class mergeSort {
  public static int[] MergeSort(int[]arr, int low, int high)
  {
    if(low >= high)
    {
      return new int[]{-1};
    }

    int mid = low + (high - low) / 2;
    MergeSort(arr, low, mid);
    MergeSort(arr, mid + 1, high);
    merge(arr, low, mid, high);

    return arr;
  }

  public static void merge(int[] arr, int low, int mid, int high) {
    int[] temp = new int[high - low + 1];
    int i = low, j = mid + 1, k = 0;

    while (i <= mid && j <= high) {
      if (arr[i] < arr[j]) {
        temp[k++] = arr[i++];
      } else {
        temp[k++] = arr[j++];
      }
    }

    //copy remaining elements from left 
    while (i <= mid) {
      temp[k++] = arr[i++];
    }

    //copy remaining elements from right
    while (j <= high) {
      temp[k++] = arr[j++];
    }

    //copying the original array from temp array
    for(int l = 0; l < temp.length; l++)
    {
      arr[low + l] = temp[l];
    }
    
  }

  public static void main(String[] args) {
    int [] arr ={10,4,8,5,6,3,7,2,1};

    System.out.println(Arrays.toString((MergeSort(arr, 0, arr.length-1))));
  }
}
