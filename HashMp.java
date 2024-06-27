import java.util.HashMap;
public class HashMp {
    public static void main(String args[]){
        HashMap<String , Integer> info = new HashMap<>();
        info.put("SAHIL",20);
        info.put("VISHWAJEET",22);
        info.put("PINTU",19);
        info.put("AMIT",20);
        System.out.println(info);
        for(String key:info.keySet()){
            System.out.println(key+"="+info.get(key));
        }

        
    }
}
