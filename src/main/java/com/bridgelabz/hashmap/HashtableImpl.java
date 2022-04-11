package com.bridgelabz.hashmap;

public class HashtableImpl<T1, T2> {
	  MyMapNode head;
	    MyMapNode tail;

	    public void add(T1 key, T2 value) {
	        MyMapNode<T1, T2> myNode = (MyMapNode<T1, T2>) searchNode(key);
	        if(myNode == null) {
	            myNode = new MyMapNode<T1, T2>(key , value);
	            this.append(myNode);
	        }
	        else {
	            myNode.setValue(value);
	        }
	    }

	    public void append(MyMapNode<T1, T2> myNode) {
	        if(this.head == null)
	            this.head = myNode;
	        if(this.tail == null)
	            this.tail = myNode;
	        else {
	            this.tail.setNext(myNode);
	            this.tail = myNode;
	        }
	    }

	    public MyMapNode<T1, T2> searchNode(T1 data) {
	        MyMapNode currentNode = head;
	        int position = 0;
	        while (currentNode != null) {
	            position++;
	            if (currentNode.getKey().equals(data)) {
	                return currentNode;
	            }
	            currentNode = currentNode.getNext();
	        }
	        return currentNode;
	    }

	    public T2 get(T1 word) {
	        MyMapNode<T1, T2> myMapNode = searchNode(word);
	        return (myMapNode == null) ? null : myMapNode.getValue();
	    }

	    @Override
	    public String toString() {
	        return "Linked List Nodes { " + head + " }";
	    }

	    public void printNodes() {
	        System.out.println("My nodes: " + head);
	    }

		public void remove(String string) {
			// TODO Auto-generated method stub
			
		}
	}


