package com.example.user.bagas132.models;

import java.util.ArrayList;

/**
 * Created by User on 2/21/2019.
 */

public class Contact {

    private String mName;
    private boolean mOnline;

    public Contact(String mName, boolean mOnline) {
        this.mName = mName;
        this.mOnline = mOnline;
    }

    public String getName() {
        return mName;
    }

    public boolean isOnline() {
        return mOnline;
    }

    private static int lastContactId = 0;

    public static ArrayList<Contact> createContactsList(int numContacts) {
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Contact("Person " + ++lastContactId, i <= numContacts / 2));
        }

        return contacts;
    }
}
