package AbstractClassChallenege;

import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil painting",1350,"Impressionistic work"));

        storeProducts.add(new ArtObject("Sculpture",2000,"Bronze work"));

        listProducts();
    }

    public static void listProducts(){
        for(var item : storeProducts){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
}
