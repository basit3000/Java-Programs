public class CarDemo {
    public static void main(String[] args) {
        Car a = new Car();
        System.out.println("Name of car: "+ a.getName() + " Direction: " + a.getDirection() + " Position: " + a.getPosition());
        a.turn();
        System.out.println("Name of car: "+ a.getName() + " Direction: " + a.getDirection() + " Position: " + a.getPosition());
        a.turn();
        System.out.println("Name of car: "+ a.getName() + " Direction: " + a.getDirection() + " Position: " + a.getPosition());
        a.turn("S");
        a.move(30);
        System.out.println("Name of car: "+ a.getName() + " Direction: " + a.getDirection() + " Position: " + a.getPosition());
    }
}
