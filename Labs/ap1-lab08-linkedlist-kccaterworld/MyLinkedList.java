public class MyLinkedList {
  private int size;
  private ListNode front,back;

  //You will only write the no argument Constructor, as you do not have a capacity.
  public MyLinkedList(){ }
  
  public int size(){ return size; }

  public String get(int index) {
    int i = 0;
    ListNode current = front;
    while ( current.next() != null && i < index){
      current = current.next();
      i++;
    }
    return current.getData();
  }
  
  public boolean add(String e) {
    ListNode added = new ListNode(e);
    if (back == null) {
      front = added;
      back = added;
    } else {
      added.setPrev(back);
      back.setNext(added);
      back = added;
    }
    size++;
    return true;
  }

  public String toString() {
    String returny = "[";
    ListNode current = front;
    while (current != back) {
      returny += "" + current + ", ";
      current = current.next();
    }
    returny += back + "]";
    return returny;
  }

  public String toStringReversed() {
    String returny = "[";
    ListNode current = back;
    while (current != front) {
      returny += "" + current + ", ";
      current = current.prev();
    }
    returny += front + "]";
    return returny;
  }
  
   public void add(int index, String element) {
    if (index == 0) {
      ListNode added = new ListNode(element);
      added.setNext(front);
      if (front != null) front.setPrev(added);
      front = added;
      if (back == null) back = added;
      size++;
      return;
    }
    ListNode current = front;
    int i = 0;
    while (current != null && i < index - 1) { current = current.next(); i++; }
    ListNode added = new ListNode(element);
    added.setNext(current.next());
    added.setPrev(current);
    if (current.next() != null) current.next().setPrev(added);
    else back = added;
    current.setNext(added);
    size++;
  }
  
   public String set(int index, String value) {
    String orig = get(index);
    ListNode current = front;
    int i = 0;
    while (current != null && i < index) { current = current.next(); i++; }
    return current.setData(value);
  } 
  
  public boolean contains(String element) {
    ListNode current = front;
    while (current != null) {
      if (current.getData().equals(element)) return true;
      current = current.next();
    }
    return false;
  }
  
  public String remove(int index) {
    String orig = get(index);
    ListNode current = front;
    int i = 0;
    while (current != null && i < index) { current = current.next(); i++; }
    if (current.prev() != null) current.prev().setNext(current.next());
    else front = current.next();
    if (current.next() != null) current.next().setPrev(current.prev());
    else back = current.prev();
    size--;
    return orig;
  }
  
  public boolean remove(String element) {
    ListNode current = front;
    int i = 0;
    while (current != null && !(get(i).equals(element))) { current = current.next(); i++; }
    try {
      remove(i);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
