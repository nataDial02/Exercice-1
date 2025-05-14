public class Main {
    public static void main(String[] args){
        ContactsManager  myContactsManager = new ContactsManager();

        Contact contact = new Contact();
        contact.name = "sopie";
        contact.phoneNumber = "0170810507";
        myContactsManager.addContact(contact);

        Contact contact1 = new Contact();
        contact1.name = "mariam";
        contact1.phoneNumber = "0748539614";
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.name = "momo ";
        contact2.phoneNumber = "0584203609";
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.name = "jessie";
        contact3.phoneNumber = "0769582031";
        myContactsManager.addContact(contact3);

        Contact phone = myContactsManager.searchContact("jessie");

        System.out.println(phone.phoneNumber);
    }
}