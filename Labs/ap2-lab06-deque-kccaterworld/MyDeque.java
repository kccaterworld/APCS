import java.util.*;

@SuppressWarnings("unchecked")

public class MyDeque<E> {
    // Instance variables
    private E[] data;
    private int size = 10;
    private int start, end;

    // Constructors
    public MyDeque() { this(0); }

    public MyDeque(int initialCapacity) { data = (E[])new Object[initialCapacity];
        size = 0; start = 0; end = 0; }
        
    public MyDeque(E[] array, int startIndex, int endIndex) {
        this(array.length);
        data = array; start = startIndex; end = endIndex + 1; size=( (endIndex + 1 >= startIndex) ? (endIndex+1)-startIndex : (endIndex + array.length + 1)- startIndex );
    }

    // Add a new value on the indicated side
    public void addFirst(E element) {
        if (element == null) throw new NullPointerException("Element cannot be null");
        if ((size >= data.length) || (data.length) == 0) resize();
        if (size == 0) data[start] = element;
        else { start = (start - 1 + data.length) % data.length;
            data[start] = element; }
        size++;
    }
    public void addLast(E element) {
        if (element == null) throw new NullPointerException("Element cannot be null");
        if ((size >= data.length) || (data.length) == 0) resize();
        if (size == 0) data[end] = element;
        else { end = (end + 1) % data.length;
            data[end] = element; }
        size++;
    }

    // Remove and return the element
    public E removeFirst() {
        if (size == 0) throw new NoSuchElementException("Size is 0");
        E temp = data[start]; data[start] = null;
        if (size == 1) { size = 0; start = 0; end = 0;}
        else { start = (start + 1) % data.length; size--; }
        return temp;
    }
    public E removeLast() {
        if (size == 0) throw new NoSuchElementException("Size is 0");
        E temp = data[end]; data[end] = null;
        if (size == 1) { size = 0; start = 0; end = 0; }
        else { end = (end - 1 + data.length) % data.length; size--; }
        return temp;
    }

    // Return the element. Do not delete elements.
    public E getFirst() { if (size == 0) throw new NoSuchElementException("Size is 0"); else return data[start]; }
    public E getLast() { if (size == 0) throw new NoSuchElementException("Size is 0"); else return data[end]; }

    // Return deque size
    public int size() { return size; }

    // Getters

    // Return data
    public E[] getData() { return data; }
    // Return start
    public int getStart() { if (size == 0) throw new NoSuchElementException("Size is 0"); else return start; }
    // Return end
    public int getEnd() { if (size == 0) throw new NoSuchElementException("Size is 0"); else return end; }

    // Resize the array. Double its length (data.length * 2)
    private void resize() {
        E[] tempNew = (E[])new Object[data.length * 2 + ((data.length == 0) ? 1 : 0)];
        for (int i = 0; i < size; i++) tempNew[i] = data[(start + i) % data.length];
        data = tempNew; start = 0; end = (size == 0) ? 0 : size - 1;
    }

    // Return the deque as string in the correct order
    // Ex.:  "[hello, my, dear, friends!]" where hello is the value at start index
    // and friends! is the value at end index
    public String toString() { String returny = "";
        for (int i = 0; i < size; i++) returny += data[(start + i) % data.length] + ", ";
        return "[" + ((size == 0) ? "" : returny.substring(0, returny.length() - 2)) + "]"; }
}
