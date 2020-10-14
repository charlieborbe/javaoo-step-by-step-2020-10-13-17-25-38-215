package practice10;

public class Student extends Person{
    Klass klass;

    public Student(Integer id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        String messageResult;
        if(klass.getLeader() == null){
            messageResult = super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".";
        }
        else {
            messageResult = klass.getLeader().getName().equals("Tom") ?
                    super.introduce() + " I am a Student. I am Leader of " + klass.getDisplayName() + "." :
                    super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".";
        }
        return messageResult;
    }
}
