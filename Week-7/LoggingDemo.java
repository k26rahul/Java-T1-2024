import java.util.logging.Logger;
import java.util.logging.Level;

public class LoggingDemo {
  // Global logger
  private static final Logger globalLogger = Logger.getGlobal();

  // Custom logger
  private static final Logger customLogger = Logger.getLogger("myFavoriteLogger");

  public static void main(String[] args) {
    globalLogger.info("Global logger information message.");
    customLogger.info("Custom logger information message.");

    // Setting log levels
    globalLogger.setLevel(Level.WARNING);
    globalLogger
        .info("This message will not be logged because the logging level is set to WARNING.");
    globalLogger.warning("This is a warning message.");

    // Turning logging on and off
    Logger.getGlobal().setLevel(Level.OFF);
    globalLogger.severe("This message will not be logged because logging is turned off.");
  }
}
