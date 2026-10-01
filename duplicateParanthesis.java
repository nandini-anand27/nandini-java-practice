public class duplicateParanthesis {
    public static void main(String[]args){
        String input = "{}{{}}}{{{";
        int balance = 0;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch == '{'){
                balance++;
            }
            else if(ch == '}'){
                balance--;
                if(balance < 0){
                    break;
                }
            }
        }
        if(balance == 0){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
    
}
