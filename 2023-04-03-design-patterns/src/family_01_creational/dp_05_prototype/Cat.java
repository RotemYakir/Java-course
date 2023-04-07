package family_01_creational.dp_05_prototype;

public class Cat {

    private int id;
    private String name;

    public Cat(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Cat(Cat other) {
        this.id = other.id;
        this.name = other.name;
    }

    @Override
    protected Cat clone() {
        return new Cat(this);
    }
}