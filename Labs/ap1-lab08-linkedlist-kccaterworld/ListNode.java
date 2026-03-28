public class ListNode{
  private String data;
  private ListNode next, prev;

  public ListNode(String d){ //default next/prev should be null
    data = d;
  }
  
  public String toString(){ return data; } // Return the string of the data
  
  public String getData(){ return data; } // Return the data
  
  public ListNode next(){ return next; } // Return the next node
  
  public ListNode prev(){ return prev; } // Return the previous node
  
  public String setData(String newdata){
    String orig = data;
    data = newdata;
    return orig;
  }
  
  public void setNext(ListNode n){ next = n; }
  
  public void setPrev(ListNode n){ prev = n; } 

}
