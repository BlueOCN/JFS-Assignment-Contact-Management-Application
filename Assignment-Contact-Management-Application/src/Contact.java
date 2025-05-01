import java.util.Objects;
import java.util.UUID;

/**
 * Represents a contact with personal and professional details.
 */
public class Contact {

    /// Unique identifier for each contact, generated automatically.
    private String contactId;

    /// Contact's name
    private String name;

    /// Contact's phone number
    private String phoneNumber;

    /// Contact's email address
    private String email;

    /// Contact type (e.g., "Personal" or "Professional")
    private String contactType;

    /**
     * Default constructor initializes a contact with placeholder values
     * and generates a unique contactId using UUID.
     */
    public Contact(){
        this.contactId = UUID.randomUUID().toString();
        this.name = "name";
        this.phoneNumber = "phoneNumber";
        this.email = "email";
        this.contactType = "contactType";
    }

    /**
     * Parameterized constructor initializes a contact with user-provided details.
     * Generates a unique contactId using UUID.
     *
     * @param name        Contact's name
     * @param phoneNumber Contact's phone number
     * @param email       Contact's email address
     * @param contactType Contact's type (e.g., "Personal" or "Professional")
     */
    public Contact(String name, String phoneNumber, String email, String contactType) {
        this.contactId = UUID.randomUUID().toString();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.contactType = contactType;
    }

    /**
     * Retrieves the contact ID (Not recommended since UUID is auto-generated)
     * @return Unique contact identifier
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the contact ID (Not recommended since UUID is auto-generated)
     * @param contactId Unique identifier for the contact
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * Retrieves the contact name.
     * @return Contact name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the contact name.
     * @param name Contact name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the contact phone number.
     * @return Contact phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the contact phone number.
     * @param phoneNumber Contact phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Retrieves the contact email address.
     * @return Contact email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the contact email address.
     * @param email Contact email address
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retrieves the contact type.
     * @return Contact type (e.g., "Personal" or "Professional")
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * Sets the contact type.
     * @param contactType Type of contact (e.g., "Personal" or "Professional")
     */
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    /**
     * Overrides the equals method to compare contacts based on their attributes.
     * Ensures two contacts are considered equal if they have matching key attributes.
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(phoneNumber, contact.phoneNumber) &&
               Objects.equals(contactId, contact.contactId) &&
               Objects.equals(name, contact.name) &&
               Objects.equals(email, contact.email) &&
               Objects.equals(contactType, contact.contactType);
    }

    /**
     * Overrides hashCode to ensure proper hashing based on key attributes.
     * Helps with performance when using collections like HashMap or HashSet.
     */
    @Override
    public int hashCode() {
        return Objects.hash(contactId, name, phoneNumber, email, contactType);
    }

    /**
     * Provides a readable string representation of the contact object.
     * Useful for debugging and displaying contact details.
     */
    @Override
    public String toString() {
        return "Contact{" +
                "contactId='" + contactId + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", contactType='" + contactType + '\'' +
                '}';
    }
}
