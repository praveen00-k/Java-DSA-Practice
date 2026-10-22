public class MyArray
{
  int [] arr;//place to store elements
  int length;//total size of an array
  int rightIndex;//this will pointing at empty array

  public  MyArray()
  {
    length = 5;
    arr = new int[length];//[0][0][0][0][0] -->initial array
    rightIndex =0;
  }

  // insert at end
  public void insertAtEnd(int value)
  {
    if(rightIndex == length)
    {
      System.out.println("Array is full");
      return ;
    }
    arr[rightIndex]=value;
    rightIndex ++;
  }

  //insert at start
  public void insertAtStart(int value)
  {
    if(rightIndex == length)
    {
      System.out.println("Array is full");
      return ;
    }
    //shift one elements to right position till we reach at 0th index
    for(int i = rightIndex-1; i>= 0;i--)
    {
      arr[i+1] = arr[i];
    }
    //insert value at 0th index
    arr[0] = value;
    rightIndex++;
  }

  //insert at specific index
  public void insertAtIndex(int value, int position){
    if(rightIndex == length)
    {
      System.out.println("array is full");
      return;
    }
    if(position <0 || position > rightIndex)
    {
      System.out.println("invalid position");
      return;
    }
    else{
      //shift elements to right from position to rightIndex-1
      for(int i = rightIndex-1; i > position; i--)
      {
        arr[i+1] = arr[i];
      }
      arr[position] = value;
      rightIndex ++;
    }
  }

  //Deletion in an array

  //deletion at end
  public void deletFromEnd(){
    if(rightIndex == 0)
    {
      System.out.println("Array is empty");
      return ;
    }
    arr[rightIndex -1] =0;  //rightIndex is equal to size of element in an array
    rightIndex --;
  }

  //deletion at start
  public void deletFromStart(){
    if(rightIndex == 0)
    {
      System.out.println("Array is empty");
      return ;
    }
    //shift elements from index = 0(from start)
    for(int i = 0 ; i<rightIndex; i++){
      arr[i]=arr[i+1];
    }
    rightIndex --;
    arr[rightIndex]=0;
  }

  //deletion from anyPosition 
  public void deletFromAnyPosition(int position){
    if(position < 0 || position > rightIndex)
    {
      System.out.println("Invalid Position");
      return ;
    }
    //shift
    for(int i = position ; i< rightIndex-1; i++){
      arr[i] = arr[i+1];
    }
    rightIndex --;
    arr[rightIndex] = 0;
    //we are reducing size(rightIndex) becoz we deleted 1 element from end
    
  }

  //display array
  public void printArray()
  {
    for(int i = 0; i < rightIndex; i++)
    {
      System.out.println("index " + i + ": " + "Value: " + arr[i]);
    }
    System.out.println("Size: " + rightIndex);
    System.out.println();
  }
}
