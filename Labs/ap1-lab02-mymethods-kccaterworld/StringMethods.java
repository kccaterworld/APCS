public class StringMethods{
  public static int myIndexOf(String s, String target){
    for(int i = 0; i <= s.length() - target.length(); i++) {
      boolean found = true;
      for(int j = 0; j < target.length(); j++) {  
        if (s.charAt(i + j) != target.charAt(j)) {
            found = false;
            break;
        }
      }
      if (found) {
        return i;
      }
    }
    return -1;
  }
  
  public static int myCompareTo(String s, String other){
    int minLen = s.length();
    if (other.length() < s.length()) minLen = other.length();
    for (int i = 0; i < minLen; i++) {
      if (s.charAt(i) != other.charAt(i)) {
        return s.charAt(i) - other.charAt(i);
      }
    }
    return s.length() - other.length();
  }

public static int parseInt(String s){
    int result = 0;
    boolean isNegative = false;
    int startIndex = 0;
    if (s.charAt(0) == '-') {
      isNegative = true;
      startIndex = 1;
    }
    for(int i = startIndex; i < s.length(); i++) {
      int digit = s.charAt(i) - '0';
      result += digit * Math.pow(10, s.length() - i - 1);
    }
    if (isNegative) {
      result = -result;
    }
    return result;
  }
}
