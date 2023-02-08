import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    ContactBook contactBook = new ContactBook();

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = "qq";
        while (!main.isExit(input = main.printMenuAndScanInput(scanner))) {
            switch (input) {
                case "1":
                    main.insertContact(scanner);
                    break;
                case "2":
                    main.searchContact(scanner);
                    break;
                case "qq":
                    main.printMenu();
                    break;
            }
        }
    }

    private String printMenuAndScanInput(Scanner scanner) {
        this.printMenu();
        String input = scanner.nextLine();
        return input;
    }

    private void searchContact(Scanner scanner) {
        System.out.println(" - Please enter name or number or email: ");
        String searchParam = scanner.nextLine();
        List<Contact> result = contactBook.search(searchParam);

        if (result.size() == 0) {
            System.out.println("There is no record for your search");
            return;
        }
        System.out.println("We found " + result.size() + " results :)");
        for (int i = 0; i < result.size(); i++) {
            System.out.println("Result number " + (i+1) + ":\n\t" + result.get(i));
        }
    }

    public void insertContact(Scanner scanner) {
        printBackNote();
        System.out.print("- Insert contact name: ");
        String input = scanner.nextLine();
        if(isBack(input))
            return;
        String name = input;
        System.out.print("- Insert Phone number: ");
        input = scanner.nextLine();
        if(isBack(input))
            return;
        String phone = input;
        System.out.print("- Insert email address: ");
        if(isBack(input = scanner.nextLine()))
            return;
        String email = input;
        contactBook.add(new Contact(name, Arrays.asList(phone), Arrays.asList(email)));
        System.out.println("Contact successfully added.");
    }

    private void printBackNote() {
        System.out.println("< Insert \"bb\" to go Back >");
    }

    private void printExitNote() {
        System.out.println("\t \"ee\" => Exit");
    }

    public boolean isExit(String input) {
        return input.equalsIgnoreCase("ee");
    }

    public boolean isBack(String input) {
        return input.equalsIgnoreCase("bb");
    }


    public void printMenu() {
        System.out.println("\n --- <Select one of options> --- ");
        System.out.println("\t 1 => Insert new contact");
        System.out.println("\t 2 => Search a contact");
        printExitNote();
    }

}
