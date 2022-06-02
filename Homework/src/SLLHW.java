public class SLLHW<E> {
	
	public static class Node<E>{ // nested class = class 안에 class가 있을 
		
		private E element; //Alice, Bob, ...
		private Node<E> next; //Next node
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
		public E getElement() {return element;}
		public Node<E> getNext() {return next;}
		public void setNext(Node<E> n) {next=n;}
		} //nested class
		
		private Node<E> head = null;
		private Node<E> tail = null;
		private int size = 0; //number of nodes
		
		public SLLHW() {} //Constructor
		
		//instance method - access method
		
		public int size() {return size;}
		public boolean isEmpty() {return size ==0;}
		public E first() {
			if(isEmpty()) return null;
			return head.getElement();
		}
		public E last() {
			if(isEmpty()) return null;
			return tail.getElement();
		}
		
		//instance methods - manipulate methods
		
		public void addFirst(E e) {
			head = new Node<>(e, head);
			if(isEmpty()) tail = head;
			size++;
		}
		
		public void addLast(E e) {
			Node<E> newest = new Node<>(e, null);
			if(isEmpty()) head = newest;
			else tail.setNext(newest);
			tail = newest;
			size++;
		}
		
		public E removeFirst() {
			if(isEmpty()) return null;
			E e = head.element;
			head = head.next;
			size--;
			if(isEmpty()) tail = null;
			return e;
		}
		
		public E removeLast() {
			if(isEmpty()) return null; //size == 0 
			if(size==1) { //size == 1
				E e = head.element;
				removeFirst();
				return e; 
			}
			Node<E> walk = head;
			while(walk.next != tail) {
				walk = walk.next;
			}
			E e = tail.element;
			tail = walk;
			size --;
			return e;
		}
		
		public void traverse( ) {
			if(isEmpty()) return;
			Node<E> walk = head;
			while(walk != null) {
				System.out.println(walk.element);
				walk = walk.next;
			}
		}
	}
	

