public class Driver{
 public static void main(String[]args){
  //Variables of the test cases are pre-declared.
  //This allows you to copy/paste the entire test case and just change the variables.
  String a;
  String b;
  String whole;
  String part;
  String number;
  int actual;
  int guess;
  
  //Single test case myCompareTo:
  a="cat";
  b="dog";
  System.out.println("Expected same sign: "+ a.compareTo(b) +" vs my function: "+StringMethods.myCompareTo(a,b)); 
  a="apple";
  b="apple";
  System.out.println("Expected same sign: "+ a.compareTo(b) +" vs my function: "+StringMethods.myCompareTo(a,b));
  a="zebra";
  b="apple";
  System.out.println("Expected same sign: "+ a.compareTo(b) +" vs my function: "+StringMethods.myCompareTo(a,b));
  a="a";
  b="b";
  System.out.println("Expected same sign: "+ a.compareTo(b) +" vs my function: "+StringMethods.myCompareTo(a,b));
  a="short";
  b="longer";
  System.out.println("Expected same sign: "+ a.compareTo(b) +" vs my function: "+StringMethods.myCompareTo(a,b));
  a="short";
  b="shorter";
  System.out.println("Expected same sign: "+ a.compareTo(b) +" vs my function: "+StringMethods.myCompareTo(a,b));
  a="shorter";
  b="short";
  System.out.println("Expected same sign: " + a.compareTo(b) +" vs my function: "+StringMethods.myCompareTo(a,b));
  a="abc";
  b="ab";
  System.out.println("Expected same sign: "+ a.compareTo(b) +" vs my function: "+StringMethods.myCompareTo(a,b));
  a="ABC";
  b="abc";
  System.out.println("Expected same sign: "+ a.compareTo(b) +" vs my function: "+StringMethods.myCompareTo(a,b));
  a="1";
  b="2";
  System.out.println("Expected same sign: "+ a.compareTo(b) +" vs my function: "+StringMethods.myCompareTo(a,b));

  
  //Single test case myIndexOf:
  whole = "Hello";
  part = "He";
  System.out.println("Expected "+ whole.indexOf(part) +" vs my function: "+ StringMethods.myIndexOf(whole,part));
  whole = "Hello";
  part = "lo";
  System.out.println("Expected "+ whole.indexOf(part) +" vs my function: "+ StringMethods.myIndexOf(whole,part));
  whole = "programming";
  part = "gram";
  System.out.println("Expected "+ whole.indexOf(part) +" vs my function: "+ StringMethods.myIndexOf(whole,part));
  whole = "Hello";
  part = "xyz";
  System.out.println("Expected "+ whole.indexOf(part) +" vs my function: "+ StringMethods.myIndexOf(whole,part));
  whole = "Hello";
  part = "l";
  System.out.println("Expected "+ whole.indexOf(part) +" vs my function: "+ StringMethods.myIndexOf(whole,part));
  whole = "cat";
  part = "cat";
  System.out.println("Expected "+ whole.indexOf(part) +" vs my function: "+ StringMethods.myIndexOf(whole,part));
  whole = "aaabaaab";
  part = "aab";
  System.out.println("Expected "+ whole.indexOf(part) +" vs my function: "+ StringMethods.myIndexOf(whole,part));
  whole = "ababab";
  part = "abab";
  System.out.println("Expected "+ whole.indexOf(part) +" vs my function: "+ StringMethods.myIndexOf(whole,part));
  whole = "a";
  part = "a";
  System.out.println("Expected "+ whole.indexOf(part) +" vs my function: "+ StringMethods.myIndexOf(whole,part));
  whole = "abc";
  part = "d";
  System.out.println("Expected "+ whole.indexOf(part) +" vs my function: "+ StringMethods.myIndexOf(whole,part));
  whole = "aaaaaa";
  part = "aaa";
  System.out.println("Expected "+ whole.indexOf(part) +" vs my function: "+ StringMethods.myIndexOf(whole,part));
  whole = "Hello World";
  part = " ";
  System.out.println("Expected "+ whole.indexOf(part) +" vs my function: "+ StringMethods.myIndexOf(whole,part));
  whole = "123456";
  part = "456";
  System.out.println("Expected "+ whole.indexOf(part) +" vs my function: "+ StringMethods.myIndexOf(whole,part));
  whole = "abcdefg";
  part = "xyz";
  System.out.println("Expected "+ whole.indexOf(part) +" vs my function: "+ StringMethods.myIndexOf(whole,part));


  //Single test case parseInt:
  number = "152";
  actual = Integer.parseInt(number);
  guess  = StringMethods.parseInt(number);
  System.out.println("Expected "+ actual +" vs my function: "+ guess+" "+(actual==guess));
  number = "9999";
  actual = Integer.parseInt(number);
  guess  = StringMethods.parseInt(number);
  System.out.println("Expected "+ actual +" vs my function: "+ guess+" "+(actual==guess));
  number = "2147483647";
  actual = Integer.parseInt(number);
  guess  = StringMethods.parseInt(number);
  System.out.println("Expected "+ actual +" vs my function: "+ guess+" "+(actual==guess));
  number = "-2147483647";
  actual = Integer.parseInt(number);
  guess  = StringMethods.parseInt(number);
  System.out.println("Expected "+ actual +" vs my function: "+ guess+" "+(actual==guess));
  number = "0";
  actual = Integer.parseInt(number);
  guess  = StringMethods.parseInt(number);
  System.out.println("Expected "+ actual +" vs my function: "+ guess+" "+(actual==guess));
  number = "1";
  actual = Integer.parseInt(number);
  guess  = StringMethods.parseInt(number);
  System.out.println("Expected "+ actual +" vs my function: "+ guess+" "+(actual==guess));
  number = "-00123";
  actual = Integer.parseInt(number);
  guess  = StringMethods.parseInt(number);
  System.out.println("Expected "+ actual +" vs my function: "+ guess+" "+(actual==guess));
  number = "1000000";
  actual = Integer.parseInt(number);
  guess  = StringMethods.parseInt(number);
  System.out.println("Expected "+ actual +" vs my function: "+ guess+" "+(actual==guess));
  number = "-987654321";
  actual = Integer.parseInt(number);
  guess  = StringMethods.parseInt(number);
  System.out.println("Expected "+ actual +" vs my function: "+ guess+" "+(actual==guess));
 }
}
