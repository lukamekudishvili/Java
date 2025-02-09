public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public abstract void move(String speed);
    public abstract void makeNoise();

    public final String getExplicitType(){
        return this.getClass().getSimpleName() + " (" + type + ")";
    }

}

abstract class Mammal extends Animal{

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    public void move(String speed){
        System.out.println(getExplicitType() + " ");
        System.out.println(speed.equals("slow")?"walks" : "runs");
    }

    public abstract void shedHair();
}
