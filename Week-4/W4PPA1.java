// import java.util.*;

// interface Searchable {
// public int search(int start_index, Object key);
// }

// class Char {
// private char c;

// public Char(char ch) {
// c = ch;
// }

// public boolean equals(Object d) {
// // implement equals() for Char

// }
// }

// class CharArray implements Searchable {
// private Char[] carr;

// public CharArray(Char[] carr_) {
// carr = carr_;
// }

// public int search(int start_index, Object key) {
// // search the key in array carr from the index start_index
// // if the key found, return index of the first occurrence of the key
// // else return -1
// }
// }

// class FrequencyCounter {
// public static int getFrequency(Searchable ob, Object key) {
// if (ob instanceof CharArray) {
// // count occurrences of the key in ob using search function
// } else
// return 0;
// }
// }

// class FClass {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// String inputString = scanner.nextLine();

// char charToSearch = scanner.next().charAt(0);
// Char key = new Char(charToSearch);

// Char[] chars = new Char[inputString.length()];
// for (int i = 0; i < inputString.length(); i++) {
// chars[i] = new Char(inputString.charAt(i));
// }

// CharArray myCharArray = new CharArray(chars);
// System.out.println(FrequencyCounter.getFrequency(myCharArray, key));
// }
// }