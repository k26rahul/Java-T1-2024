import java.util.*;

interface Searchable {
  public int search(int start_index, Object key);
}

// c = q,w,e,..
// carr = [Char.c, Char.c, Char.c, Char.c, Char.c, Char.c, Char.c]

class Char {
  private char data;

  public Char(char data) {
    this.data = data;
  }

  public char getData() {
    return data;
  }

  public boolean equals(Char compareToWhat) {
    // implement equals() for Char
    return data == compareToWhat.getData();
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
  public static int getFrequency(CharArray myCharArray, Char key) {
    int count = 0;

    for (Char someChar : myCharArray.getCarr()) {
      if (someChar.equals(key)) {
        count++;
      }
    }

    return count;
  }
}

public class W4PPA1 {

  public static void main(String[] args) {
    String str;
    char c;

    Scanner sc = new Scanner(System.in);
    str = sc.nextLine(); // i can write java program
    c = sc.next().charAt(0); // a

    Char key = new Char(c); // a

    Char[] cA = new Char[str.length()]; // 15 length [i, c, a, n, " ", w, r...]
    for (int i = 0; i < str.length(); i++) {
      cA[i] = new Char(str.charAt(i));
    }

    CharArray caObj = new CharArray(cA); // new CharArray([i, c, a, n, " ", w, r...])
    System.out.println(FrequencyCounter.getFrequency(caObj, key)); // getFrequency([i, c, a, n, " ", w, r...], 'a')
  }

  // public static void main(String[] args) {
  // // Char[] myCharArray = new Char[6];
  // // myCharArray[0] = new Char('S');
  // // myCharArray[1] = new Char('A');
  // // myCharArray[2] = new Char('N');
  // // myCharArray[3] = new Char('I');
  // // myCharArray[4] = new Char('K');
  // // myCharArray[5] = new Char('A');

  // // Char key = new Char('K');

  // // int count = 0;
  // // for (Char someChar : myCharArray) {
  // // if (someChar.equals(key)) {
  // // count++;
  // // }
  // // }

  // // System.out.println(count);

  // // Char j = new Char('j');
  // // Char k = new Char('k');
  // // Char l = new Char('l');
  // // Char kk = new Char('k');
  // // System.out.println(k.getData());
  // // System.out.println(kk.getData());
  // // System.out.println(k.getData() == kk.getData());
  // // System.out.println(k.equals(j)); // true/false
  // // k == kk
  // }
}

/*
 * 'a': myChar Char.c = 'a';
 * [myChar1, myChar2, myChar3, ...]
 */

// [q,q,w,e,r,t,y,q]
// q?

// q==q +1
// q==q +1
// q==w 0
// q==e 0
// .
// .
// .
// 4