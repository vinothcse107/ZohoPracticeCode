package x.saveProgram;

public class InvalidNameException extends Exception {
      public InvalidNameException() {
      }

      public InvalidNameException(String error) {
            super("Invalid Student Name Exception");
      }
}
