package exp2;

import java.util.*;
public interface Contact {
    void display();
}

class Person implements Contact {
    private String name;
    private int num;

    public Person(String name, int num) {
        super();
        this.name = name;
        this.num = num;
    }

    @Override
    public void display() {
        System.out.println("Person: " + name + ", Number: " + num);
    }
}

class Group implements Contact {
    private List<Contact> contacts = new ArrayList<>();
    private String name;

    public Group(String name) {
        super();
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Group: " + name);
        for (Contact contact : contacts) {
            contact.display();
        }
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }
}
