package practice10;

import java.util.Objects;

public class Person {
    private Integer id;
    private String name;
    private int age;

    public Person(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is Tom. I am 21 years old.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getId(), person.getId());
    }

}
