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
        String introduce;
        if (getKlass() == null){
            introduce = super.introduce()+ " I am a Teacher. I teach No Class.";
        }
        else {
            introduce = super.introduce()+ " I am a Teacher. I teach Class 2.";
        }
        return introduce;
    }
}
