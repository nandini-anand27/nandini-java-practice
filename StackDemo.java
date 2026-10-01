import java.util.LinkedList;
public class StackDemo {
    public static void main(String[]args){
        LinkedList<String> bucket = new LinkedList<String>();
        bucket.push("sidharth malhotra");
        bucket.push("chad michael murray");
        bucket.push("katrina kaif");
        bucket.push("Fawad Khan");
        bucket.push("nandini");

        while(!bucket.isEmpty()){
            System.out.println(bucket.pop());
        }

    }

    
}