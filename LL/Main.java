class Node {
  int value;
  Node next;

  public Node(int value) {
    this.value = value;
  }
}

class LinkedList {
  Node head;
  Node tail;

  public void insertAtStart(int value) {
    Node newNode = new Node(value);
    if (isEmpty()) {
      head = tail = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;

    // head = 10
    // 10.next = null
    // [10]

    // 20.next = 10
    // head = 20
    // [20, 10]

    // 30.next = 20
    // head = 30
    // [30, 20, 10]
  }

  // learning => reality-check => evidence => confidence

  public void insertAtEnd(int value) {
    Node newNode = new Node(value);
    if (isEmpty()) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    tail = newNode;

    // tail=10
    // 10.next = null

    // 10.next = 20
    // tail=20

    // 20.next = 30
    // tail=30

    // 30.next = 40
    // tail=40
  }

  public void insert(int index, int value) {

  }

  public Node getFirst() {
    return head;
  }

  public Node getLast() {
    return tail;
  }

  public boolean isEmpty() {
    return head == null;
  }
}

public class Main {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.insertAtStart(10); // 10
    list.insertAtStart(20); // 20, 10
    list.insertAtStart(30); // 30, 20, 10

    list.insertAtEnd(5); // 30, 20, 10, 5
    list.insertAtEnd(2); // 30, 20, 10, 5, 2

    // 30, 20, 10, 5, 2
    // ^

    // 30, 20, 10, 5, 2
    // 30.next = 50
    // 50.next = 20

    list.insert(1, 50); // 30, 50, 20, 10, 5, 2

    Node current = list.getFirst();
    while (current != null) {
      System.out.println(current.value);
      current = current.next;
    }

    System.out.println("hello");

    // Node sanika = new Node(95);
    // Node rahul = new Node(75);
    // Node harikesh = new Node(85);
    // Node cmd = new Node(100);

    // sanika.next = rahul;
    // rahul.next = harikesh;
    // harikesh.next = cmd;

    // Node head = sanika;
    // Node tail = cmd;

    // Node current = head;
    // while (current != null) {
    // System.out.println(current.value);
    // current = current.next;
    // }
  }
}