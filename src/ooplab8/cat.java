package ooplab8;

public class cat extends Pet {
    public cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Mueaw Mueaw !!!");
    }
}//class