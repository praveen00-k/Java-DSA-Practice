import java.util.Scanner;

public class chararray {
    // replace the vowels by the star miniEncrypation
    public static void miniEncrypation(char [] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {   
            arr[i] = (char) (arr[i] +  'a' - 'A' - i + ' ');
        }

    }

    //decrypating the encrypated message
    public static void miniDecrypation(char[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (char) (arr[i] - 'a' + 'A' + i-' ');
        }
    }
    public static void printCharElements(char[] arr)
    {
        if(arr == null || arr.length == 0)
        {
            return ;
        }
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // String name = "Hi Hamza, How are you?";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the char: ");
        String ch = sc.nextLine();
        char[]  message = ch.toCharArray();


        System.out.println("befor encryption");
        printCharElements(message);
        System.out.println();

        System.out.println("After encryption");
        miniEncrypation(message);
        printCharElements(message);

        System.out.println();
        System.out.println("after decryption");
    
        miniDecrypation(message);
        printCharElements(message);
        sc.close();
    }
}
