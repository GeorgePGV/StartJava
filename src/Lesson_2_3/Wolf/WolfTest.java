package Lesson_2_3.Wolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfGreg = new Wolf();
        wolfGreg.setSex("Female");
        wolfGreg.setName("Gerta");
        wolfGreg.setWeight(25.4);
        wolfGreg.setAge(10);
        wolfGreg.setColor("Gray");
        System.out.println("sex = " + wolfGreg.getSex());
        System.out.println("name = " + wolfGreg.getName());
        System.out.println("weight = " + wolfGreg.getWeight());
        System.out.println("age = " + wolfGreg.getAge());
        System.out.println("color = " + wolfGreg.getColor());
        wolfGreg.walk();
        wolfGreg.sit();
        wolfGreg.run();
        System.out.println(wolfGreg.howl());
        System.out.println(wolfGreg.hunt());
    }
}