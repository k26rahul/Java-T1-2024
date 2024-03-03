import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class GroupItr implements Iterator<Integer> {
  private int[] groupIds;
  private int pointer = 0;

  GroupItr(int[] groupIds) {
    this.groupIds = groupIds;
  }

  public boolean hasNext() {
    return pointer <= (groupIds.length - 1);
  }

  public Integer next() {
    return groupIds[pointer++];
  }
}

class Group implements Iterable<Integer> {
  public Iterator iterator() {
    return new GroupItr(new int[] { 1990, 1992, 1997 });
  }
}

public class InterfaceDemo3 {

  public static void main(String[] args) {
    Group myGroup = new Group();
    Iterator itr = myGroup.iterator();

    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    // int[] numArray = new int[] { 11, 12, 13, 14 };

    // for (int i = 0; i < numArray.length; i++) {
    // System.out.println(numArray[i]);
    // }

    // for (int x : numArray) {
    // System.out.println(x);
    // }

    // ArrayList<Integer> myArrayList = new ArrayList<>(Arrays.asList(11, 12));

    // for (int x : myArrayList) {
    // System.out.println(x);
    // }
    // Iterator<Integer> itr = myArrayList.iterator();

    // for (int x: itr) {
    // }

    // while (itr.hasNext()) {
    // System.out.println(itr.next());
    // }
  }
}