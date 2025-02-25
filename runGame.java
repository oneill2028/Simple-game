import java.util.*;
import java.io.*;

public class runGame {
  public static String pleasure() {
    Scanner in = new Scanner(System.in);
    System.out.print("How are you");
    String response = in.nextLine();
    in.close();
    return response;
  }
}
