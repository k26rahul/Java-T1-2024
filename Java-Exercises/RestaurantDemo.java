/*
 * Write a Java program to create a class called "Restaurant" with attributes
 * for menu items, prices, and ratings, and methods to add and remove items, and
 * to calculate average rating.
 */

/*
index -> HashMap
roti: 11 (loc of MenuItem)
chawal: 12 (loc of MenuItem)
daal: 13 (loc of MenuItem)

11: record (of roti) MenuItem
12: record (of chawal) MenuItem 
13: record (of daal) MenuItem

(MenuItem)
name
price
ratings []
 */

import java.util.ArrayList;
import java.util.HashMap;

class MenuItem {
  private String name;
  private double price;
  private ArrayList<Double> ratings = new ArrayList<>();

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public ArrayList<Double> getRatings() {
    return ratings;
  }

  public void addRating(double rating) {
    ratings.add(rating);
  }

  public MenuItem(String name, double price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString() {
    return name + " " + price + " " + ratings;
  }
}

class Restaurant {
  HashMap<String, MenuItem> menuItemMap = new HashMap<>();

  public MenuItem getItem(String name) {
    return menuItemMap.get(name);
  }

  public void addItem(String name, double price) {
    MenuItem menuItem = new MenuItem(name, price);
    menuItemMap.put(name, menuItem);
  }

  public void removeItem(String name) {
    menuItemMap.remove(name);
  }

  public double getPrice(String name) {
    return getItem(name).getPrice();
  }

  public void addRating(String name, double rating) {
    getItem(name).addRating(rating);
  }

  public double getAvgRating(String name) {
    double sum = 0;
    int count = 0;
    for (double x : getItem(name).getRatings()) {
      sum += x;
      count++;
    }
    return sum / count;
  }
}

/**
 * Main
 */
public class RestaurantDemo {
  public static void main(String[] args) {
    Restaurant myRestaurant = new Restaurant();
    myRestaurant.addItem("Roti", 20);
    myRestaurant.addItem("Daal", 50);
    myRestaurant.addItem("Chawal", 100);

    System.out.println(myRestaurant.getPrice("Roti"));

    myRestaurant.addRating("Roti", 5);
    myRestaurant.addRating("Roti", 4);
    System.out.println(myRestaurant.getAvgRating("Roti"));

    System.out.println(myRestaurant.menuItemMap);
  }
}