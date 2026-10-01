import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[]args){
        HashMap<String,Integer> scores = new HashMap<String,Integer>();
        scores.put("sidharth malhotra", 90);
        scores.put("nandini", 100);
        scores.put("rashmi", 99);
        scores.put("rashmi",100);
        System.out.println(scores);

        if(scores.containsKey("rashmi")){
            System.out.println("rashmi is present in the map");
        }
        else{
            System.out.println("rashmi is not present in the map");
        }


    }}