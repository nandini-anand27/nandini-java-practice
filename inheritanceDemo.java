public class inheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        dog.breed = "German Shepherd";
        System.out.println("Dog breed is: " + dog.breed);

    }
}

class Dog{
    String name;
    String breed;
    int age;
    void run(){
        System.out.println("Animal is running");
    }
}
