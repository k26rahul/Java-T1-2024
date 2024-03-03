// Interface defining the behavior of a printable item
interface Printable {
  void print();
}

// Class representing a Book that implements the Printable interface
class Book implements Printable {
  private String title;

  public Book(String title) {
    this.title = title;
  }

  @Override
  public void print() {
    System.out.println("Printing book: " + title);
  }
}

// Class representing a Document that implements the Printable interface
class Document implements Printable {
  private String content;

  public Document(String content) {
    this.content = content;
  }

  @Override
  public void print() {
    System.out.println("Printing document: " + content);
  }
}

public class SubtypingDemo {
  public static void main(String[] args) {
    Printable book = new Book("Java Programming");
    Printable document = new Document("Important Document");

    // Both book and document can be treated as Printable
    printItem(book);
    printItem(document);
  }

  // A method accepting any Printable item
  static void printItem(Printable printable) {
    printable.print();
  }
}
