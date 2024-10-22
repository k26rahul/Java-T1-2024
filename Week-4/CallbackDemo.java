// Interface defining the callback method
interface Callback {
  void onComplete(String result);
}

// Class that performs some asynchronous operation and calls back when complete
class AsynchronousTask {
  void executeEngineStart(Callback callback) {
    // Simulate some asynchronous operation
    Thread myThread = new Thread(() -> {
      // Simulate some time-consuming task
      try {
        Thread.sleep(5000); // Simulate a delay of 1 seconds
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      // Callback with the result
      callback.onComplete("Task completed [result payload]");
    });

    myThread.start();
  }
}

public class CallbackDemo {
  public static void main(String[] args) {

    AsynchronousTask task = new AsynchronousTask();

    // // Define a callback implementation
    // Callback callback = new Callback() {
    // @Override
    // public void onComplete(String result) {
    // System.out.println("Callback received: " + result);
    // }
    // };

    // Define a callback using lambda expression
    Callback callback = result -> System.out.println("Callback received: " + result);

    // Execute the task with the defined callback
    task.executeEngineStart(callback);

    // Other operations can continue while the task is executing asynchronously
    System.out.println("Main thread continues to do other tasks...");
    System.out.println("Waiting for executeEngineStart to finish (5 secs)");
  }
}