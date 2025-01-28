import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        myNumber = phoneNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contactToAdd){
        int resultIndex=findContact(contactToAdd);
        if(resultIndex==-1){
            myContacts.add(contactToAdd);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldOne,Contact newOne){
        int resultIndex=findContact(oldOne);
        if(resultIndex!=-1){
            myContacts.set(resultIndex,newOne);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contactToRemove){
        int resultIndex=findContact(contactToRemove);
        if(resultIndex!=-1){
            myContacts.remove(resultIndex);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(contact.getName())) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (name.equals(myContacts.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int resultIndex = findContact(name);
        if (resultIndex == -1) {
            return null;
        }
        return myContacts.get(resultIndex);
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            String name=myContacts.get(i).getName();
            String phoneNumber=myContacts.get(i).getPhoneNumber();
            System.out.println((i + 1)+". " + name + " -> "+phoneNumber);
        }
    }


}
