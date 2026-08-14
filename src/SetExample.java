import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> students = new HashSet<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Arun");
        students.add("Rahul");

        System.out.println("HashSet: " + students);

        Set<String> students1 = new LinkedHashSet<>();

        students1.add("Rahul");
        students1.add("Priya");
        students1.add("Arun");
        students1.add("Rahul");

        System.out.println("LinkedHashSet: " + students1);
    }
}