package ooplap8;

public class Person {
    protected String personID;
    protected String name;
    protected String address;
    protected System gender;
    //constructor

    public Person(String personID, String name, String address, String gender) {
        this.personID = personID;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                '}';
    }
    //getter and setter methods

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public System getGender() {
        return gender;
    }

    public void setGender(System gender) {
        this.gender = gender;
    }
}//class
