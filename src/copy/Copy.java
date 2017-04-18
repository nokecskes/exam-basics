package copy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Connor on 2017.04.18..
 */
public class Copy {

  public static void main(String[] args) {
    // This should be the basic replica of the 'cp' command
    // If ran from the command line without arguments
    // It should print out the usage:
    // copy [source] [destination]
    // When just one argument is provided print out:
    // No destination provided
    // When both arguments provided and the source is a file
    // Read all contents from it and write it to the destination

    System.out.println("not working");

   /* if(args.length != 1 && args.length != 2) {
      System.out.println("Usage: copy [source] [destination]");
    } else if (args.length == 1) {
      System.out.println("No destination provided");
    } else {
      try{
        Path sourcePath = Paths.get(args[0]);
        List<String> lines = Files.readAllLines(sourcePath);
        Path destinationPath = Paths.get(args[1]);
        Files.write(destinationPath, lines);
      }catch(IOException e) {
        System.out.println("An error occurred, couldn't copy the file.");
      }
    }*/
  }
}
