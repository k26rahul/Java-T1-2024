import java.util.Scanner;

interface Callback {
  public void onComplete();
}

class Voter {
  // Define appropriate variables for implementing singleton behavior
  // in accordance with the given coded parts and sample output
  public static int total_no_of_voters;
  public static int current_voter_count;
  public static Voter new_voter;

  private Voter() {
  }

  public static Voter voterObject;

  public static Voter getVoter() {
    if (new_voter != null) {
      return null;
    }

    // implement singleton behavior
    Voter.current_voter_count++;

    if (Voter.voterObject == null) {
      Voter.voterObject = new Voter();
    }
    new_voter = voterObject;
    return Voter.voterObject;
  }

  public void firstVoter() {
    if (new_voter != null) {
      EVM new_machine = EVM.getEVM(new_voter);
      new_machine.startVoting(() -> {
        System.out.println("Voting completed for voter " + current_voter_count);
        new_voter = null;
        new_voter = Voter.getVoter();
        callNewVoter();
      });
    }
  }

  public void callNewVoter() {
    // Write code to setup a new EVM object for the new voter

    // Ignore the following 6 lines of code
    // but do not delete this code in your submission
    // ========================================================================
    try {
      EVM x = EVM.getEVM(null);
      x.startVoting(() -> {
      });
    } catch (NullPointerException e) {
      System.out.println("EVM is Singleton");
    }
    // ========================================================================
    // Resume writing your code here

    if (current_voter_count > total_no_of_voters) {
      return;
    }

    EVM new_machine = EVM.getEVM(new_voter);
    new_machine.startVoting(() -> {
      System.out.println("Voting completed for voter " + current_voter_count);
      new_voter = null;
      new_voter = Voter.getVoter();
      callNewVoter();
    });

    // Hint: Write code to start voting for the new user on the new EVM
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
    // Implement singleton behaviour

    if (v == null) {
      return null;
    }

    current_voter = v;
    evm_count++;

    if (EVM.evmObject == null) {
      EVM.evmObject = new EVM(v);
    }
    return EVM.evmObject;
  }

  public void startVoting(Callback callback) {
    // Complete voting for the current voter and call the next voter
    // Hint : Use callback here
    System.out.println("voting under process on EVM number " + evm_count);
    callback.onComplete();
  }
}

public class W4PPA2 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    Voter.total_no_of_voters = s.nextInt();

    // Assume input is always non zero
    Voter v = Voter.getVoter();

    // Trying to create another voter when one voter is in the middle of
    // voting process, students can ignore this try-catch block of code

    try {
      Voter x = Voter.getVoter();
      x.callNewVoter();
    } catch (NullPointerException e) {
      System.out.println("Voter is Singleton");
    }

    // Starting the first vote of the day
    v.firstVoter();
  }
}