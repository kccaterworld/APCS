## Directions

* In Sorts.java. You must implement the 3 sorting algortihms that we learned in class. Please do not change the method signatures:

```
  public static void bubbleSort(int[] data) { }

  public static void selectionSort(int[] data)  { }

  public static void insertionSort(int[] data)  { }
```

* The methods in Sorts.java should be static and void.

* Your methods must not produce any output when they finish. Although using print statements during debugging is fine, they should be completely removed in your final submission.

* In Driver.java, you must generate random arrays that will be passed as arguments to your sorting methods. Write the method:

`public static int[] getRandomArray(int size) { }`

This method should create and return an integer array of the specified size, filled with random values.

Use Math.random() or the Random class to generate the numbers.

Start by testing with a small range (–10 to 10), and once it works, expand the range to –5000 to 5000.

* If you want to reuse the same random array for all sorting algoritms you must generate copies of your array (Arrays.copyOf() or Objects.clone()).
  
* Do not use ArrayList.
  
* Once you create an array to test your method, make a copy of it. This allows you to compare the results of your sort with Java’s built-in sort (Arrays.sort(yourArray)), using the original array for your method and the copied array for the built-in method.
