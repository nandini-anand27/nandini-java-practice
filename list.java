import java.util.LinkedList;
import java.util.Queue;
public class list {
    public static void main(String[] args){
        Queue<String>users = new LinkedList<String>();
        users.offer("sidharth malhotra");
        users.offer("chad michael murray");
        users.offer("katrina kaif");
        users.offer("Fawad Khan`;");

        while(!users.isEmpty()){
            System.out.println(users.poll());
        }

    }
}