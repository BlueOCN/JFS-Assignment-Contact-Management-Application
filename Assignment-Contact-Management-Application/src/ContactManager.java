import java.util.HashMap;

public class ContactManager {
    public static void main(String[] args) {

        ContactDirectory contactDirectory = new ContactDirectory();

        Contact contact1 = new Contact("Diego Martínez", "+52 55-1234-5678", "jason.fernandez82@email.com", "Personal");
        Contact contact2 = new Contact("Sofia González", "+52 81-9876-5432", "maria.gomez47@inbox.net", "Personal");
        Contact contact3 = new Contact("Javier Herrera", "+52 33-4567-8901", "alex.roberts123@fastmail.org", "Professional");
        Contact contact4 = new Contact("Laura Fernández", "+52 442-2345-6789", "samantha.lane78@webmail.co", "Professional");

        // Adding new contacts and displaying them.
        contactDirectory.addContact(contact1);
        contactDirectory.addContact(contact2);
        contactDirectory.addContact(contact3);
        contactDirectory.addContact(contact4);
        contactDirectory.displayContacts();

        // Preventing duplicate contact types from being added.
        contactDirectory.addContactType("Personal");
        contactDirectory.addContactType("Favourite");
        contactDirectory.displayContactTypes();

        // Searching for contacts by name and displaying their information.
        Contact contact = contactDirectory.findContactByName("Diego Martínez");
        contactDirectory.displayContact(contact);

        // Updating a contact’s details and displaying the updated list.
        HashMap<String, String> details = new HashMap<>();
        details.put("name","Armando Martinez");
        details.put("phoneNumber","+52 55-1234-5673");
        details.put("email","armando.martinez@email.com");
        details.put("contactType","Professional");
        updateContact(contact1, details);
        contactDirectory.displayContacts();

        // Sorting the list of contacts by name and displaying them in order.
        sortContacts();
        contactDirectory.displayContacts();
    }

//    public void deleteContact(Contact contact) {}
//    public void addContacts(ArrayList<Contact> contacts) {}
//    public void deleteContacts(ArrayList<Contact> contacts) {}

    // Update contact information and manage the contact list.
    public static void updateContact(Contact contact, HashMap<String, String> contactInformation) {}

    // Sort and display the list of contacts alphabetically
    public static void sortContacts() {}
}