public class Dog {
    String name;
    String color;

    // Parameterized Constructor
    Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        Dog d = new Dog("Tommy", "Black");

        System.out.println("Name: " + d.name);
        System.out.println("Color: " + d.color);
    }
}