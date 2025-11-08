package com.zipcodewilmington.phonebook;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
// import java.util.Iterator;
// import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        this.phonebook = new HashMap<String, List<String>>();
    }

    public void add(String name, String phoneNumber) {
        List<String> numbers = new ArrayList<>();
        numbers.add(phoneNumber);
        this.phonebook.put(name, numbers);
    }

    public void addAll(String name, String... phoneNumbers) {
        List<String> numbers = new ArrayList<>();
        for (String phoneNumber : phoneNumbers) {
            numbers.add(phoneNumber);
        }
        this.phonebook.put(name, numbers);
    }

    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return this.phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return this.phonebook.get(name);
    }
    
    public String reverseLookup(String phoneNumber)  {
        for (Map.Entry<String, List<String>> entry : this.phonebook.entrySet()) {
            List<String> currentList = entry.getValue();
            if (currentList.contains(phoneNumber)) {
                return entry.getKey();
            }
        }
        return "";
    }

    public List<String> getAllContactNames() {
        Set<String> keySet = this.phonebook.keySet();
        List<String> keyList = new ArrayList<>(keySet);

        return keyList;
    }

    public Map<String, List<String>> getMap() {
        return this.phonebook;
    }
}
