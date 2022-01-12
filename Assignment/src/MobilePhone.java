import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact addContact) {
        int index = findContact(addContact);
        if (index >= 0)
            return false;
        else {
            myContacts.add(addContact);
            return true;
        }
    }

    private int findContact(Contact findContact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName() == findContact.getName())
                return i;
        }
        return -1;
    }

    private int findContact(String findName) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName() == findName)
                return i;
        }
        return -1;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index >= 0) {
            myContacts.set(index, newContact);
            return true;
        }
        else
            return false;
    }

    public boolean removeContact(Contact removeContact) {
        return myContacts.remove(removeContact);
    }

    public Contact queryContact(String findName) {
        int index = findContact(findName);
        if (index >= 0)
           return myContacts.get(index);
        else
            return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i+1 + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
