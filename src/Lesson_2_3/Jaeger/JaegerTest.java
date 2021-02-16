package Lesson_2_3.Jaeger;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();
        Jaeger strikerEureka = new Jaeger();

        gipsyDanger.setName("Gipsy Danger");
        gipsyDanger.setMark("Mark-3");
        gipsyDanger.setHeight(260);
        gipsyDanger.setWeight(1980);
        gipsyDanger.setSpeed(7);
        gipsyDanger.setStrengh(8);
        gipsyDanger.setArmor(6);

        strikerEureka.setName("Striker Eureka");
        strikerEureka.setMark("Mark-5");
        strikerEureka.setHeight(250);
        strikerEureka.setWeight(1850);
        strikerEureka.setSpeed(10);
        strikerEureka.setStrengh(10);
        strikerEureka.setArmor(9);

        strikerEureka.move();

        gipsyDanger.jump();

        gipsyDanger.plasmaCannonShot();

        strikerEureka.chainSwordBlow();

        System.out.println("Gipsy Danger weight = " + gipsyDanger.getWeight());
        gipsyDanger.setWeight(2000);
        System.out.println("Gipsy Danger weight = " + gipsyDanger.getWeight());
        
        System.out.println("Striker Eureka armor = " + strikerEureka.getArmor());
        strikerEureka.setArmor(10);
        System.out.println("Striker Eureka armor = " + strikerEureka.getArmor());
    }
}