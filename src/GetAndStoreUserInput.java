import java.util.Scanner;

public class GetAndStoreUserInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the String: ");

        String firstInitial = keyboard.next();

        String lastName = keyboard.next();

        String houseNumber = keyboard.next();

        String streetName = keyboard.next();

        String streetType = keyboard.next();

        String city = keyboard.next();

        keyboard.nextLine();    // end of line reading

        System.out.println(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);

        keyboard.close();

    }   // end of main() method
}   // end of calss
