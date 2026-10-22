import java.util.Arrays;

public class twoSm {
  // public static int[] countEvenOddNumber(int[] arr)
  // {
    // 	int evenCount = 0;
    // 	int oddCount = 0;
    // 	for(int i = 0; i<arr.length; i++)
    // 	{
    // 		if(arr[i] % 2 == 0)
    // 		{
    // 			evenCount++;
    // 		}
    // 		else{
    // 			oddCount++;
    // 		}
    // 	}
    // 	return new int[] {oddCount, evenCount};
    
  // }

    public static double findAvg(int [] arr)
    {
    	int sum = 0;

    	for(int i =0 ; i<arr.length; i++){
            if(arr[i] <= 0 || arr[i]> 100){
                System.out.println("marks must be bwt 0 and 100");
            }
    		sum = sum +arr[i];
    	}
    	return (double) sum / arr.length;
    }

    // public static int[] greaterThan50AndLessThan100(int []arr)
    // {
    // 	int count = 0;
    // 	for(int i = 0; i<arr.length ; i++)
    // 	{
    // 		if(arr[i] >= 50&& arr[i] <= 100){
    // 			count++;
    // 		}
    // 	}

    // 	int [] result = new int[count];
    // 	int temp =0;

    // 	for(int i = 0 ; i< arr.length; i++)
    // 	{
    // 		if( arr[i] >= 50 && arr[i] <= 100)
    // 		{
    // 			result [temp] = arr[i];
    // 			temp++;
    // 		}
    // 	}
    // 	return result;
    // }

    // public  static int DifferenceOFLargestAndSmallestNumber(int []arr)
    // {
    // 	int max = arr[0];
    // 	int min = arr[0];
    // 	for(int i = 0;i < arr.length; i++)
    // 	{
    // 		if(arr[i] > max) 
    // 		{
    // 			max = arr[i];
    // 		}
    // 		else if(arr[i]< min)
    // 		{
    // 			min =arr[i];
    // 		}
    // 	}
    // 	return (int) max - min;
    // }

    // public static int passingMarks(int [] arr)
    // {
    // 	int count =0;
    // 	for( int i =0 ;i<arr.length; i++)
    // 	{
    // 		if(arr[i] >= 35){
    // 			count++;
    // 		}
    // 	}
    // 	return count;
    // }

    //6 question
    // public static int sumEvenIndicies(int[]arr)
    // {
    //     if(arr == null || arr.length == 0)
    //     {
    //         return -1;
    //     }

    //     int sum = 0;
    //     for(int i = 0; i < arr.length; i+=2)
    //     {
    //         sum += arr[i];
    //     }
    //     return sum;
    // }

    //7th question
    public static int countHotterDays(int[]arr)
    {
        if(arr == null || arr.length == 0)
        {
            return -1;
        }

        int count = 0;

        for( int i = 1; i < arr.length; i++)
        {
            if(arr[i] > arr[i-1])
            {
                count++;
            }
        }
        return  count;
    }

    //8th question
    public static int[] returnNewArray(int [] arr)
    {
        if(arr == null || arr.length == 0)
        {
            return new int[0];
        }
        int [] result = new int[arr.length];

        for( int i = 0; i < arr.length; i++)
        {
            if( arr[i] %2 ==0)
            {
                result[i] = arr[i] /= 2;
            }
            else
            {
                result[i] = arr[i] *= 2;
            }
        }
        return result;
    }

    // 9th question

    public static int countNumberDivisible(int []arr)
    {
        if(arr == null || arr.length ==0)
        {
            return -1;
        }
        int count =0;
        for(int i = 0; i < arr.length; i++)
        {
            if( arr[i] %3 ==0 && arr[i] %5 ==0)
            {
                count++;
            }
        }
        return count;
    }

    //10th question
    public static int closestAvgerageNumber(int [] arr)
    {
        if(arr == null || arr.length ==0)
        {
            return -1;
        }

        int sum = 0;

        for(int i= 0 ; i < arr.length; i++)
        {
            sum+=arr[i];
        }

        double avg = (double) sum / arr.length;
        int num = arr[0];
        double minDifference = arr[0] - avg;

        if(minDifference < 0)
        {
            minDifference = -minDifference;
        }

        for( int i= 0 ; i < arr.length; i++)
        {
            double difference = arr[i] - avg;
            if( difference < 0)
            {
                difference = -difference;
            }
            if( difference < minDifference)
            {
                minDifference = difference;
                num = arr[i];
            }
        }
        return num;
    }

    //11th question
    public static int[] stepCounter(int[]arr)
    {
        if (arr == null || arr.length == 0) 
        {
            return new int[-1];
        }
        int days = 0;
        int best = arr[0];

        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] > 10000)
            {
                days++;
            }

            if(arr[i] > best)
            {
                best = arr[i];
            }
        }
        return new int[]{days, best};
    }

    //12th question
    public static int[] replaceNegativeNumber(int[] arr)
    {
        if (arr == null || arr.length == 0) 
        {
            return new int[-1];
        }

        int[] result = new int[arr.length];
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] < 0)
            {
                result[i] = 0;
            }
            else{
                result[i] = arr[i];
            }
        }
        return result;
    }

    //13th question
    public static boolean checkIncreasingOrder(int[]arr)
    {
        if (arr == null || arr.length == 0) 
        {
            return false;
        }

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] <= arr[i-1])
            {
                return false;
            }
        }
        return true;
    }

    //14th question

    public static long sumFirstLastNum(int [] arr)
    {
        if (arr == null || arr.length == 0) 
        {
            return -1;
        }
        return (long) arr[0] + arr[arr.length-1];

    }

    //15th question
    public static double discount(int []arr)
    {
        if (arr == null || arr.length == 0) 
        {
            return 0;
        }

        long total = 0;
        for(int price : arr)
        {
            if(price < 0)
            {
                return -1;
            }

            total += price;
        }
        if(total > 1000)
        {
            return total * 0.90;
        }
        return total;
    }

    //16th question
    public static boolean isPalindrom(int num)
    {
        if( num < 0)
        {
            return false;
        }

        int temp =num;
        int rev = 0;
        while(num > 0)
        {
            int digit = num % 10;
            rev = rev *10 + digit;
            num /= 10;
        }
        return temp == rev;
    }

    public static int countPalindromes(int[]arr)
    {
        if (arr == null || arr.length == 0) 
        {
            return -1;
        }

        int count = 0;
        for( int x : arr)
        {
            if(isPalindrom(x))
            {
                count++;
            }
        }
        return count;
    }

    //17th question
    public static int digit(int num)
    {
        int n = num;
        int sum = 0;
        while( n > 0)
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int[] sumOfDigit(int arr[])
    {
        if(arr == null)
        {
            return new int[]{0};
        }
        int result[] = new int[arr.length];
        for(int i = 0; i < arr.length;i++)
        {
            result[i]= digit(arr[i]);
        }
        return result;
    }

    //18th question
    public static int countSignChange(int[] arr)
    {
        if( arr== null || arr.length == 0)
        {
            return 0;
        }
        int count = 0;
        for(int i = 1; i<arr.length; i++)
        {
            if((arr[i-1] < 0 && arr[i] > 0) || (arr[i-1] > 0 && arr[i] < 0)){
                count ++;
            }
        }
        return count;
    }

    //19th question

    public static int bestOver(int[] arr)
    {
        if (arr == null || arr.length == 0) 
        {
            return -1;
        }

        int maxRuns = arr[0];
        int bestOver = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > maxRuns)
            {
                maxRuns = arr[i];
                bestOver = i;
            }
        }
        return bestOver +1 ;
    }

    //20th question
    public static int countRavi(int [] ravi, int[] sita)
    {
        if( ravi == null ||sita ==null || ravi.length != sita.length)
        {
            System.out.println("array must have same length");
            return -1;
        }

        int count = 0;
        for(int i = 0; i < ravi.length;i++)
        {
            if(ravi[i] > sita[i])
            {
                count++;
            }
        }
        return count;
    }

    //21 question
    public static int[] biggerNumber(int[] ravi, int []sita)
    {
        if( (ravi == null || sita == null || ravi.length != sita.length)){
            return new int[-1];
        }
        int result[] = new int[ravi.length];
            for( int i = 0; i< ravi.length; i++)
            {
                if(ravi[i] > sita[i])
                {
                    result[i] = ravi[i];
                }
                else{
                    result[i] = sita[i];
                }
            }
        return result;
    }

    //23rd question
    public static int presentNumber(int[] A, int[] B)
    {
        if( (A == null || B == null || A.length != B.length)){
            return -1;
        }

        int sum = 0;
        for(int i = 0; i< A.length; i++)
        {
            if(A[i] > B[i])
            {
                sum += (A[i] - B[i]);
            }
        }
        return sum;
    }

    //22nd question
        //     Return the numbers in the first array that are not present in the second array.
        // Input to the function:  [1, 4, 6, 8, 10] and [4, 8, 12]
        // Return from the function:  [1, 6, 10]

        public static int[] printNumber(int[] a, int[] b)
        {
            int[] temp = new int[a.length];
            int count = 0;

            for( int i = 0; i< a.length; i++)
            {
                int found = 0;
                for( int j = 0; j < b.length; j++)
                {
                    if( a[i] == b[j])
                    {
                        found = 1;
                        break;
                    }
                }
                if(found == 0)
                {
                    temp[count]=a[i];
                    count++;
                }
            }
            int result[] = new int[count];
            for(int i =0; i < count; i++)
            {
                result[i] = temp[i];
            }
            return result;
        }



    public static int[] BubbleSort(int[]arr)
    {
        // in case 1 array is empty or null then it will print the array is empty and 
        // it does not return anything

        if (arr == null || arr.length == 0) 
        {
        System.out.println("array is empty");
        }

        //in case 2 array has only one element and it will return it directly.

        if(arr.length == 1)
        {
            return arr;
        }

        // in case 3 array has one or more elements then it will enter the nested for loop.
        

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length-1-i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void printArray(int[]arr)
    {
        for(int x : arr)
        {
            System.out.print(x + " " );
        }
    }

    public static void CompareElementArray(int [] arr)
    {
        if (arr == null || arr.length == 0) 
        {
        System.out.println("array is empty");
        }

        for( int i = 0; i < arr.length; i++)
        {
            for( int j = 0; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    System.out.println(arr[i] +" > " +arr[j]);
                }
                else if(arr[i] < arr[j])
                {
                    System.out.println(arr[i] +" < " +arr[j]);
                }
                else 
                {
                    System.out.println(arr[i] +" = " +arr[j]);
                }
            }
            System.out.println();
        }
    }
    public class Main {
    public static int maxProfit(int[] prices) {
        int bestProfit = 0;

        for (int buyDay = 0; buyDay < prices.length - 1; buyDay++) {
            for (int sellDay = buyDay + 1; sellDay < prices.length; sellDay++) {
                int profit = prices[sellDay] - prices[buyDay];

                if (profit > bestProfit) {
                    bestProfit = profit;
                }
            }
        }

        return bestProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit: " + maxProfit(prices));
    }
}
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int lowestPrice = prices[0];
        int bestProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - lowestPrice;

            if (profit > bestProfit) {
                bestProfit = profit;
            }

            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
            }
        }

        return bestProfit;
    }

    

  public static void main(String[] args) {
    int ravi[] = {1, 4, 6, 8, 10};
    int sita [] = {4, 8, 12};
    System.out.println(Arrays.toString(printNumber(ravi, sita)));
    System.out.println(presentNumber(ravi, sita));
    // System.out.println(Arrays.toString(biggerNumber(ravi, sita)));
    // System.out.println(countRavi(ravi,sita));
    
    // System.out.println(bestOver(arr));
    // System.out.println(countSignChange(arr));
    // System.out.println(Arrays.toString(sumOfDigit(arr)));
    // System.out.println(countPalindromes(arr));
    // System.out.println(discount(arr));
    // System.out.println(sumFirstLastNum(arr));
    // System.out.println(checkIncreasingOrder(arr));
    // System.out.println(Arrays.toString(replaceNegativeNumber(arr)));
    // System.out.println(closestAvgerageNumber(arr));
    // System.out.println(sumEvenIndicies(arr));

    // System.out.println(countHotterDays(arr));
    // System.out.println(Arrays.toString(returnNewArray(arr)));
    // System.out.println(countNumberDivisible(arr));

    // CompareElementArray(arr);
    //     // int [] result = countEvenOddNumber(arr);
        
        // System.out.println("[" + result[0]+ ", " + result[1] + "]");
    // //2
        // double ans = findAvg(arr);
        // System.out.println(ans);
        // System.out.println(Arrays.toString(greaterThan50AndLessThan100(arr)));
        // System.out.println(DifferenceOFLargestAndSmallestNumber(arr));
        // System.out.println(passingMarks(arr));

        // System.out.println("before the sorting the array: ");
        // printArray(arr);

        // System.out.println();
        // BubbleSort(arr);
        // System.out.println();
        // System.out.println("after the sorting the array: ");
        // printArray(arr);

  }
}