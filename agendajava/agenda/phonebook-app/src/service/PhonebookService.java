import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PhonebookService {
    private List<Contact> contacts;
    private final String dataFilePath = "data/phonebook.dat";

    public PhonebookService() {
        contacts = new ArrayList<>();
        loadContacts();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        saveContacts();
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
        saveContacts();
    }

    public Contact searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }

    private void loadContacts() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dataFilePath))) {
            contacts = (List<Contact>) ois.readObject();
        } catch (FileNotFoundException e) {
            // File not found, starting with an empty contact list
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void saveContacts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dataFilePath))) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}