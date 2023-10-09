// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Press Alt+Enter with your caret at the highlighted text to see how
// IntelliJ IDEA suggests fixing it.
// Press Shift+F10 or click the green arrow button in the gutter to run the code.
// Press Shift+F9 to start debugging your code. We have set one breakpoint
// for you, but you can always add more by pressing Ctrl+F8.

import x.saveProgram.*;
import java.util.*;
import java.util.function.Consumer;

public class Main {
      public static void main(String[] args) {

            MethodCaller();
      }

      public static void MethodCaller() {
            int[] arr1 = { 1, 5, 8, 2, 9 };
            int[] arr2 = { 2, 3, 7, 4, 6, 5, 1 };

            SaveProgram.EvaluateReversePolishNotation();

            // SaveProgram.AddUnique(arr1,arr2);
            // try {
            // Student s = new Student(1,"", Student.cls.II);
            // System.out.println("Student Added");
            // } catch (InvalidNameException e) {
            // System.out.println(e.getMessage());
            // }
            SaveProgram.RotateArrayInJava();
            SaveProgram.ButterFlyPatttern();
      }
}
