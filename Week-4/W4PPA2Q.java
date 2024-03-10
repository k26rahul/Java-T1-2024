
import java.util.Scanner;

// SAM interface/functional interface
interface Callback {
  public void onComplete();
}

class Voter {
  // Define appropriate variables for implementing singleton behaviour
  // in accordance with the given coded parts and sample output
  public static int total_no_of_voters;
  public static int current_voter_count;
  public static Voter new_voter;

  private Voter() {
    current_voter_count++;
  }

  public static Voter voterObject;

  /*
   * new_voter == null OK -> proceed
   * otherwise, return null (we need NullPointerException)
   */

  // 0 new_voter=null
  // 1 if (new_voter=null) OK new_voter=voterObject
  // 2 if (new_voter=voterObject) NOT OK -> NullPointerException
  public static Voter getVoter() {
    if (new_voter != null) {
      return null;
    }

    // implement singleton behaviour
    if (voterObject == null) {
      voterObject = new Voter();
    }
    new_voter = voterObject;
    return voterObject;
  }

  public void firstVoter() {
    if (new_voter != null) {
      EVM new_machine = EVM.getEVM(new_voter);
      new_machine.startVoting(() -> {
        System.out.println("Voting completed for voter " + current_voter_count);
        current_voter_count++;
        callNewVoter();
      });
    }
  }

  public void callNewVoter() {
    // Write code to setup a new EVM object for the new voter
    EVM new_machine = EVM.getEVM(new_voter);

    // Ignore the following 6 lines of code
    // but do not delete this code in your submission
    // ========================================================================
    try {
      EVM x = EVM.getEVM(null);
      x.startVoting(() -> {
      }); // x=null; null.startVoting();
    } catch (NullPointerException e) {
      System.out.println("EVM is Singleton");
    }
    // ========================================================================
    // Resume writing your code here
    if (current_voter_count > total_no_of_voters) {
      return;
    }

    // Hint: Write code to start voting for the new user on the new EVM
    new_machine.startVoting(() -> {
      System.out.println("Voting completed for voter " + current_voter_count);
      current_voter_count++;
      callNewVoter();
    });
  }
}

class EVM {
  // Define appropriate variables for implementing singleton behaviour
  // in accordance with the given coded parts and sample output
  public static Voter current_voter;
  public static int evm_count;

  private EVM(Voter v) {
  }

  public static EVM evmObject;

  public static EVM getEVM(Voter v) {
    if (v == null) {
      return null;
    }

    current_voter = v;
    evm_count++;

    // Implement singleton behaviour
    if (evmObject == null) {
      evmObject = new EVM(v);
    }
    return evmObject;
  }

  public void startVoting(Callback callback) {
    // Complete voting for the current voter and call the next voter
    // Hint : Use callback here
    System.out.println("voting under process on EVM number " + evm_count);
    callback.onComplete();
  }
}

public class W4PPA2Q {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    Voter.total_no_of_voters = s.nextInt();

    // Assume input is always non zero
    Voter v = Voter.getVoter();

    // Trying to create another voter when one voter is in the middle of
    // voting process, students can ignore this try-catch block of code
    try {
      Voter x = Voter.getVoter();
      x.callNewVoter(); // x == null; null.callNewVoter();
    } catch (NullPointerException e) {
      System.out.println("Voter is Singleton");
    }

    // Starting the first vote of the day
    v.firstVoter();
  }
}
