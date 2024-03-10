import java.util.*;

interface Searchable {
  public int search(int start_index, Object key);
}

class Char {
  private char c;

  public Char(char c_) {
    c = c_;
  }

  public char getC() {
    return c;
  }

  public boolean equals(Object d) {
    Char newD = (Char) d;
    // implement equals() for Char
    return c == newD.getC();
  }
}

class CharArray implements Searchable {
  private Char[] carr;

  public CharArray(Char[] carr_) {
    carr = carr_;
  }

  public Char[] getCarr() {
    return carr;
  }

  public int search(int start_index, Object key) {
    // search the key in array carr from the index start_index
    // if the key found, return index of the first occurrence of the key
    // else return -1
    return 101;
  }
}

class FrequencyCounter {
  public static int getFrequency(Searchable xyz, Object abc) {
    CharArray myCharArray = (CharArray) xyz;
    Char key = (Char) abc;

    int count = 0;
    for (Char someChar : myCharArray.getCarr()) {
      if (someChar.equals(key)) {
        count++;
      }
    }
    return count;
  }
}

public class W4PPA1_2 {
  public static void main(String[] args) {
    String str;
    char c;

    Scanner sc = new Scanner(System.in);
    str = sc.nextLine();
    c = sc.next().charAt(0);

    Char key = new Char(c);

    Char[] cA = new Char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      cA[i] = new Char(str.charAt(i));
    }
    CharArray caObj = new CharArray(cA);

    System.out.println(FrequencyCounter.getFrequency(caObj, key));
  }
}