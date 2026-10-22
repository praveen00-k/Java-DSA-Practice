public class CharacterArray {

  //1st question
  public static int[] countVowlesConsonants(char[] arr)
  {
    int vowels =0 , consonants = 0;

    for( int i =0; i< arr.length; i++)
    {
      char ch = Character.toLowerCase(arr[i]);
      if(ch >= 'a' && ch <='z'){
        if( ch =='a' ||ch == 'e' ||ch == 'i' || ch == 'o' ||ch == 'u')
        { 
           vowels++;
        }
        else
        {
          consonants++;
        }
      }
    }
    return new int[]{vowels, consonants};
  }

  //2nd question
  public static int countTarget(char [] arr, char target)
  {
    int count = 0;
    for(int i =0; i< arr.length; i++)
    {
      if(arr[i] == target)
      {
        count++;
      }
    }
    return count;
  }

  //3rd question
  public static void convertLowerToCapitals(char[] letters)
  {
      for (int i = 0; i < letters.length; i++) {
          if (letters[i] >= 'a' && letters[i] <= 'z') {
              letters[i] = (char) (letters[i] - ('a' - 'A'));
              //a = 97; A =65 ===> 97 -(97-65) = 97 -32 => 65
          }
      }
  }   
  

  //4th question
  public static boolean checkDigitContains(char[] arr)
  {
    for( int i = 0; i<arr.length; i++)
    {
      if(arr[i] >= '0' && arr[i]<= '9')
      {
        return true;
      }
    }
    return false;
  }

  //5th question
public static char[] firstAndLast(char[] arr)
{
    if (arr == null || arr.length == 0)
    {
        return new char[0];
    }

    char[] result = new char[2];

    result[0] = arr[0];
    result[1] = arr[arr.length - 1];

    return result;
}

//6th question
public static int countCaptialLetter(char [] arr)
{
  if(arr == null || arr.length == 0)
  {
    return -1;
  }

  int count =0;
  for(int i=0; i<arr.length; i++)
  {
    if(arr[i] >='A' && arr[i]<'Z')
    {
      count++;
    }
  }
  return count;
}

//7th question
public static boolean checkPassword(char[] arr)
{
    if (arr == null || arr.length < 8)
    {
        return false;
    }

    for (int i = 0; i < arr.length; i++)
    {
        if (arr[i] >= '0' && arr[i] <= '9')
        {
            return true;
        }
    }

    return false;
}
  //8th question
  public static char[] newArray(char[] arr)
  {
    for(int i = 0; i< arr.length;i++)
    {
      if(arr[i] == ' ')
      {
        arr[i]='_';
      }
    }
    return arr;

  }

  // 9th question
public static int countWords(char[] arr)
{
    if (arr == null || arr.length == 0)
    {
        return 0;
    }

    int words = 0;

    for (int i = 0; i < arr.length; i++)
    {
        if (arr[i] != ' ' && (i == 0 || arr[i - 1] =  = ' '))
        {
            words++;
        }
    }

    return words;
}

  //10th question
  public static char[] returnCapitals(char[] arr)
  {
    char[] temp =  new char[arr.length];
    int index = 0;
    for(int i = 0; i< arr.length; i++)
    {
      if(i == 0 ||arr[i-1] == ' ')
      {
        if(arr[i] != ' ')
        {
          temp[index] = Character.toUpperCase(arr[i]);
          index++;
        }
      }
    }
    char[] result = new char[index];
    for(int i =0 ;i<index; i++)
    {
      result[i] = temp[i];
    }
    return result;
  }

  //11th question
  public static char[] removeVowles(char [] arr)
  {
    int count = 0;
    for(int i = 0;i < arr.length; i++)
    {
        char ch = arr[i];
        if(ch >= 'a' && ch <='z')
        {
            if( ch !='a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
            { 
              count ++;
            }
        }
    }
    char[] result= new char[count];
    int z = 0;
    for(int i =0; i < arr.length; i++)
    {
        char ch = arr[i];
        if(ch >= 'a' && ch <='z')
        {
            if( ch !='a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
            { 
              result[z]=ch;
              z++;
            }
        }
    }
    return result;
  }

  //12th question
  public static char lastAlphabetic(char[] arr)
  {
    char max = arr[0];
    for(int i = 0 ; i<arr.length; i++)
    {
      char ch = arr[i];
      if(ch >= 'a' && ch <='z')
      {
        if(arr[i] >= max)
        {
          max = arr[i];
        }
      }
    }
    return max;
  }

  //13th question
  public static int countGrade(char[] arr , char target)
  {
    int count =0;
    for(int i =0; i < arr.length; i++)
    {
      if(arr[i] == target)
      {
        count++;
      }
    }
    return count;
  }

  //14th question
  public static int sumDigit(char[] arr)
  {
    int sum = 0;
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] >= '0' && arr[i] <= '9')
      {
        sum += arr[i] - '0';
      }
    }
    return sum;
  }

  //15th question
  public static int[] traficColorCount(char[] arr)
  {
    int redColor = 0;
    int greenColor = 0;
    int yellowColor = 0;

    for(int i =0; i < arr.length; i++)
    {
      char ch =arr[i];
      if(ch =='R')
      {
        redColor++;
      }
      else if(ch =='G')
      {
        greenColor++;
      }
      else if(ch =='Y')
      {
        yellowColor++;
      }
    }
    return new int[]{redColor, greenColor, yellowColor};
  }

  //16th question
  public static boolean checkMobileNumber(char [] arr)
  {
    if(arr.length != 10)
    {
      return false;
    }
    for(int i = 0; i<arr.length; i++)
    {
      char ch =arr[i];
      if(ch <'0' || ch>'9')
      {
        return false;
      }
    }
    return true;
  }

  //17th question
  public static char[] movForwardLetter(char[] arr)
  {
    for(int i = 0; i< arr.length ;i++)
    {
      if(arr[i] =='z')
      {
        arr[i] = 'a';
      }
      else{
        arr[i] ++;
      }
    }
    return arr;
  }

  //18th question
  public static int[] returnIndexes(char[]arr, char target)
  {
    int count = 0;
    for(int i = 0; i<arr.length; i++)
    {
      if(arr[i] == target)
      {
        count++;
      }
    }

    int [] result = new int[count];
    int indexe = 0;
    for(int i = 0; i<arr.length; i++)
    {
      if(arr[i] == target)
      {
        result[indexe] =i;
        indexe++;
      }
    }
    return result;
  }
  
  //19th question
  public static boolean checkWord(char[]arr)
  {
    int start = 0;
    int end = arr.length-1;
    while(start <end)
    {
      if(arr[start]!= arr[end])
      {
        return false;
      } 
      start++;
      end--;
    }
    return true;
  }

  //20th question
  public static int countSameCharacte(char[] arr1, char[]arr2)
  {
    int count = 0;
    for(int i=0; i<arr1.length;i++)
    {
      if(arr1[i] == arr2[i])
      {
        count++;
      }
    }
    return count;
  }

  //21th question
  public static int calculateScore(char[] answers, char[] key) {
    int score = 0;

    for (int i = 0; i < answers.length; i++) 
    {
      if (answers[i] == key[i])
      {
         score++;
      }
    }
    return score;
  }

  //22th question
    public static char[] findMissing(char[] a, char[] b) {
        int count = 0;

        // Count characters not present in b
        for (int i = 0; i < a.length; i++) {
            int j = 0;

            while (j < b.length && a[i] != b[j]) {
                j++;
            }

            if (j == b.length) {
                count++;
            }
        }

        char[] result = new char[count];
        int k = 0;

        // Store characters not present in b
        for (int i = 0; i < a.length; i++) {
            int j = 0;

            while (j < b.length && a[i] != b[j]) {
                j++;
            }

            if (j == b.length) {
                result[k] = a[i];
                k++;
            }
        }

        return result;
    }

    //23th question
    public static char[] fullName(char[] first, char[] last) {
        char[] result = new char[first.length + last.length + 1];

        int k = 0;

        for (int i = 0; i < first.length; i++) {
            result[k] = first[i];
            k++;
        }

        result[k] = ' ';
        k++;

        for (int i = 0; i < last.length; i++) {
            result[k] = last[i];
            k++;
        }

        return result;
    }

    //24th question
    public static  boolean sameLetters(char[] a, char[] b)
    {
        if (a.length != b.length)
        {
            return false;
        }

        for (int i = 0; i < a.length; i++) 
        {
            int count1 = 0;
            int count2 = 0;

            for (int j = 0; j < a.length; j++)
            {
                if (a[i] == a[j])
                {
                    count1++;
                }

                if (a[i] == b[j])
                {
                    count2++;
                }
            }
            if (count1 != count2)
            {
                return false;
            }
        }
        return true;
    }

    //25th question
     public static char mostVotes(char[] booth1, char[] booth2, char[] booth3)
     {
        int votesA = 0;
        int votesB = 0;

        char[][] booths = {booth1, booth2, booth3};

        for (int i = 0; i < booths.length; i++)
        {
            for (int j = 0; j < booths[i].length; j++)
            {
                if (booths[i][j] == 'A')
                {
                    votesA++;
                } 
                else if (booths[i][j] == 'B')
                {
                    votesB++;
                }
            }
        }

        if (votesA >= votesB)
        {
            return 'A';
        }
        else
        {
            return 'B';
        }
    }



    //passwordcheck
    public static boolean check1Password(char[] arr) {
    if (arr == null) {
        System.out.println("Password cannot be null.");
        return false;
    }

    boolean valid = true;

    if (arr.length != 8) {
        System.out.println("Password must be exactly 8 characters.");
        valid = false;
    }

    boolean hasUpper = false;
    boolean hasLower = false;
    boolean hasDigit = false;
    boolean hasSpecial = false;

    for (char ch : arr) {
        if (ch >= 'A' && ch <= 'Z') {
            hasUpper = true;
        } else if (ch >= 'a' && ch <= 'z') {
            hasLower = true;
        } else if (ch >= '0' && ch <= '9') {
            hasDigit = true;
        } else if (!Character.isWhitespace(ch)) {
            hasSpecial = true;
        }
    }

    if (!hasUpper) {
        System.out.println("No uppercase letter found.");
        valid = false;
    }
    if (!hasLower) {
        System.out.println("No lowercase letter found.");
        valid = false;
    }
    if (!hasDigit) {
        System.out.println("No digit found.");
        valid = false;
    }
    if (!hasSpecial) {
        System.out.println("No special character found.");
        valid = false;
    }

    return valid;
}
  public static void main(String[] args) {
    char[] l1 = {'a','A','a','a','C','a'};
    // char[] l2 = {'B','B','A','B'};
    // char[] l3 = {'A','A'};

    System.out.println(checkPassword(l1));
    System.out.println(countCaptialLetter(l1));
    System.out.println(firstAndLast(l1));

    System.out.println(check1Password(l1));
    // System.out.println(mostVotes(l1, l2, l3));
    // System.out.println(sameLetters(l1,l2));
    // System.out.println(findMissing(l1,l2));
    // char[] result = fullName(l1, l2);

    //     System.out.println("Full name: " + Arrays.toString(result));

    // System.out.println(countSameCharacte(l1,l2));
    // System.out.println(calculateScore(l1,l2));
    // System.out.println(checkWord(letters));
    
    // char[] ans = movForwardLetter(l1,l2);
    // for( int i = 0; i<ans.length; i++)
    // {
    //   System.out.print(ans[i]+" " );
    // }
    // char[] ans =movForwardLetter(letters);
    // for( int i = 0; i<ans.length; i++)
    // {
    //   System.out.print(ans[i]+" " );
    // }

    

    // System.out.println(checkMobileNumber(letters));
    // System.out.println(Arrays.toString(traficColorCount(letters)));
    
    // System.out.println(sumDigit(letters));
    // System.out.println(countGrade(letters,'A'));


    // System.out.println(lastAlphabetic(letters));

    // char[] rs = removeVowles(letters);
    // for(int i =0; i< rs.length; i++)
    // {
    //   System.out.println(rs);
    // }
    // System.out.println(rs);
    // System.out.println(newArray(letters));
    // System.out.println(countWords(letters));
    // System.out.println(returnCapitals(letters));



    // System.out.println(checkDigitContains(letters));
    // int[] result =countVowlesConsonants(letters);
    // char target ='a';
    // System.out.println(countTarget(letters, target));
    // System.out.println(Arrays.toString(result));
    // convertLowerToCapitals(letters);
    // System.out.println(java.util.Arrays.toString(letters)); // [C, O, D, E]
  }
}
