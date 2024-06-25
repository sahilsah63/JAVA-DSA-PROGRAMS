import java.util.LinkedList;
public class LinkList {
    public static void main(String args[]){
        LinkedList<String> name = new LinkedList<>();
        name.add("CAR");
        name.add("BIKE");
        name.add("PHONE");
        name.add("BULLET");
        System.out.println(name);
        //TO REMOVE THE ELEMENT FROM LINKEDLIST.....
        name.remove("PHONE");
        //BELOW LINE IS FOR PRINT ALL ELEMENTS IN NEXT LINE.....
        for(String X : name){
            System.out.println(X);
        }

    }
}
