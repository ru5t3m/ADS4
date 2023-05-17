package com.company;

import java.util.LinkedList;

public class HashTable<K, V> {
    private LinkedList<HashNode<K, V>>[] chain;
    private int M = 11;
    private int size;
    public HashTable() {
        size = 0;
        chain = new LinkedList[M];
    }


}
