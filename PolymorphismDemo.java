public class PolymorphismDemo {
    public  static void main(String[]args){
        PolyOverload poly = new PolyOverload();
        poly.welcome();
        poly.welcome("Nandini");
    }
    
}
class PolyOverload{
    public void welcome(){
        System.out.println("Welcome to Java");
    }
    public void welcome(String name){
        System.out.println("Welcome to Java " + name);
    }
}
