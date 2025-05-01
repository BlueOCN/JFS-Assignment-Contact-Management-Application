import java.util.Objects;
import java.util.UUID;

public class Contact {

    private String contactId;
    private String name;
    private String phoneNumber;
    private String email;
    private String contactType;

    public Contact(){
        this.contactId = UUID.randomUUID().toString();
        this.name = "name";
        this.phoneNumber = "phoneNumber";
        this.email = "email";
        this.contactType = "contactType";
    }

    public Contact(String name, String phoneNumber, String email, String contactType) {
        this.contactId = UUID.randomUUID().toString();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.contactType = contactType;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Contact contact)) return false;
        return phoneNumber == contact.phoneNumber && Objects.equals(contactId, contact.contactId) && Objects.equals(name, contact.name) && Objects.equals(email, contact.email) && Objects.equals(contactType, contact.contactType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactId, name, phoneNumber, email, contactType);
    }

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
