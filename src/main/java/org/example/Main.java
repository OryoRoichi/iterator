package org.example;

public class Main {
    public static void main(String[] args) {
        Iter iterator = new Iter("1","2","3","4");
        System.out.println((iterator.hasNext()));
        System.out.println(iterator.next());
        iterator.remove();
        iterator.print();
    }
}