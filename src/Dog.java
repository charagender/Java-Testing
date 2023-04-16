public class Dog extends Animal implements IPettable {

    // Class fields
    public static final int dogToHumanYearMultiplier = 7;


/*    Access modifiers: public, protected, private
    * static, final
    * final vars can only be assigned once
    * for static things, it makes it so you can't access them through an object
    * private things can only be accessed inside the class */

    public int getAge() {
        return age;
    }

//    To create a new Object, we need a Custom Constructor
    public Dog(String picture, String name, int age) {
//        'this' refers to the object that is being created
        super(picture, name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " just woofed");
    }

    public int getAgeInHumanYears() {
        return this.age * Dog.dogToHumanYearMultiplier;
    }

    public static void outputDog(Dog dog) {
        System.out.println(dog.name);
        System.out.println(dog.getAge());
    }

    @Override
    public void pet() {
        System.out.println(this.name + " had its belly scratched");
    }
}
