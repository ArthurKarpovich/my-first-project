package lv.acodemy;

public class IfElse {
    public static void main(String[] args) {

        //IF
        /*
        if(condition) {
        code to be executed
        }
         */

        boolean x = 5 > 2;
        System.out.println(x);

        if (x) {
            System.out.println("yes, 5 is more than 2");
        }

        int number = 21;
        if (number % 2 == 0) {
            System.out.println("Number: " + number + " is even number");
        } else {
            System.out.println("Number: " + number + " is NOT even number");
        }

        boolean isSummer = true;
        if (isSummer) {
            System.out.println("Summer month: June, July, August");
        }

        // IF-ELSE-IF

        /*
        if(condition) {
        code to be executed
        } else ir(condition) {
        code to be executed
        } else {
        code to be executed
        }
         */


        int age = 0;
        if (age <= 17) {
            System.out.println("You are not allowed to buy here!");
        } else if (age <= 0) {
            System.out.println("Who are you!");
        } else {
            System.out.println("Welcome to our shop!");
        }


        // IF John = Hello John!
        // IF Zina = You are welcome!
        // All others = Text

        String name = "Zina";
        if (name.equals("John")) {
            System.out.println("Hello John!");
        } else if (name.equals("Zina")) {
            System.out.println("You are not welcome");
        } else {
            System.out.println("Very interesting name");
        }

        // switch case;

        int currentMonth = 12;
        switch (currentMonth) {
            case 12:
                System.out.println("This is winter!");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("This is spring");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("This is summer");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("This is autumn");
                break;
            default:
                throw new IllegalStateException("Incorrect month value: " + currentMonth);
        }

        // IF student1 = "John" and student2 = "Max"
        // Print: they will work together
        // &&;

        String student1 = "John";
        String student2 = "Anna";
        if (student1.equals("John") && student2.equals("Max")) {
            System.out.println("They will work together");
        }
    }
}
