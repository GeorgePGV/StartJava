package Lesson_2_3.Person;

public class Person {

    String sex = "Male";
    String name = "Ivan";
    double height = 1.86;
    double weight = 76.8;
    int age = 20;

    String speak() {
        System.out.println("Он сказал");
        return "Фраза";
    }
    
    void walk() {
            System.out.println("Он идёт");
    }
    
    void run() {
            System.out.println("Он бежит");
    }
    
    void sit() {
            System.out.println("Он сел");
    }
    
    String studyJava() {
        return "Знания";
    }
}
