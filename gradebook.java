import java.util.ArrayList;
import java.util.Scanner;

public class gradebook {
    public static void main(String[] args) {

        int option = 0;
        System.out.println("Welcome To Your Gradebook! Here you can add grades for a single class to see your avergages and potential grades for your class!");
        Scanner userIn = new Scanner(System.in);
        ArrayList <Double> gradeBook = new ArrayList<Double>();

        //menu loop
        while(option!=6) {

            //Print Main Menu
            System.out.println("-------------------------------");
            System.out.println("Please select an option from the list below: ");
            System.out.println("1) Enter Values");
            System.out.println("2) Modify Entries");
            System.out.println("3) Delete Entries");
            System.out.println("4) View Statistics");
            System.out.println("5) View All Entries");
            System.out.println("6) Exit Program");

            //User to Select Option
            option = userIn.nextInt();

            //option 1
            if(option == 1) {
                System.out.println("Please enter grades for your class: ");
                double gradeBookEntry = 0;

                //while loop
                while(true) {
                    gradeBookEntry = userIn.nextDouble();

                    if(gradeBookEntry==-1) {
                        break;
                    }
                    else {
                        gradeBook.add(gradeBookEntry);
                    }
                }
            }

            //option 2
            if(option ==2) {
                System.out.println("Which index would you like to modify? ");
                int index = userIn.nextInt();
                System.out.println("Replace Index:" + index + "Value: " + gradeBook.get(index) + "With what?");
                gradeBook.set(index, userIn.nextDouble());
                System.out.println("Successfully Set");
            }

            //option 3
            if(option==3) {
                System.out.println("Which index would you like to delete? ");
                int index = userIn.nextInt();
                gradeBook.remove(index);
                System.out.println("Removed");
            }

            //option 5
            if(option==5) {
                System.out.println("|Index| Value");
                for (int i = 0; i< gradeBook.size(); i++) {
                    System.out.println("| " + i + " |" + gradeBook.get(i));
                }
            }

            //option 4
            if(option==4) {
                //calculate average
                double total = 0;
                for(int i = 0; i < gradeBook.size(); i++) {
                    total += gradeBook.get(i);
                }
                double average = total/ gradeBook.size();

                System.out.println("Database Statistics: ");
                System.out.println("Average: " + average);

            }

        }

    }
}
