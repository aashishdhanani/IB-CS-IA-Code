import java.util.ArrayList;
import java.util.Scanner;

public class Course {

    String courseName;
    ArrayList<Category> categories = new ArrayList<Category>();
    Scanner scanner = new Scanner(System.in);

    public Course(String courseName) {

        this.courseName=courseName;

    }

    public String getCourseName() {
        return courseName;
    }


    public void makeCategories(int number) {

        for(int i = 0; i < number; i++) {
            System.out.println("Category Name: ");
            String name= scanner.next();
            System.out.println("Catgory Weight: ");
            Double weight = scanner.nextDouble();

            categories.add(new Category(name, weight));
        }
    }
}

 class Category {

    String name;
    double weight;

    public Category(String name, double weight) {
        this.name = name;
        this.weight=weight;
    }

}
