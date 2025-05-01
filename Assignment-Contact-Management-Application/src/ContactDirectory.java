import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Comparator;

/**
 * ContactDirectory manages contacts by storing them in various collections.
 * It supports adding, updating, searching, sorting, and displaying contacts.
 */
public class ContactDirectory {

    /// Stores all contacts as a list for general access and display purposes.
    private ArrayList<Contact> contactList;

    /// Maintains unique contact types (e.g., "Personal" and "Professional").
    private HashSet<String> contactTypesSet;

    /// Maps contact names to Contact objects for quick retrieval.
    private HashMap<String, Contact> contactMap;

    /**
     * Default constructor initializes data structures and sets default contact types.
     */
    ContactDirectory() {
        contactList = new ArrayList<>();
        contactTypesSet = new HashSet<>();
        contactMap = new HashMap<>();

        // Use a HashSet to maintain a list of unique contact types (e.g., “Personal” or “Professional”).
        contactTypesSet.add("Personal");
        contactTypesSet.add("Professional");
    }

    /**
     * Adds a new contact to the directory.
     * Prevents duplicate names using a HashMap for quick lookups.
     *
     * @param contact The contact object to be added.
     * @throws IllegalArgumentException If the contact name is already taken.
     */
    public void addContact(Contact contact) {
        if (this.contactMap.containsKey(contact.getName())) {
            throw new IllegalArgumentException("Name is already taken.");
        }
        else {
            // Add contact to the contact Map
            this.contactMap.put(contact.getName(), contact);
            // Add contact to the contact List
            this.contactList.add(contact);
        }
    }

    /**
     * Finds a contact by name using HashMap lookup.
     *
     * @param contactName The name of the contact to search for.
     * @return The found Contact object.
     * @throws IllegalArgumentException If the contact does not exist.
     */
    public Contact findContactByName(String contactName) {
        if (!this.contactMap.containsKey(contactName)) {
            throw new IllegalArgumentException("Contact does not exist.");
        }
        else {
            return this.contactMap.get(contactName);
        }
    }

    /**
     * Updates a contact's information using the provided name and details.
     *
     * @param contactName        The name of the contact to update.
     * @param contactInformation A map containing updated contact details.
     */
    public void updateContactByName(String contactName, HashMap<String, String> contactInformation) {
        Contact contact = findContactByName(contactName);
        Contact updatedContact = new Contact(contactInformation.get("name"),
                                             contactInformation.get("phoneNumber"),
                                             contactInformation.get("email"),
                                             contactInformation.get("contactType"));

        contactMap.replace(contactName, updatedContact);
        this.contactList.remove(contact);
        this.contactList.add(updatedContact);
    }

    /**
     * Sorts contacts alphabetically by name using Comparator.
     */
    public void sortContactsByName() {
        this.contactList.sort(Comparator.comparing(Contact::getName));
    }

    /**
     * Displays a single contact's details in a structured format.
     *
     * @param contact The contact to display.
     */
    public void displayContact(Contact contact) {
        System.out.println("-".repeat(165));
        System.out.printf("|  \u001B[1m%s\u001B[0m%-147s|%n",contact.getName(), "");
        System.out.println("-".repeat(165));
        System.out.printf("| %-45s| %-46s| %-62s| %-35s|\n",
                "\033[1m" + "Id" + "\033[0m",
                "\033[1m" + "Phone" + "\033[0m",
                "\033[1m" + "Email" + "\033[0m",
                "\033[1m" + "Type" + "\033[0m");

        // Print table rows
        System.out.printf("| %-37s| %-38s| %-54s| %-27s|\n",
                contact.getContactId(),
                contact.getPhoneNumber(),
                contact.getEmail(),
                contact.getContactType());
        System.out.println("-".repeat(165));
    }

    /**
     * Displays all contacts in a formatted table.
     */
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

    /**
     * Adds a new contact type to the directory.
     * Ensures uniqueness using a HashSet.
     *
     * @param newContactType The new contact type to add.
     */
    public void addContactType(String newContactType) {
        // Sets do not take duplicates
        this.contactTypesSet.add(newContactType);
    }

    /**
     * Displays all unique contact types stored in the directory.
     */
    public void displayContactTypes() {
        System.out.println("-".repeat(165));
        System.out.printf("|  \u001B[1mAll Contact Types\u001B[0m%-144s|%n", "");
        System.out.println("-".repeat(165));
        System.out.printf("| %-170s|\n",
                "\033[1m" + "Type" + "\033[0m");

        // Print table rows
        for (String type : this.contactTypesSet) {
            System.out.printf("| %-162s|\n",
                    type);
        }
        System.out.println("-".repeat(165));
    }
}
