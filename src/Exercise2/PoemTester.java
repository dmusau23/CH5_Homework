/**Class: PoemTester
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: April 12, 2024
 *
 * This class is a tester of the poem class.
 * We create three objects and print them into a file
 */
package Exercise2;
//
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//
public class PoemTester {
    public static void main(String[] args) {
        //variables declaration and initialization
        Poem p1 = new Poem();
        Poem p2 = new Poem();
        Poem p3 = new Poem();

        p1.setName("Love in the horizon");
        p1.setPoet("Descartes");

        p2.setName("Blues");
        p2.setPoet("Daniel Musau");

        p3.setName("Call me at dusk");
        p3.setPoet("Carl Xiawn");

        try(PrintWriter pw = new PrintWriter("src/Exercise2/poems.txt")){
            pw.println(p1.getName());
            pw.println(p1.getPoet());
            pw.println(p2.getName());
            pw.println(p2.getPoet());
            pw.println(p3.getName());
            pw.println(p3.getPoet());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
