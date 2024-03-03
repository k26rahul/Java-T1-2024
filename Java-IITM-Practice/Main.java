class Animal {
  String mood = "happy";

  Animal() {
    System.out.println("u just created an Animal");
  }
}

public class Main {

  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    System.out.println(myAnimal.mood);
  }
}