// we cannot create objects inside abstract classes
public abstract class Animal {
    public String picture;
    protected String name;
    protected int age;

    public Animal(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    public void Birthday() {
        this.age++;
    }

//    abstract methods force each class to implement the method to inherit from the Class
    public abstract void makeSound();
}
