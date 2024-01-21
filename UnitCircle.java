import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Unit circle worksheet problems cuz the pre calc teachers 
 * are making us suffer 
 * @author Mariam Ahmad
 * @since  January 20, 2024
 */

public class UnitCircle {

    public static void main(String[] args) {
        for (int run = 1; run <= 2; run++) { /*Change this value for more worksheets */
            String fileName = "printunitcircle" + run + ".txt";

            try (PrintWriter writer = new PrintWriter(fileName)) {
                writer.println("+-------------+---------------+-----+-----+-----+");
                writer.println("| Rad         | Measure (deg) | Sin | Cos | Tan |");
                writer.println("+-------------+---------------+-----+-----+-----+");

                // arrays for rads and degs
                String[] radians = {"π/6", "π/4", "π/3", "π/2", "2π/3", "3π/4", "5π/6", "π", "7π/6", "5π/4", "4π/3", "3π/2", "5π/3", "7π/4", "11π/6"};
                String[] degrees = {"30", "45", "60", "90", "120", "135", "150", "180", "210", "225", "240", "270", "300", "315", "330"};

                // create a list of indices
                List<Integer> indices = new ArrayList<>();
                for (int i = 0; i < radians.length; i++) {
                    indices.add(i);
                }

                // shuffle the list
                Collections.shuffle(indices);

                // writing to file
                for (int i : indices) {
                    String radString = "";
                    String degreeString = "";

                    if (Math.random() < 0.5) {
                        radString = radians[i];
                    } 
                    else {
                        degreeString = degrees[i];
                    }

                    writer.println(String.format("| %-11s | %-13s |     |     |     |", radString, degreeString));
                    writer.println("+-------------+---------------+-----+-----+-----+");
                }
                writer.println("© by mariam!!");
                System.out.println("Data has been written to " + fileName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
