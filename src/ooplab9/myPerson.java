package ooplab9;

public class myPerson {
    public static void main(String[] args) {



        Person person = new Person("suttida", 23,
                new Address("505","nakhonsrithammarat","80140"),
                        new Job("receptionist", 2000));
        System.out.println(person.toString());
        //edit data of object
        person.getJob().setSalary(30000);
        System.out.println(person.getJob().getPosition());
        System.out.println(person.getJob().getSalary());
    }
}
