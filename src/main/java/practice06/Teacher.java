package practice06;

public class Teacher extends Person{
    private Integer klass;

    public Teacher(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Integer getKlass() {
        return klass;
    }

    public String introduce(){
        return getKlass() == null ? super.introduce()+ " I am a Teacher. I teach No Class." : super.introduce()+ " I am a Teacher. I teach Class 2.";
    }
}
