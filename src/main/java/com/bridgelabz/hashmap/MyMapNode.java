package com.bridgelabz.hashmap;

public class MyMapNode<T1, T2> {
	T1 key;
    T2 value;
    MyMapNode<T1, T2> next;

    public MyMapNode (T1 key, T2 value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public T1 getKey() {
        return key;
    }

    public void setKey(T1 key) {
        this.key = key;
    }

    public T2 getValue() {
        return this.value;
    }

    public void setValue(T2 value) {
        this.value = value;
    }

    public MyMapNode<T1, T2> getNext() {
        return next;
    }

    public void setNext(MyMapNode<T1, T2> next) {
        this.next = (MyMapNode<T1, T2>) next;
    }

    @Override
    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("Node{" + "T1=").append(key).append(" T2=").append(value).append("}");
        if(next != null)
            nodeString.append("->").append(next);
        return nodeString.toString();
    }
}


