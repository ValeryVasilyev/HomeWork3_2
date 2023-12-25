import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AddressBook {
    private HashMap<String, String> addressBook = new HashMap<>();

    /** Метод добавляет контакт в телефонный справочник */
    public void add(String surname, String phoneNumber) {
        if(addressBook.containsKey(surname) && !addressBook.get(surname).equals(phoneNumber)){
            addressBook.put(surname, addressBook.get(surname) + ", " + phoneNumber);
        }
        else{
            addressBook.put(surname, phoneNumber);
        }
    }

    /** Метод выводит телефон контакта из телефонного справочника,
     * в т.ч. если контакт встречается в справочнике несколько раз */
    public void get(String surname) {
        for (String contact : addressBook.keySet()) {
            if (contact.equals(surname)) {
                System.out.println("Contact: " + surname + " has phone number: " + addressBook.get(surname));
             }
        }

    }
}
