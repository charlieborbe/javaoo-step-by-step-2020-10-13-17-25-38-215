package practice10;

import java.util.LinkedList;

public class Teacher extends Person{
    Klass klass;
    LinkedList<Klass> classes;

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
        String introduceMessage;
        if(getClasses() != null) {
            introduceMessage = super.introduce() + " I am a Teacher. I teach Class 2, 3.";
        }
        else {
            introduceMessage = super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return introduceMessage;
    }

    public String introduceWith(Student student){
        String introduceWithMessage;
        if(getClasses().contains(student.getKlass())){
            introduceWithMessage = super.introduce()+" I am a Teacher. I teach "+student.getName()+"." ;
        }
        else{
            introduceWithMessage = super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }
        return introduceWithMessage;
    }

    public Boolean isTeaching(Student student){
        Boolean isTeachingBool =  getClasses().contains(student.getKlass()) ? Boolean.TRUE : Boolean.FALSE;
        return isTeachingBool;
    }

}
