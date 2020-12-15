import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<Students>();
        students.add(new Students("mikael"));
        students.add(new Students("matti"));
        students.add(new Students("joel"));

        System.out.println("Students: " + students);
        Collections.sort(students);
        System.out.println("Students: " + students);
    }
}
