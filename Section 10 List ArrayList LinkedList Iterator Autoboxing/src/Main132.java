import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "DAIRY",1);
    }
}
public class Main132 {
    public static void main(String[] args) {
        GroceryItem[] groceryArray=new GroceryItem[3];
        groceryArray[0]=new GroceryItem("milk");
        groceryArray[1]=new GroceryItem("Apples", "PRODUCE", 6);
//        groceryArray[2]="5 oranges";
        groceryArray[2]=new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        System.out.println("--------------------------------------------------------");

        ArrayList<GroceryItem> groceryList= new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Bread"));
        groceryList.add(0,new GroceryItem("Milk"));
        System.out.println(groceryList.toString());
        groceryList.set(0,new GroceryItem("Bottle of Water"));
        System.out.println(groceryList.toString());

    }
}
