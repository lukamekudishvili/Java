public class Main {
    public static void main(String[] args) {
        var nationalUSParks=new Park[]{
                new Park("Yellowstone", "44.123452, 56.1257323"),
                new Park("Grand Canyon", "21.123452, 36.1257323"),
                new Park("Yosemite", "50.123452, 86.1257323")
        };
        Layer<Park>parkLayer=new Layer<>(nationalUSParks);
        parkLayer.renderLayer();
    }
}
