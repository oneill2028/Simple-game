import java.util.*;
import java.io.*;

public class Main {
  public static void encode(String[] data, int shift, String fileName) {
    // File writer = new File(fileName);
    // PrintWriter write = new PrintWriter(fileName);
    System.out.println("Encoded message: "+fileName);
    try (PrintWriter write = new PrintWriter(fileName)) {
      //write.println("hello");
      String single_string;
      for (int ind = 0; ind < data.length; ind++)
      {
      single_string =data[ind];
      if (shift > single_string.length()) {
        for (int i = 0; i < single_string.length(); i++) {
          write.print(single_string.charAt(ind));
        }
      } else if (single_string.length() == 0) {
        System.out.println("Array is empty");
      } else if (shift < single_string.length()) {
        for (int i = 0; i < single_string.length(); i++) {
          int realShift = (i+shift) % single_string.length();
          write.print(single_string.charAt(realShift));
        }
      } else {
        System.out.println("Invalid input.");
      }
      
    }
    write.close();

    } catch (IOException e) {
      System.err.println("Error writing to file: " + e.getMessage());
    }
  
  }

  public static void main(String[] args) {
    String[] data = {"Suzy is weird", "fart"};
    encode(data, 2, "results.txt");
  }
}
