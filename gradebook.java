import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class gradebook {

    public static void main(String[] args) {

        ArrayList<Course> enterClass = new ArrayList<Course>();
        Scanner scanner = new Scanner(System.in);

        //adding courses
        while(true){
            System.out.println("Please enter your courses: ");
            enterClass.add(new Course(scanner.next()));
            double weight1;

            System.out.println("Do you want to add a course yes/no?");
            String answer = scanner.next();


            if (answer.equals("no")){
                System.out.println("You can view your courses in the dashboard");
                break;
            }
        }

        //printing courses
        for(int i = 0; i < enterClass.size(); i++){

            System.out.println(enterClass.get(i).getCourseName());
        }

        //adding categories
        for(int i = 0; i < enterClass.size(); i++){

            System.out.println("How many categories would you like to add for " + enterClass.get(i).getCourseName() + ":");
            enterClass.get(i).makeCategories(scanner.nextInt());
        }

        //printing course name and its category and weight
        for(Course course : enterClass){

            System.out.print(course.getCourseName() + ": ");

            for(Category category: course.categories){
                System.out.print(category.name + " " + "(" + category.weight + ")" + " ");
            }
        }
        
            for(Course course: courses) {
                System.out.println(course.getCourseName() + ":");
            for(Category category : course.categories) {
                System.out.print(category.name + " " + "(" + category.weight + ")" + ": " + "\n" + category.getGrades() + "\n\n");
            }
        }
    }
}
