package practice10;

import java.util.Objects;

public class Klass {
    private Integer number;
    private Student leader;

    public Klass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String assignLeader(Student student){
//        return student.getName().equals("Tom") ?
//                student.introduce()+" I am a Student. I am Leader of Class 2." :
//                student.introduce();
        return student.getKlass() == null ?
                "It is not one of us." : student.introduce();
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }

    public String getDisplayName(){
        return "Class " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Klass)) return false;
        Klass klass = (Klass) o;
        return getNumber().equals(klass.getNumber()) &&
                getLeader().equals(klass.getLeader());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getLeader());
    }
}
