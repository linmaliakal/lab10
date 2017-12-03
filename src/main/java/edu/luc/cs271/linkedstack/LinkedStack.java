package edu.luc.cs271.linkedstack;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  @Override
  public E push(final E obj) {
    // DONE
    top = new Node<>(obj, top);
    return obj;
  }

  @Override
  public E peek() {
    // DONE
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      return top.data;
    }
  }

  @Override
  public E pop() {
    // DONE
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      E result = top.data;
      top = top.next;
      return result;
    }
  }

  @Override
  public boolean isEmpty() {
    // DONE
    return top == null;
  }

  @Override
  public List<E> asList() {
    final ArrayList<E> result = new ArrayList<>();
    populateList(top, result); // DONE replace null with the right reference
    return result;
  }

  private void populateList(final Node<E> curr, final List<E> result) {
    // DONE recursively populate the list in the desired order
    if (curr == null) {
      return;
    } else {
      result.add(curr.data);
      populateList(curr.next, result);
    }
  }

  @Override
  public List<E> asFifoList() {
    final ArrayList<E> result = new ArrayList<>();
    populateFifoList(top, result); // DONE replace null with the right reference
    return result;
  }

  private void populateFifoList(final Node<E> curr, final List<E> result) {
    // DONE recursively populate the list in the desired order
    if (curr == null) {
      return;
    } else {
      result.add(0, curr.data);
      populateFifoList(curr.next, result);
    }
  }
}
