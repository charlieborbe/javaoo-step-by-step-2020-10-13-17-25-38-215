package practice02;

public class Student extends Person{
    private int Klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        Klass = klass;
    }

    public int getKlass() {
        return Klass;
    }

    @Override
    public String introduce() {
        return "I am a Student. I am at Class 2.";
    }


}
