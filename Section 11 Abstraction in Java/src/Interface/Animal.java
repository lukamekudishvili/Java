package Interface;

enum FlightStages implements Trackable{GROUNDED,LAUNCH,CRUISE,MDATA_COLLECTION;

    @Override
    public void track() {

    }
}

record DragonFly(String name, String type) implements FlightEnabled{

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}


class Satellite implements OrbitEarth{
    public void achieveOrbit() {
        System.out.println("Orbit Achieved");
    }


    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();
}

interface FlightEnabled{
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES=0.621371;
    public abstract void takeOff();
    abstract void land();
    void fly();

    default FlightStages transition(FlightStages stage){
        System.out.println("transition is not implemented on "+this.getClass().getName());

        return null;
    }
    
}

interface Trackable{
    void track();
}

public abstract class Animal {

    public abstract void move();
}