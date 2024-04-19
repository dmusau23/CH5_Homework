/**Class: Reader
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: April 12, 2024
 *
 * In this class we take the data from the Book1.csv
 * and compute the sum, average; find lowest/highest
 * and then print the results in stats.txt
 */

package Exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//
public class Reader {
    public static void main(String[] args) {

            // variables declaration and initialization
            String line;
            int sum = 0;
            int lowest = Integer.MAX_VALUE;
            int highest = Integer.MIN_VALUE;
            int count = 0;

            try (BufferedReader br = new BufferedReader(new FileReader("src/Exercise1/Book1.csv"))) {
                while ((line = br.readLine()) != null) {
                    //Store the data coming from the file into an array
                    String[] numbers = line.split(",");

                    //Traverse the array to find the sum, lowest number and highest number
                    for (String numberStr : numbers) {
                        int number = Integer.parseInt(numberStr);
                        sum += number;
                        count++;
                        if (number < lowest) {
                            lowest = number;
                        }
                        if (number > highest) {
                            highest = number;
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            double average = (double) sum / count; //calculate the average

            // Create and Write all our data into a file named stats.txt
            try (FileWriter writer = new FileWriter("src/Exercise1/stats.txt")) {
                writer.write("The sum of the numbers is: " + sum + "\n");
                writer.write("The lowest number is: " + lowest + "\n");
                writer.write("The highest number is: " + highest + "\n");
                writer.write("The average of the numbers is: " + average);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
