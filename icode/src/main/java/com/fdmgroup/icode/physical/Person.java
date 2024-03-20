package com.fdmgroup.icode.physical;

public class Person {

    // Java Data types
    String string1 = "This is a string";
    int number = 2;
    long number2 = 9384102394L;
    double number3 = 23.4324;
    boolean yesOrNo = true;
    char character = 'A';

    // POJO - their attributes are private
    private String name; 
    private String address; 
    private String contactNumber;
    private int age; 
    // Can Also store user cleated object 
    private Person father;

    public Person() {
    }
    public Person(String name, String address, String contactNumber, int age, Person father) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.age = age;
        this.father = father;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public int getAge() {
        return age;
    }
    public Person getFather() {
        return father;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setFather(Person father) {
        this.father = father;
    }
    @Override
    public String toString() {
        return "Person [character=" + character + ", name=" + name + ", address=" + address + ", contactNumber="
                + contactNumber + ", age=" + age + ", father=" + father + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
        result = prime * result + age;
        result = prime * result + ((father == null) ? 0 : father.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (contactNumber == null) {
            if (other.contactNumber != null)
                return false;
        } else if (!contactNumber.equals(other.contactNumber))
            return false;
        if (age != other.age)
            return false;
        if (father == null) {
            if (other.father != null)
                return false;
        } else if (!father.equals(other.father))
            return false;
        return true;
    }

    
}
