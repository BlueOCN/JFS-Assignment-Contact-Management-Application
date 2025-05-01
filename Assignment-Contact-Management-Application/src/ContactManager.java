import java.util.HashMap;

/**
 * The ContactManager class serves as the entry point for testing
 * the ContactDirectory functionalities, including adding, updating,
 * searching, sorting, and displaying contacts.
 */
public class ContactManager {
    public static void main(String[] args) {

        // Create an instance of ContactDirectory to manage contacts
        ContactDirectory contactDirectory = new ContactDirectory();

        // Creating sample contacts with names, phone numbers, emails, and types
        Contact contact1 = new Contact("Diego Martínez", "+52 55-1234-5678", "jason.fernandez82@email.com", "Personal");
        Contact contact2 = new Contact("Sofia González", "+52 81-9876-5432", "maria.gomez47@inbox.net", "Personal");
        Contact contact3 = new Contact("Javier Herrera", "+52 33-4567-8901", "alex.roberts123@fastmail.org", "Professional");
        Contact contact4 = new Contact("Laura Fernández", "+52 442-2345-6789", "samantha.lane78@webmail.co", "Professional");

        // Adding new contacts to the directory and displaying them
        contactDirectory.addContact(contact1);
        contactDirectory.addContact(contact2);
        contactDirectory.addContact(contact3);
        contactDirectory.addContact(contact4);
        contactDirectory.displayContacts();

        // Preventing duplicate contact types from being added
        contactDirectory.addContactType("Personal");  // Should not be added again
        contactDirectory.addContactType("Favourite"); // Adds a new contact type
        contactDirectory.displayContactTypes();

        // Searching for a contact by name and displaying their details
        Contact contact = contactDirectory.findContactByName("Diego Martínez");
        contactDirectory.displayContact(contact);

        // Updating a contact’s details and displaying the updated list
        HashMap<String, String> details = new HashMap<>();
        details.put("name","Armando Martinez");
        details.put("phoneNumber","+52 55-1234-5673");
        details.put("email","armando.martinez@email.com");
        details.put("contactType","Professional");
        contactDirectory.updateContactByName("Diego Martínez", details);
        contactDirectory.displayContacts();

        // Sorting the list of contacts by name and displaying the sorted list
        contactDirectory.sortContactsByName();
        contactDirectory.displayContacts();
    }

}