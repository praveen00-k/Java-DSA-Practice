public class HalfNumber {

    // Pass by value:
    static void halfByValue(int number) {
        number = number / 2; //number become 10
        System.out.println("Inside halfByValue: " + number);
    }
    static int halfByValue1(int number1) {
        number1 = number1 / 2; //number become 10
        return number1;
    }

    // Java passes the reference by value
    static void halfByReference(Data newData) {
        newData.number = newData.number / 2;
    }

    public static void main(String[] args) {
        //call  by value
        int value = 20;
        halfByValue(value);
        System.out.println("After halfByValue: " + value); // 20


        // static non-void pass by value
        int number1 = 10;
        int result = halfByValue1(number1);
        System.out.println("static non-void pass by value: " + result);

        //call by reffernce
        Data newData = new Data();
        newData.number = 20;
        halfByReference(newData);
        System.out.println("After halfByReference: " + newData.number); // 10
    }
}
