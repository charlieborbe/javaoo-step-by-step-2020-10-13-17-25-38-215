package practice10;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private Klass klass;
    private LinkedList<Klass> classes;

    public Teacher(Integer id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(Integer id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public String introduce() {
            return getClasses() != null ?
                    super.introduce() + " I am a Teacher. I teach Class "+getClassNumbers()+".":
                    super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        return isTeaching(student) ?
                super.introduce() + " I am a Teacher. I teach " + student.getName() + "." :
                super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public Boolean isTeaching(Student student) {
        return isIn(classes, student);
    }

    private String getClassNumbers(){
        return classes.stream()
                .map(Klass::getNumber)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public Boolean isIn(LinkedList<Klass> linkedList, Student student) {
        return linkedList.contains(student.getKlass());
    }
}
