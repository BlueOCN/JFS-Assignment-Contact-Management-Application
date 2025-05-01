import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
Create a class ContactDirectory to store and manage contacts, utilizing Lists, Sets, and Maps for different tasks.
 */
public class ContactDirectory {

    // Use an ArrayList to store a list of all contacts.
    private ArrayList<Contact> contactList;
    private HashSet<String> contactTypesSet;
    private HashMap<String, Contact> contactMap;

    ContactDirectory() {
        contactList = new ArrayList<>();
        contactTypesSet = new HashSet<>();
        contactMap = new HashMap<>();

        // Use a HashSet to maintain a list of unique contact types (e.g., “Personal” or “Professional”).
        contactTypesSet.add("Personal");
        contactTypesSet.add("Professional");
    }

    // Implement methods to add new contacts, update existing contacts, and display the list of contacts.
    public void addContact(Contact contact) {}
    public void updateContact(Contact contact) {}
    public void displayContacts() {}

    // Provide functionality to sort the contact list by name.
    public void sortContactsByName() {}

    // Implement methods to add new contact types and display the list of unique types.
    // Demonstrate how sets can help avoid duplicate entries.
    public void addContactType(String contactType) {}
    public void displayContactTypes() {}

    // Implement methods to search for a contact by name and retrieve their details.
    public Contact getContactByName(String contactName) { return null; }
    // Allow users to update contact information using the contact name.
    public void updateContactByName(String contactName, HashMap<String, String> contactInformation) {}

}
