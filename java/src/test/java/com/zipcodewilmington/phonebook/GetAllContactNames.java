package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class GetAllContactNames {
    @Test
    public void test1() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String[] names = new String[]{"John", "Joe", "Jim", "Jay"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            phoneBook.add(name, "");
        }

        // when
        List<String> actualNames = phoneBook.getAllContactNames();

        List<String> namesTest = Arrays.asList(names);
        
        Collections.sort(namesTest);
        Collections.sort(actualNames);

        // then
        Assert.assertEquals(namesTest, actualNames);
    }

    @Test
    public void test2() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String[] names = new String[]{"Chris", "Christian", "Christopher", "Christina"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            phoneBook.add(name, "");
        }

        // when
        List<String> actualNames = phoneBook.getAllContactNames();

        List<String> namesTest = Arrays.asList(names);
        
        Collections.sort(namesTest);
        Collections.sort(actualNames);

        // then
        Assert.assertEquals(namesTest, actualNames);
    }

    @Test
    public void test3() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String[] names = new String[]{"Ashley", "Aaron", "Albert", "Alfred"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            phoneBook.add(name, "");
        }

        // when
        List<String> actualNames = phoneBook.getAllContactNames();

        List<String> namesTest = Arrays.asList(names);
        
        Collections.sort(namesTest);
        Collections.sort(actualNames);

        // then
        Assert.assertEquals(namesTest, actualNames);
    }
}
