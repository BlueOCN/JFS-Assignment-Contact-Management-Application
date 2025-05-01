# JFS-Assignment-Contact-Management-Application

This assignment requires designing a Java-based contact management application using Lists, Sets, and Maps. Users can add, update, and search contacts while ensuring efficient data organization. The main class will demonstrate functionality, including sorting, retrieving, and updating contacts. The project showcases your ability to apply Java Collections Framework concepts in a practical way.

## Assignment Objective:

To apply your understanding of the Java Collections Framework by designing and implementing a small Java application that uses Lists, Sets, and Maps to manage a contact directory. By completing this assignment, you will demonstrate your ability to design and implement a Java application using the Collections Framework, preparing you for more advanced topics and real-world applications. 

Design a contact management application for storing and managing personal and professional contacts. The application should allow users to add, update, and search for contacts using various collection types to organize data efficiently.

## Problem Statement:

Design a contact management application for storing and managing personal and professional contacts. The application should allow users to add, update, and search for contacts using various collection types to organize data efficiently.

---

## Requirements:

### Classes and Collections:

- Create a class Contact with attributes such as contactId, name, phoneNumber, email, and contactType (e.g., “Personal” or “Professional”).
- Create a class ContactDirectory to store and manage contacts, utilizing Lists, Sets, and Maps for different tasks.

### List Implementation:

- Use an ArrayList to store a list of all contacts.
- Implement methods to add new contacts, update existing contacts, and display the list of contacts.
- Provide functionality to sort the contact list by name.

### Set Implementation:

- Use a HashSet to maintain a list of unique contact types (e.g., “Personal” or “Professional”).
- Implement methods to add new contact types and display the list of unique types.
-Demonstrate how sets can help avoid duplicate entries.

### Map Implementation:

- Use a HashMap to organize contacts by name, where the key is the contact name and the value is the Contact object.
- Implement methods to search for a contact by name and retrieve their details.
- Allow users to update contact information using the contact name.

---

## Implementation:

### Write a main class ContactManager with a main method to demonstrate the functionality of your contact management application. Implement methods to:

- Add new contacts to the directory.
- Register and display unique contact types.
- Search for a contact by name and display their details.
- Update contact information and manage the contact list.
- Sort and display the list of contacts alphabetically.

## Sample Output:

### The main method should demonstrate the following scenarios:

- Adding new contacts and displaying them.
- Preventing duplicate contact types from being added.
- Searching for contacts by name and displaying their information.
- Updating a contact’s details and displaying the updated list.
- Sorting the list of contacts by name and displaying them in order.
