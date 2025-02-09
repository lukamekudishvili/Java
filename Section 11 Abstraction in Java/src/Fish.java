public class Fish extends Animal{

    public Fish(String type, String size, double weight){
        super(type,size,weight);
    }
    public void move(String speed){
        if(speed.equals("slow")){
            System.out.println("lazily swimming");
        }else{
            System.out.println("darting frantically");
        }

    }

    public void makeNoise(){
        if(type == "Goldfish"){
            System.out.println("swish!");
        }else{
            System.out.println("splash!");
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
