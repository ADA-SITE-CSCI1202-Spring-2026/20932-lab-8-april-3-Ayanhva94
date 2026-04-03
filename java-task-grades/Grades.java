import java.util.HashMap;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {

        // a)
        Map<String, Double> students = new HashMap<>();

        // b)
        students.put("Ayan", 3.8);
        students.put("Nigar", 3.5);
        students.put("Ali", 4.0);
        students.put("Murad", 2.9);
        students.put("Leyla", 3.2);

        // c)
        double maxGpa = Double.MIN_VALUE;

        for (double gpa : students.values()) {
            if (gpa > maxGpa) {
                maxGpa = gpa;
            }
        }

        System.out.println("Highest GPA: " + maxGpa);

        System.out.print("Top student(s): ");
        for (Map.Entry<String, Double> entry : students.entrySet()) {
            if (entry.getValue() == maxGpa) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();

        // d)
        double sum = 0;
        for (double gpa : students.values()) {
            sum += gpa;
        }

        double average = sum / students.size();
        System.out.println("Average GPA: " + String.format("%.2f", average));

        // e)
        int count = 0;
        for (double gpa : students.values()) {
            if (gpa < average) {
                count++;
            }
        }

        System.out.println("Students below average: " + count);
    }
}