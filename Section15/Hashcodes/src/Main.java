import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        String s = "hello";
//        String d = new String("hello");
//        String g = "h".concat("ello");
//        System.out.println(s.equals(d));
//        s += "123";
//
//        System.out.println("s: " + s + " " + s.hashCode());
//        System.out.println("d: " + d + " " + d.hashCode());
//        System.out.println("g: " + g + " " + g.hashCode());

        /*-------------------------------------------------*/
        System.out.println("/*-------------------------------------------------*/");

        PlayingCard aceHearts = new PlayingCard("Hearts", "Ace");
        PlayingCard aceHearts2 = new PlayingCard("Hearts", "Ace");
        System.out.println(aceHearts.hashCode());
        System.out.println(aceHearts2.hashCode());
        PlayingCard kingClubs = new PlayingCard("Clubs", "King");
        PlayingCard queenSpades = new PlayingCard("Spades", "Queen");

        List<PlayingCard> cards= Arrays.asList(aceHearts,kingClubs,queenSpades, aceHearts2);
        cards.forEach(e-> System.out.println(e+": "+e.hashCode()));

        Set<PlayingCard> deck=new HashSet<>();
        for(PlayingCard card: cards){
            if(!deck.add(card)){
                System.out.println("Found a duplicate for "+card);
            }
        }
        System.out.println("Set cards: "+deck);
    }
}