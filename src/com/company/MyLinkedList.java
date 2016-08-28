package com.company;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{

	private Node<T> head;
	private int size = 0;

	public int getSize() {
		return size;
	}

	public boolean remove(int index) {
		//to-do

		if (index == 0) {
			head = head.getNext();
		}
		else {
			Node<T> priorNode = head;
			Node<T> currentNode = head;

			for (int i = 0; i < index; i++) {
				priorNode = currentNode;
				currentNode = currentNode.getNext();
			}
			if (currentNode.getNext() == null) {
				priorNode.setNext(null);
			} else {
				priorNode.setNext(currentNode.getNext());
			}
		}

		size--;
		return true;
	}

	public T get(int index) {
		//to-do
		Node<T> currentNode = head;

		while (currentNode.getNext() == null) {
			currentNode = currentNode.getNext();
		}
		return currentNode.getData();
	}

	public void add(T obj) {
		//to-do

		if (size == 0) {
			head = new Node<T>(obj, null);

		}
		else {
			Node<T> currentNode = head;
			for (int i = 0; i < size; i++) {
				if (currentNode.getNext() != null) {
					currentNode = currentNode.getNext();
				} else {
					currentNode.setNext(new Node<T>(obj, null));
				}
			}
		}

		size++;
	}

	//The methods below are bonus

	public void add(int index, T obj){
		//to-do
		size++;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<T>(head);
	}

	private class MyIterator<T> implements Iterator<T> {

		private Node<T> node;

		public MyIterator(Node<T> node) {
			//to-do
		}
		@Override
		public boolean hasNext() {
			//to-do
			return false;
		}

		@Override
		public T next() {
			//to-do
			return null;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

	}
}
