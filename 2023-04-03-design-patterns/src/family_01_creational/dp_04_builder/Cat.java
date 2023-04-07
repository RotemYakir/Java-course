package family_01_creational.dp_04_builder;

import java.util.Date;

public class Cat {

    private int id;
    private String name;
    private float weight;
    private Date birthday;

    public static Cat yalla(){
        return new Cat();
    }

    public Cat id(int id){
        setId(id);
        return this;
    }

    public Cat name(String name){
        setName(name);
        return this;
    }

    public Cat weight(float weight){
        setWeight(weight);
        return this;
    }

    public Cat birthday(Date birthday){
        setBirthday(birthday);
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", birthday=" + birthday +
                '}';
    }
}
