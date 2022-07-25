package org.example;

import java.util.NoSuchElementException;

public class Iter {
    String[] arr;
    int index;
    boolean flag;

    public Iter(String... str) {
        this.arr = str;
        this.index = 0;
        this.flag = false;
    }

    public boolean hasNext() {
        if (index < arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public String next() throws NoSuchElementException {
        if (index <= arr.length - 1) {
            flag = true;
            index++;
            return arr[index - 1];
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        if (flag) {
            flag = false;
            arr[index] = null;
        } else {
            throw new IllegalStateException();
        }
    }

    public void print() {
        for (String elem : arr) {
            System.out.println(elem);
        }
    }
    public String getElem(int i){
        return arr[i];
    }
}
