import java.util.*;
class Main {
  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("bananas");
    arr.add("apples");
    arr.add("kiwi");
    arr.add("tangerines");
    arr.add("oranges");
    arr.add("grapefruit");
    for(int i = arr.size() - 1; i > 0; i--) {
      if(arr.get(i).substring(arr.get(i).length()-1 ).equals("s")) {
        arr.add(arr.size()-i, arr.remove(i));
      }
    }
    for(String a : arr) {
      System.out.println(a);
    }
  }
}