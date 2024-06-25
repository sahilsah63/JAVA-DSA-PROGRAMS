import java.util.HashSet;
public class Hash {
    public static void main(String args[]){
        HashSet<String> name = new HashSet<>();
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
