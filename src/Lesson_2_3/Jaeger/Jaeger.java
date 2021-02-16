package Lesson_2_3.Jaeger;

public class Jaeger {
    private String name;
    private String mark;
    private int height;
    private int weight;
    private int speed;
    private int strengh;
    private int armor;

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrengh() {
        return strengh;
    }

    public void setStrengh(int strengh) {
        this.strengh = strengh;
    }

    public int getArmor() {
        return armor;
    }
    
    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void move() {
        System.out.println("He made 1 step");
    }

    public void jump() {
        System.out.println("He made a jump");
    }

    public boolean plasmaCannonShot() {
        System.out.println("Plasma cannon shot");
        System.out.println("Hitting the target");
        return true;
    }
    
    public String chainSwordBlow() {
        System.out.println("He struck out with his sword");
        return "Miss";
    }
}