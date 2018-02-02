package ooplab8_1;

public class PersonApp {
    public static void main(String[] args) {

        //create object as student
        Student student = new Student("1111111111111",
                "Boy Saiyai", "109 M.2 Thungsong", "Male", "STD0001",
                "Information System");

        System.out.println(student.toString());
        student.setName("Boy aiyong");
        System.out.println(student.getName());
        System.out.println(student.toString());
    }//main
}//class