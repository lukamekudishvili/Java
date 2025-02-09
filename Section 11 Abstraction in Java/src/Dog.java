public class Dog extends Animal{

    public Dog(String type, String size, double weight){
        super(type,size,weight);
    }
    public void move(String speed){
        if(speed.equals("slow")){
            System.out.println("Walking");
        }else{
            System.out.println("Running");
        }

    }

    public void makeNoise(){
        if(type == "Wolf"){
            System.out.println("Howling!");
        }else{
            System.out.println("Woof!");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
