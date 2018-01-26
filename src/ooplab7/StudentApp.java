package ooplab7;

import java.util.Scanner;

public class StudentApp {
    public  static  void  main (String []args){
        //create object as Student
        student s1 =new student ();
        s1.setId("0001");
        s1.setName("Boy Saiyai");
        s1.setPid("1111111111111");
        s1.setAddress("11/11 T.Thamyai A.Thugsong");

        System.out.println(s1.toString());
        student s2 =new student("0002",
                "Girl Saiyai",
                "2222222222222",
                "22/22 T.Thawang A.Muang");
         System.out.println(s2.toString());
        student s3=new student();
        s3=inputData (s3);
        System.out.println(s3.toString());

    }//main
    private static  student inputData(student s){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your student info:");
        System.out.print("Student ID: ");
        s.setId(scanner.nextLine());
        System.out.print("Name: ");
        s.setName(scanner.nextLine());
        System.out.print("Person ID: ");
        s.setPid(scanner.nextLine());
        System.out.print("Address: ");
        s.setAddress(scanner.nextLine());
        return  s;
    }
}//class
