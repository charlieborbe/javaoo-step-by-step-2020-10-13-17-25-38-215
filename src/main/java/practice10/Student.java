package practice10;

import java.util.Optional;

public class Student extends Person {
    private Klass klass;

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
        boolean isKlassLeader = this.klass.getLeader() != null;
        return isKlassLeader && this.klass.getLeader().equals(this) ?
                super.introduce() + " I am a Student. I am Leader of " + klass.getDisplayName() + "." :
                super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".";
    }
}
