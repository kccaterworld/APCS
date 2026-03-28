public class SuperArray {
    private int size;
    private String[] data;
    
    public SuperArray() {
        this(10);
    }
    public SuperArray(int initSize) {
        if (initSize < 0) {
            throw new IllegalArgumentException("Initial size cannot be negative");
        }
        data = new String[initSize];
    }
    
    public int size() {
        return size;
    }
    public String toString() {
        String strung = "{";
        for (int i = 0; i < size; i++) {
            strung += data[i];
            if (i < size - 1) strung += ", ";
        }
        strung += "}";
        return strung;
    }
    private void resize() {
        String[] temp = new String[data.length * 2 + 1];
        for (int i = 0; i < size; i++) temp[i] = data[i];
        data = temp;
    }
    public boolean add(String value) {
        if (data == null) data = new String[10];
        if (size >= data.length) {
            this.resize();
        }
        data[size] = value;
        size++;
        return true;
    }
    public String get(int index) {
        if ((index < 0) || (index >= size)) throw new IndexOutOfBoundsException("Index out of range teehee");
        return data[index];
    }
    public String set(int index, String newVal) {
        if ((index < 0) || (index >= size)) throw new IndexOutOfBoundsException("Index out of range teehee");
        String old = data[index];
        data[index] = newVal;
        return old;
    }
    public String remove(int index) {
        if ((index < 0) || (index >= size)) throw new IndexOutOfBoundsException("Index out of range teehee");
        String old = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        data[size - 1] = null;
        size--;
        return old;
    }
    public boolean remove(String target) {
        for (int i = 0; i < size; i++) {
            if (data[i] == null) {
                if (target == null) {
                    this.remove(i);
                    return true;
                }
            } else {
                if (data[i].equals(target)) {
                    this.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
    public int indexOf(String target) {
        for (int i = 0; i < size; i++) {
            if (data[i] == null && target == null) return i;
            if (data[i] != null && data[i].equals(target)) return i;
        }
        return -1;
    }
    public int lastIndexOf(String target) {
        for (int i = size - 1; i >= 0; i--) {
            if (data[i] == null) {
                if (target == null) return i;
            } else {
                if (data[i].equals(target)) return i;
            }
        }
        return -1;
    }
    public void add(int index,String value) {
        if ((index < 0) || (index >= size)) {
            throw new IndexOutOfBoundsException("Index out of range teehee");
        }
        if (data == null) data = new String[10];
        if (size >= data.length) resize();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
    }
}
