package practice10;

import java.util.LinkedList;

public class Teacher extends Person{
    Klass klass;
    LinkedList<Klass> klassLinkedList;

    public Teacher(Integer id, String name, int age, LinkedList<Klass> klassLinkedList) {
        super(id, name, age);
        this.klassLinkedList = klassLinkedList;
    }

    public Klass getKlass() {
        return klass;
    }

    public LinkedList<Klass> getKlassLinkedList() {
        return klassLinkedList;
    }

    public String introduce() {
        return getKlass() == null ?
                super.introduce()+ " I am a Teacher. I teach No Class." :
                super.introduce()+ " I am a Teacher. I teach Class 2.";
    }

    public String introduceWith(Student student){
        return student.getKlass() == getKlass() ?
                super.introduce()+" I am a Teacher. I teach "+student.getName()+"." :
                super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
    }
}
