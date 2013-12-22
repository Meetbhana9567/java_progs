package linklist;

import structure.*;

public class list { 
  public node head;
  public node tail;
  
  public list() { 
  head=null;
  tail=null;
  }
  
  public void insert_end(int value) { 
  //first node...
  node temp = null;
  
  temp = new node(value);
  
  if(head == null) { 
  head = temp;
  tail = temp;
  return;
  }
  
  tail.next = temp;
  tail=temp;
  return;
  }
  
  public void insert_beg(int value) { 
  //first node
  node temp = new node(value);
  
  if(head==null) { 
  head=temp;
  tail=temp;
  return;
  }
  
  temp.next=head;
  head=temp;
  return;
  }
  
  public void display() { 
  node curr = head;
  
  if(curr == null) { 
  System.out.println("List is empty!");
  return;
  }
  
  System.out.print("The list elements are : ");
  
  while(curr!=null) { 
  System.out.print(curr.data + "  ");
  curr = curr.next;
  }
  System.out.println();
  }
  
}
