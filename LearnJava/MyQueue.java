public class MyQueue {
  private int[] values;
  private int first = 0;
  private int last= 0;
  private int size= 0;
  private int count= 0;

  public MyQueue(int size)
  {
    this.size = size;
    this.values = new int[size]; 
  }

  public int enqueue(int value)
  {
    // Check if the queue is full
    if(this.count == this.size)
    {
      System.out.println("Queue is full");
      return -1;
    } 

    // If the last index has reached the end of the array and there is space at the beginning, wrap around
    if(this.last == this.size && this.first > 0)
    {
      //loop for count times
      for( int loop = 1; loop <= this.count; loop++)
      {
        //source index this.firstcopy it to 0
        this.values[loop-1] = this.values[this.first];
      }
      this.first = 0;
    }

    this.values[this.last] = value;
    this.last++;
    this.count++;
    return 0;
  }

  public int dequeue()
  { 
    int index = this.values[this.first];
    this.first++;
    this.count--;
    return index;
  }

  public boolean isEmpty()
  {
    if(this.count == 0)
    {
      return true;
    
    }
    return false;
  }

  public int getCount()
  {
    return this.count;
  }

}
