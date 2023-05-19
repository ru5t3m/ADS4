package com.company;

public class HashNode<K, V> {
    private K key;
    private V value;
    private HashNode<K, V> next;


    public HashNode(K key, V value){
        this.key = key;
        this.value = value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

}
