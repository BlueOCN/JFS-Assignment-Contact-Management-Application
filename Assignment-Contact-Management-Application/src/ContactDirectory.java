import java.util.*;

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

    public Contact findContactByName(String contactName) {
        if (!this.contactMap.containsKey(contactName)) {
            throw new IllegalArgumentException("Contact does not exist.");
        }
        else {
            return this.contactMap.get(contactName);
        }
    }

    public void updateContactByName(String contactName, HashMap<String, String> contactInformation) {
        Contact contact = findContactByName(contactName);
        Contact updatedContact = new Contact(contactInformation.get("name"), contactInformation.get("phoneNumber"), contactInformation.get("email"), contactInformation.get("contactType"));

        contactMap.replace(contactName, updatedContact);
        this.contactList.remove(contact);
        this.contactList.add(updatedContact);
    }


    public void sortContactsByName() {
        this.contactList.sort(Comparator.comparing(Contact::getName));
    }



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



    public void addContactType(String newContactType) {
        // Sets do not take duplicates
        this.contactTypesSet.add(newContactType);
    }

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

}
