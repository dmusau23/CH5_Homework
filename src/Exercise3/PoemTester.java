/**Class: PoemTester
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: April 12, 2024
 *
 * This class is a tester of the poem class.
 * We create three objects and print them into a file
 */
package Exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//
public class PoemTester {
    public static void main(String[] args) {

        //read the file
        try (BufferedReader br = new BufferedReader(new FileReader("src/Exercise3/poem2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String name = line.trim();
                String poet = br.readLine().trim();

                // Create a Poem object for each name/poet pair
                Poem poem = new Poem();
                poem.setName(name);
                poem.setPoet(poet);

                // Print the poem information to the console
                System.out.println(poem);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
