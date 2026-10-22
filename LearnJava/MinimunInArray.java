public class MinimunInArray {
  static int mini(int[] arr, int min)
  {
    if(arr.length == 0){
      return -1;
    }
    for(int i=0; i< arr.length; i++){
      if(arr[i] < min){
        min = arr[i];
      }
    }
    return min;
  }

  public static void main(String[] args) {
    int [] arr = {18,12,7,89,4,6,78};
    int min = arr[0];
    System.out.println(mini(arr, min));
  }
}
