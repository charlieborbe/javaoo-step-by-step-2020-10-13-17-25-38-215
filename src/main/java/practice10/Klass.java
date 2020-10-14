package practice10;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student){
        if(this.number != student.getKlass().getNumber()) {
            System.out.print("It is not one of us.\n");
        }
        else {
            this.leader = student;
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }

    public String getDisplayName(){
        return "Class " + number;
    }


}
