package testdatastructures;

public class  prob3_LinkedList<E> extends MyAbstractList<E> {
  private Node<E> head, tail;
  private int size = 0; // Number of elements in the list
  
  //Create an empty list
  public  prob3_LinkedList() {
  }

  // Create a list from an array of objects
  public  prob3_LinkedList(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      add(objects[i]); 
  }

  @Override /** Add a new element at the specified index 
   * in this list. The index of the head element is 0 */
  public void add(int index, E e) {
    if (index == 0) {
      addFirst(e);
    }
    else if (index >= size) {
      addLast(e);
    }
    else {
      Node<E> current = head;
      for (int i = 1; i < index; i++) {
        current = current.next;
      }
      Node<E> temp = current.next;
      current.next = new Node<>(e);
      (current.next).next = temp;
      
      size++;
    }
  }
  
  //Add an element to the beginning of the list
  public void addFirst(E e) {
    Node<E> newNode = new Node<>(e); // Create a new node
    newNode.next = head; // link the new node with the head
    head = newNode; // head points to the new node
    size++; // Increase list size

    if (tail == null) // the new node is the only node in list
      tail = head;
  }

  //Add an element to the end of the list
  public void addLast(E e) {
    Node<E> newNode = new Node<>(e); // Create a new for element e

    if (tail == null) {
      head = tail = newNode; // The new node is the only node in list
    }
    else {
      tail.next = newNode; // Link the new with the last node
      tail = newNode; // tail now points to the last node
    }

    size++; // Increase size
  }

  @Override /** Remove the element at the specified position in this 
   *  list. Return the element that was removed from the list. */
  public E remove(int index) {
    if (index < 0 || index >= size) {
      return null;
    }
    else if (index == 0) {
      return removeFirst();
    }
    else if (index == size - 1) {
      return removeLast();
    }
    else {
      Node<E> previous = head;
      for (int i = 1; i < index; i++) {
        previous = previous.next;
      }
      Node<E> current = previous.next;
      previous.next = current.next;
      size--;
      return current.element;
    }
  }

  /** Remove the head node and
   *  return the object that is contained in the removed node. */
  public E removeFirst() {
    if (size == 0) {
      return null;
    }
    else {
      E temp = head.element;
      head = head.next;
      size--;
      if (head == null) {
        tail = null;
      }
      return temp;
    }
  }

  /** Remove the last node and
   * return the object that is contained in the removed node. */
    public E removeLast() {
        if (size == 0) {
            return null;
        }else if (size == 1) {
            E temp = head.element;
            head = tail = null;
            size = 0;
            return temp;
        }else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }
            E temp = tail.element;
            tail = current;
            tail.next = null;
            size--;
            return temp;
        }
    }
    public int count (Node head,E key){
        int cnt = 0;
        Node temp = head;
        if(head == null){
            return cnt;
        }else{
            if(temp.element == key)
                cnt++;
            count(temp.next,key);
        }
        return cnt;
    }
}
  
  class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
      this.element = element;
    }
  }