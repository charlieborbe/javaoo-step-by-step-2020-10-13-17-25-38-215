package practice08;

import java.util.Objects;

public class Teacher extends Person{
    Klass klass;

    public Teacher(Integer id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(Integer id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return getKlass().equals(teacher.getKlass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getKlass());
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
