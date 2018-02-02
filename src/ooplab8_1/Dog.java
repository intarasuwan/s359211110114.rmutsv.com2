package ooplab8_1;
// Dog is a Pet
// Dog is sub-class
// Dog is super-class
public class Dog  extends Pet{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");
    }
}//class
