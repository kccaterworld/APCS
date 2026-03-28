import java.util.ArrayList;
import java.util.Arrays;

public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() { super(0); }
  public NoNullArrayList(int capacity) { super(capacity); }
  
  @Override
  public boolean add(T item) {
     if (item == null) throw new IllegalArgumentException("Value cannot be null");
     return super.add(item);
  }
  public void add(int i, T item) {
     if (item == null) throw new IllegalArgumentException("Value cannot be null");
     super.add(i, item);
  } 
  @Override
  public T set(int i, T item) {
     if (item == null) throw new IllegalArgumentException("Value cannot be null");
     return super.set(i, item);
  }
}
