package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    private String myNumber;
    private List<Contact> myContacts;

    // TESTLERİN BEKLEDİĞİ CONSTRUCTOR (2 parametreli)
    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    // Ek olarak kullanılabilir tek parametreli constructor
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

    // ---- diğer metodlar aynı kalacak ----
}
