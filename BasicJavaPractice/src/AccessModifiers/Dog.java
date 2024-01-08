package AccessModifiers;

public class Dog {
    private String breed;
    //private static String breed = "BULLDOG";
    private int age;
    private String color;

    public Dog() {}

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void barking() {
        System.out.println("Bark");
    }

    void hungry() {
    }

    void sleeping() {
    }


}