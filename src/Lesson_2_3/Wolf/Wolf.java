package Lesson_2_3.Wolf;

public class Wolf {

    private String sex = "Male";
    private String name = "Chappie";
    private double weight =30.5;
    private int age = 4;
    private String color = "black";

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
    }

    public void walk() {
        System.out.println("Он идёт");
    }

    public void sit() {
        System.out.println("Он сел");
    }

    public void run() {
        System.out.println("Он бежит");
    }

    public String howl() {
        System.out.println("Он воет");
        return "WOOOOOOOOOOOOOO";
    }

    public String hunt() {
        System.out.println("Он охотится");
        return "prey";
    }
}
