public class MethodcallingMethod {

  static void CalculateSalary(){
    calculateTax();
    System.out.println("Total salary = ");
  }
  static void calculateTax(){
    CalculateDA();
    System.out.println("TAX done");
  }

  static void CalculateDA(){
    CalculateHRA();
    System.out.println("DA done");
  }
  static void CalculateHRA(){
    CalculateBasic();
    System.out.println("HRA done");
  }
  static void CalculateBasic(){
    System.out.println("Basic calculated ");
  }
    public static void main(String[] args) {
    CalculateSalary();
  }

  public static void miniEncrypation(char[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if ("aeiouAEIOU".indexOf(arr[i]) >= 0) {
            arr[i] = '*';
        } else {
            arr[i] = (char) (arr[i] + 32 + i);
        }
    }
}

public static void miniDecrypation(char[] arr) {
    for (int i = 0; i < arr.length; i++) {
        // A '*' could also have been in the original text, so this
        // simple scheme can't know which stars were vowels.
        if (arr[i] != '*') {
            arr[i] = (char) (arr[i] - 32 - i);
        }
    }
}
}
