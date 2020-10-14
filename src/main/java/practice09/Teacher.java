package practice09;

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
