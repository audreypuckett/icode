package com.fdmgroup.icode.physical;

public class Runner {

    public static void main(String[] args) {
        int number = 7; // Stored directly on the stack -- 7

        Person person = new Person(); // Stored on the heap - -Reference type com.fdmgroup.Person@134891734
        char char1 = person.character;
        person.character = 'B';
        char1 = person.character;
        System.out.println(char1);

        Person personCopy = person.getFather();
        System.out.println(personCopy);

        String name = "Audrey";
        String nameChanged = name.toUpperCase();
        System.out.println(nameChanged);

        System.out.println(createNewPerson());
    }

    private static Person createNewPerson(){
        Person person = new Person();
        person.setName("Michael");
        person.setAge(25);
        person.setContactNumber("123-456-7890");
        person.setAddress("123 Fake Street");
        person.setFather(new Person());
        return person;
    }

}
