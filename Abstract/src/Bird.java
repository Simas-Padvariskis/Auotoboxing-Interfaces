public class Bird extends Animal implements FlightEnabled, Trackable{
    @Override
    public void move(){
        System.out.println("Flaps wings");
    }
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    public void track() {
        System.out.println(getClass().getSimpleName() + " coordinates recorded");
    }
}
