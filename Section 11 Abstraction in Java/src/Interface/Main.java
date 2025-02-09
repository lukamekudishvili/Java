package Interface;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bird bird= new Bird();
        Animal animal=bird;
        FlightEnabled flier=bird;
        Trackable tracked = bird;

//        animal.move();
////        flier.move();
//        bird.move();
////        tracked.move();
//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        bird.track();
//        flier.land();

        inFlight(flier);
        inFlight(new Jet());

        Trackable truck= new Truck();
        truck.track();

        double kmsTraveled=100;
        double milesTraveled=kmsTraveled*FlightEnabled.KM_TO_MILES;
        System.out.println(milesTraveled);

        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);
    }

    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }
}
