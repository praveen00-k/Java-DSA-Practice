import java.util.Arrays;

public class SearchInString {
  static boolean search( String str, char target){
    if(str.length() == 0){
      return false;
    }
    for(char ch : str.toCharArray()){
      if(ch == target){
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    String name = "praveen";
    char target = 'e';
    System.out.println(search(name,target));
    //onverts the String into a character array
    System.out.println(Arrays.toString(name.toCharArray()));
  }
}
