class INFO<Y,N>{
    public Y NAME;
    public N AGE;
    public Y BIRTHYEAR;
}
public class GenericC {
    public static void main(String args[]){
        INFO<String,Integer> obj = new INFO<>();
        obj.NAME="SAHIL";
        System.out.println(obj.NAME);
        obj.AGE=22;
        System.out.println(obj.AGE);
        obj.BIRTHYEAR="2004";
        System.out.println(obj.BIRTHYEAR);
    }
}
