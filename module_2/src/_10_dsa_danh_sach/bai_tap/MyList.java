package _10_dsa_danh_sach.bai_tap;


import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        element = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public void ensureCapacity(int minCapacity) {
        if (size() >= 0) {
            int newSize = element.length + minCapacity;
            element = Arrays.copyOf(element, newSize);
        }
    }

    public boolean add(E e) {
        if (size() == element.length) {
            ensureCapacity(5);
        }
        element[size++] = e;
        return true;
    }


    public void add(int index, E e) {
        for (int i = size - 1; i >= index; i--) {
            element[i + 1] = element[i];
        }
        element[index] = e;
        size++;
    }

    public E get(int index) {
        return (E) element[index];
    }

    public E clone() {
        Object[] eMyList = new Object[DEFAULT_CAPACITY];
        if (size() == element.length) {
            ensureCapacity(5);
        }
        for (int i = 0; i < size(); i++) {
            eMyList[i] = element[i];
        }
        return (E) Arrays.toString(eMyList);
    }

    public E remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        } else {
            for (int i = index; i <= size() - 1; i++) {
                element[i] = element[i + 1];
            }
            element[size() - 1] = null;
            size--;
        }
        return (E) element;
    }
    public void clear() {
        element = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public int indexOf(E e) {
        for (int i = 0; i < size(); i++) {
            if (e.equals(element[i])) {
                return i;
            }
        }
        return -1;
    }
    public boolean contain(E e) {
        if (indexOf(e) != -1) {
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", element=" + Arrays.toString(element) +
                '}';
    }
}
