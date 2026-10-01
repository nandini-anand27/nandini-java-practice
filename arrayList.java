import java.util.ArrayList;
import java.util.LinkedList;
public class arrayList {
    public static void main(String[] args){
        String[] names = new String[10];
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Sidharth Malhotra");
        nameList.add("Chad Michael Murray");
        nameList.add("Katrina Kaif");
        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(34);
        nums.add(34);
        nums.add(34);
        System.out.println(nums);
        System.out.println(nameList.get(1));
        for(int i = 0 ;i < nameList.size(); i++){
            System.out.println(nameList.get(i));
        }
    }
    
}
