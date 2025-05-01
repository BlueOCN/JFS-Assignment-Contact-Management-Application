import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


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


    // Add new contacts to the directory
    public void addContact(Contact contact) {
        if (contactMap.containsKey(contact.getName())) {
            throw new IllegalArgumentException("Name is already taken.");
        }
        else {
            // Add contact to the contact Map
            contactMap.put(contact.getName(), contact);
            // Add contact to the contact List
            this.contactList.add(contact);
        }
    }

    public void displayContacts() {
        System.out.println("-".repeat(165));
        System.out.printf("|  \u001B[1mAll Contacts\u001B[0m%-149s|%n", "");
        System.out.println("-".repeat(165));
        System.out.printf("| %-45s| %-50s| %-36s| %-38s| %-25s|\n",
                "\033[1m" + "Id" + "\033[0m",
                "\033[1m" + "Name" + "\033[0m",
                "\033[1m" + "Phone" + "\033[0m",
                "\033[1m" + "Email" + "\033[0m",
                "\033[1m" + "Type" + "\033[0m");

        // Print table rows
        for (Contact contact : contactList) {
            System.out.printf("| %-37s| %-42s| %-28s| %-30s| %-17s|\n",
                    contact.getContactId(),
                    contact.getName(),
                    contact.getPhoneNumber(),
                    contact.getEmail(),
                    contact.getContactType());
        }
        System.out.println("-".repeat(165));
    }



    public void updateContact(Contact contact) {}

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
