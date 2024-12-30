public class Main {
    public static void main(String[] args) {
        PhonebookService phonebookService = new PhonebookService();
        phonebookService.loadContacts();

        // User interaction logic can be added here
        // For example, displaying the menu and handling user input

        // Save contacts before exiting
        phonebookService.saveContacts();
    }
}