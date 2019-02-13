package com.elanlum.Algorithms;

import lombok.Getter;
import lombok.Setter;

public class MyList<T> {
  Node head;

  public void addElement(T value){
    Node nextElement = new Node(value);
   if(head == null){
     head.setReference(nextElement);
   }
    Node previous = head.getReference();
   previous.setReference(nextElement);
  }
}

@Getter
@Setter
class Node<T>{
  T value;
  Node reference;

  public Node(T value) {
    this.value = value;
  }
}
