package CodingExercise147AbstractClass;

public class MyLInkedList implements NodeList{
    private ListItem root=null;

    public MyLInkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root==null){
            this.root=item;
            return  true;
        }
        return false;
    }

    @Override
    public void removeItem() {

    }

    @Override
    public void traverse() {

    }
}
