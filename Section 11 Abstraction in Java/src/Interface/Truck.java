package Interface;

public class Truck implements Trackable{

    @Override
    public void track() {
        System.out.println(this.getClass().getSimpleName() + "'s coordinates recorded");
    }
}
