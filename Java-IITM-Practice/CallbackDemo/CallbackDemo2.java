// Interface defining the callback method
interface Callback {
  void onComplete(String result);
}

// Class that performs some asynchronous operation and calls back when complete
class AsynchronousTask {
  void execute(Callback callback) {
    // Simulate some asynchronous operation
    new Thread(() -> {
      // Simulate some time-consuming task
      try {
        Thread.sleep(1000); // Simulate a delay of 1 second
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      // Callback with the result
      callback.onComplete("Task completed [result payload]");
    }).start();
  }
}

public class CallbackDemo2 {
  public static void main(String[] args) {
    AsynchronousTask task = new AsynchronousTask();

    // Define a callback using lambda expression
    Callback callback = result -> System.out.println("Callback received: " + result);

    // Execute the task with the defined callback
    task.execute(callback);

    // Other operations can continue while the task is executing asynchronously
    System.out.println("Main thread continues to execute other tasks...");
  }
}
